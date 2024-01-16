package com.quid.start.router

import com.quid.start.router.application.RouterViewUseCase
import com.quid.start.router.application.RouterViewUseCase.RouterViewInputPort
import com.quid.start.router.domain.Router
import com.quid.start.router.domain.RouterType

class RouterViewCLIAdaptor(
    private val routerViewUseCase: RouterViewUseCase = RouterViewInputPort(RouterViewFileAdaptor())
) {

    fun obtainRelatedRouters(type: String): List<Router> =
        routerViewUseCase.getRouters(Router.filterByType(RouterType.valueOf(type)))
}