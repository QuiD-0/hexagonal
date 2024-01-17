package com.quid.start.router.domain

import java.util.function.Predicate

class RouterSearch{
    companion object{
        fun retrieveRouter(routers: List<Router>, predicate: Predicate<Router>): List<Router> =
            routers.filter { predicate.test(it) }
    }
}
