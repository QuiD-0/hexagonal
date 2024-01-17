package com.quid.start.router.adapter

import com.quid.start.router.application.port.RouterViewOutputPort
import com.quid.start.router.domain.Router
import com.quid.start.router.domain.RouterType.CORE
import com.quid.start.router.domain.RouterType.EDGE

class RouterViewFileAdapter : RouterViewOutputPort {
    override fun fetchRouters(): List<Router> = mockRouters()

    private fun mockRouters(): List<Router> =
        listOf(Router(CORE), Router(EDGE), Router(EDGE), Router(EDGE), Router(EDGE))
}