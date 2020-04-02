package br.com.vagai.customer.dto

import java.time.LocalDate

class ClientDto(
        var id: Long,
        var name: String,
        var active: Boolean,
        var birth: LocalDate?,
        var countryDto: CountryDto?)