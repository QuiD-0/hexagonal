package com.quid.start.router.usecase

import com.quid.start.router.domain.Router
import java.util.function.Predicate

interface RouterViewUseCase {
    fun getRouters(filter: Predicate<Router>): List<Router>

    class RouterViewInputPort(
        private val routerListOutPort: RouterListOutPort
    ) : RouterViewUseCase {
        override fun getRouters(filter: Predicate<Router>): List<Router> =
            routerListOutPort.fetchRouters()
                .let { Router.retrieveRouter(it, filter) }
    }
}