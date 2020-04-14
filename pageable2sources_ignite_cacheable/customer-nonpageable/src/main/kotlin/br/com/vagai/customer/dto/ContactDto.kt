package br.com.vagai.customer.dto

import br.com.vagai.customer.entity.enumerated.ContactType

class ContactDto(
        var id: Long,
        var type: ContactType,
        var contactValue: String?,
        var phoneNumber: Long?,
        var extension: Int?,
        var countryDto: CountryDto?,
        var clientDto: ClientDto)