package com.quid.start.router.domain

import java.util.*
import java.util.function.Predicate

data class Router(
    val routerType: RouterType,
    val id: UUID = UUID.randomUUID(),
) {
    companion object {

        fun filterByType(routerType: RouterType): Predicate<Router> {
            return if (routerType == RouterType.EDGE) {
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
