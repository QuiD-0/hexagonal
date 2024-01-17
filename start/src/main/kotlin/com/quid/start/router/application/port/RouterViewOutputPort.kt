package com.quid.start.router.application.port

import com.quid.start.router.domain.Router

interface RouterViewOutputPort {
    fun fetchRouters(): List<Router>
}