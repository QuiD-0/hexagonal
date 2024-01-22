package com.quid.start.router.adapter.out

import com.quid.start.router.application.port.out.RouterViewOutputPort
import com.quid.start.router.domain.Router
import com.quid.start.router.domain.type.RouterType.CORE
import com.quid.start.router.domain.type.RouterType.EDGE

class RouterViewFileAdapter : RouterViewOutputPort {
    override fun fetchRouters(): List<Router> = mockRouters()

    private fun mockRouters(): List<Router> =
        listOf(Router(CORE), Router(EDGE), Router(EDGE), Router(EDGE), Router(EDGE))
}