package br.com.vagai.customer.mapper

import br.com.vagai.customer.dto.ContactDto
import br.com.vagai.customer.entity.Contact
import org.springframework.stereotype.Component

@Component
class ContactMapper(val clientMapper: ClientMapper,
                    val countryMapper: CountryMapper) {

    fun contactToContactDto(contact: Contact): ContactDto = ContactDto(
            contact.id,
            contact.type,
            contact.contactValue,
            contact.phoneNumber,
            contact.extension,
            contact.country?.let { countryMapper.countryToCountryDto(it) },
            clientMapper.clientToClientDto(contact.client))

    fun contactDtoToContact(contactDto: ContactDto): Contact = Contact(
            contactDto.id,
            contactDto.type,
            contactDto.contactValue,
            contactDto.phoneNumber,
            contactDto.extension,
            contactDto.countryDto?.let { countryMapper.countryDtoToCountry(it) },
            clientMapper.clientDtoToClient(contactDto.clientDto))
}