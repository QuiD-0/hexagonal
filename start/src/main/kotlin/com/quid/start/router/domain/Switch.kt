package com.quid.start.router.domain

import com.quid.start.router.domain.type.SwitchType
import java.util.*

data class Switch(
    val type: SwitchType,
    val id: SwitchId = SwitchId(),
    val networks: List<Network> = emptyList(),
    val address: Ip,
){

    fun addNetwork(network: Network): Switch {
        return copy(networks = networks.plus(network))
    }

    fun findNetwork(addr: Ip): Boolean = networks.any { it.address == addr }

    data class SwitchId(
        val value: UUID = UUID.randomUUID())
}
