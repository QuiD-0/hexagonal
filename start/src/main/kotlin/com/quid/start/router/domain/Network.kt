package com.quid.start.router.domain

data class Network(
    val address: Ip,
    val name: String,
    val cidr: Int
) {
    init{
        require(cidr in 1..32) { "Invalid CIDR" }
    }
}