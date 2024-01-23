package com.quid.start.router.application.usecase

import com.quid.start.router.domain.Ip
import com.quid.start.router.domain.Network
import com.quid.start.router.domain.Router

interface CreateNetwork {
    fun createNetwork(router: Router, ip: Ip, name: String, cidr: Int): Network

    class CreateNetworkUseCase : CreateNetwork {
        override fun createNetwork(router: Router, ip: Ip, name: String, cidr: Int): Network =
            router.createNetwork(ip, name, cidr)
    }
}