package br.com.vagai.customer.dto

import br.com.vagai.customer.entity.enumerated.ContactType

class ContactDto(
        var id: Long,
        var type: ContactType,
        var contactValue: String?,
        var phoneNumber: String?,
        var extension: String?,
        var countryDto: CountryDto?,
        var clientDto: ClientDto)