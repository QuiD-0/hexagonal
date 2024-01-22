package com.quid.start.router.adapter.`in`

import com.quid.start.router.adapter.out.RouterViewFileAdapter
import com.quid.start.router.application.usecase.RouterViewUseCase
import com.quid.start.router.application.usecase.RouterViewUseCase.RouterViewInputPort
import com.quid.start.router.domain.Router
import com.quid.start.router.domain.type.RouterType

class RouterViewCLIAdapter(
    private val routerViewUseCase: RouterViewUseCase = RouterViewInputPort(RouterViewFileAdapter())
) {

    fun obtainRelatedRouters(type: String): List<Router> =
        routerViewUseCase.getRouters(Router.filterByType(RouterType.valueOf(type)))
}