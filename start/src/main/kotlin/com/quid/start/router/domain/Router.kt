package com.quid.start.router.domain

import java.util.UUID
import java.util.function.Predicate

data class Router(
    val routerType: RouterType,
    val id: UUID = UUID.randomUUID(),
){
    companion object {
        fun retrieveRouter(routers: List<Router>, predicate: Predicate<Router>): List<Router> =
            routers.filter{ predicate.test(it) }

        fun filterByType(routerType: RouterType): Predicate<Router> {
            return if(routerType == RouterType.EDGE){
                isEdge()
            } else {
                isCore()
            }
        }

        private fun isEdge(): Predicate<Router> {
            return Predicate { it.routerType == RouterType.EDGE }
        }

        private fun isCore(): Predicate<Router> {
            return Predicate { it.routerType == RouterType.CORE }
        }
    }
}
