package com.quid.start.router.domain

import com.quid.start.router.domain.type.Protocol

data class Ip(
    val address: String,
){
    val protocol: Protocol
        get() = when {
            address.length == 39 -> Protocol.IPV6
            else -> Protocol.IPV4
        }
}
