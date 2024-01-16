package com.quid.start.router.adapter

import com.quid.start.router.application.RouterViewUseCase
import com.quid.start.router.application.RouterViewUseCase.RouterViewInputPort
import com.quid.start.router.domain.Router
import com.quid.start.router.domain.RouterType

class RouterViewCLIAdapter(
    private val routerViewUseCase: RouterViewUseCase = RouterViewInputPort(RouterViewFileAdapter())
) {

    fun obtainRelatedRouters(type: String): List<Router> =
        routerViewUseCase.getRouters(Router.filterByType(RouterType.valueOf(type)))
}