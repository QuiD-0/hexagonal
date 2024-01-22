package com.quid.start.router.application.port.out

import com.quid.start.router.domain.Router

interface CreateRouterOutputPort {
    fun createRouter(): Router
}