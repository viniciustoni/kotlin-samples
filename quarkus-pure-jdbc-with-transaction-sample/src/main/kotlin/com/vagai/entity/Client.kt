package com.vagai.entity

import java.time.ZonedDateTime

data class Client(
        var id: Long?,
        var name: String?,
        var createdOn: ZonedDateTime
)
