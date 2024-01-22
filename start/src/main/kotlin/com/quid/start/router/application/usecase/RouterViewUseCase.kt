package com.quid.start.router.application.usecase

import com.quid.start.router.application.port.out.RouterViewOutputPort
import com.quid.start.router.domain.Router
import com.quid.start.router.domain.RouterSearch
import java.util.function.Predicate

interface RouterViewUseCase {
    fun getRouters(filter: Predicate<Router>): List<Router>

    class RouterViewInputPort(
        private val routerViewOutputPort: RouterViewOutputPort
    ) : RouterViewUseCase {
        override fun getRouters(filter: Predicate<Router>): List<Router> =
            routerViewOutputPort.fetchRouters()
                .let { RouterSearch.retrieveRouter(it, filter) }
    }
}