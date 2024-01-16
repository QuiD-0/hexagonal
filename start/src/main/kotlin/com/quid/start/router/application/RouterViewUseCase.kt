package com.quid.start.router.application

import com.quid.start.router.application.port.RouterViewOutputPort
import com.quid.start.router.domain.Router
import java.util.function.Predicate

interface RouterViewUseCase {
    fun getRouters(filter: Predicate<Router>): List<Router>

    class RouterViewInputPort(
        private val routerViewOutputPort: RouterViewOutputPort
    ) : RouterViewUseCase {
        override fun getRouters(filter: Predicate<Router>): List<Router> =
            routerViewOutputPort.fetchRouters()
                .let { Router.retrieveRouter(it, filter) }
    }
}