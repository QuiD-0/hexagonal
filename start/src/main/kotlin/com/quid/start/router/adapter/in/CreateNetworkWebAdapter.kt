package com.quid.start.router.adapter.`in`

import com.quid.start.router.application.usecase.CreateNetwork
import com.quid.start.router.domain.Ip
import com.quid.start.router.domain.Router

class CreateNetworkWebAdapter(
    private val createNetwork: CreateNetwork
) {

    fun createNetwork(router: Router, ip: Ip, name: String, cidr: Int) =
        createNetwork.createNetwork(router, ip, name, cidr)
}