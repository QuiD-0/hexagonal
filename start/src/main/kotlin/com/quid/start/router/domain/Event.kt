package com.quid.start.router.domain

import java.time.OffsetDateTime
import java.util.UUID

data class Event(
    private val id: UUID = UUID.randomUUID(),
    private val offsetDateTime: OffsetDateTime,
    private val protocol: String,
    private val activity: String,
)
