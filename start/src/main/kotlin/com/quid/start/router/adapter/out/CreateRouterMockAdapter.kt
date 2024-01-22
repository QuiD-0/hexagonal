package com.quid.start.router.adapter.out

import com.quid.start.router.application.port.out.CreateRouterOutputPort
import com.quid.start.router.domain.Router
import com.quid.start.router.domain.type.RouterType.CORE

class CreateRouterMockAdapter: CreateRouterOutputPort {
    override fun createRouter(): Router {
        return Router(CORE)
    }
}