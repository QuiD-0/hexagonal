package com.quid.start.router.domain

data class Activity(
    val description: String
){
    val srcHost: String
        get() = description.split(">")[0]
    val dstHost: String
        get() = description.split(">")[1]

}
