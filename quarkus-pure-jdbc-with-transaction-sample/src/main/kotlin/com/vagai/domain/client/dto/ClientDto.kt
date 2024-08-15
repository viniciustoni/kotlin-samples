package com.vagai.domain.client.dto

import com.vagai.serializer.KZonedDateTimeSerializer
import kotlinx.serialization.Serializable
import java.time.ZonedDateTime

@Serializable
data class ClientDto(
        var id: Long? = null,
        val name: String,
        @Serializable(with = KZonedDateTimeSerializer::class)
        var createdOn: ZonedDateTime? = null
)
