package com.quid.start.router

import com.quid.start.router.application.RouterViewUseCase
import com.quid.start.router.application.RouterViewUseCase.RouterViewInputPort
import com.quid.start.router.domain.Router

class RouterViewCLIAdaptor(
    private val routerViewUseCase: RouterViewUseCase = RouterViewInputPort(RouterViewFileAdaptor())
) {

    fun obtainRelatedRouters(type: String): List<Router> {
        return routerViewUseCase.getRouters(
            outer.filterRouterByType(type)
        )
    }
}