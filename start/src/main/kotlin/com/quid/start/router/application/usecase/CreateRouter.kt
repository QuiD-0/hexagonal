package com.quid.start.router.application.usecase

import com.quid.start.router.application.port.out.CreateRouterOutputPort
import com.quid.start.router.domain.Router

interface CreateRouter {
    fun createRouter(): Router

    class CreateRouterUseCase(
        private val createRouterOutputPort: CreateRouterOutputPort
    ) : CreateRouter {
        override fun createRouter(): Router =
            createRouterOutputPort.createRouter()
    }
}