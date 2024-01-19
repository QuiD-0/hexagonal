package com.quid.start.router.domain

import com.quid.start.router.domain.type.RouterType
import java.util.*
import java.util.function.Predicate

data class Router(
    val routerType: RouterType,
    val id: RouterId = RouterId(),
    val networkSwitch: Switch? = null,
) {
    companion object {

        fun filterByType(routerType: RouterType): Predicate<Router> {
            return if (routerType == RouterType.EDGE) {
                isEdge()
            } else {
                isCore()
            }
        }

        private fun isEdge(): Predicate<Router> {
            return Predicate { it.routerType == RouterType.EDGE }
        }

        private fun isCore(): Predicate<Router> {
            return Predicate { it.routerType == RouterType.CORE }
        }
    }

    fun createNetwork(addr: Ip, name: String, cidr: Int): Network {
        require(networkSwitch != null) { "Router is not connected to a switch" }
        takeIf { networkSwitch.findNetwork(addr) }
            ?.run { throw IllegalStateException("Network already exists") }
            ?: return Network(addr, name, cidr)
    }

    fun addNetwork(network: Network) {
        networkSwitch?.addNetwork(network)
            ?: throw IllegalStateException("Router is not connected to a switch")
    }

    fun retrieveNetwork(): List<Network> = networkSwitch?.networks ?: emptyList()

    data class RouterId(val id: UUID = UUID.randomUUID())
}
