package com.quid.start.router.domain

import java.time.OffsetDateTime
import java.util.*

data class Event(
    private val id: UUID = UUID.randomUUID(),
    private val offsetDateTime: OffsetDateTime,
    private val protocol: String,
    private val activity: Activity,
) {
    constructor(
        offsetDateTime: OffsetDateTime,
        protocol: String,
        activity: String
    ) : this(offsetDateTime = offsetDateTime, protocol = protocol, activity = Activity(activity))
}
