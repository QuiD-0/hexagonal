package com.quid.start.router.adapter.`in`

import com.quid.start.router.adapter.out.CreateRouterMockAdapter
import com.quid.start.router.application.port.`in`.CreateRouterInputPort
import com.quid.start.router.application.usecase.CreateRouter

class CreateRouterWebAdapter(
    private val createRouter: CreateRouter = CreateRouter.CreateRouterUseCase(CreateRouterMockAdapter())
): CreateRouterInputPort {
    override fun createRouter() {
        createRouter.createRouter()
    }
}