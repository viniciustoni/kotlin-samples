package br.com.vagai.customer.dto

import br.com.vagai.customer.entity.enumerated.AddressType

class AddressDto(
        var id: Long,
        var type: AddressType,
        var address: String?,
        var number: String?,
        var complement: String?,
        var city: String?,
        var zipCode: String?,
        var countryDto: CountryDto?,
        var clientDto: ClientDto)