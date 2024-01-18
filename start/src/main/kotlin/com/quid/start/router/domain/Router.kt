package com.quid.start.router.domain

import com.quid.start.router.domain.type.RouterType
import java.util.*
import java.util.function.Predicate

data class Router(
    val routerType: RouterType,
    val id: RouterId = RouterId()
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

    data class RouterId(val id: UUID = UUID.randomUUID())
}
