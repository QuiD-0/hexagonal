package com.quid.start.router.usecase

import com.quid.start.router.domain.Router

interface RouterListOutPort {
    fun fetchRouters(): List<Router>
}