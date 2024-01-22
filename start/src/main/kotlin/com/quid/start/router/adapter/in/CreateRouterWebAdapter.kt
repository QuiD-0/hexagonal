package com.quid.start.router.adapter.`in`

import com.quid.start.router.adapter.out.CreateRouterMockAdapter
import com.quid.start.router.application.usecase.CreateRouter
import com.quid.start.router.domain.Router

class CreateRouterWebAdapter(
    private val createRouter: CreateRouter = CreateRouter.CreateRouterUseCase(CreateRouterMockAdapter())
): CreateRouter {
    override fun createRouter(): Router =
        createRouter.createRouter()
}