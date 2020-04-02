package br.com.vagai.customer.mapper

import br.com.vagai.customer.dto.AddressDto
import br.com.vagai.customer.entity.Address
import org.springframework.stereotype.Component


@Component
class AddressMapper(val clientMapper: ClientMapper,
                    val countryMapper: CountryMapper) {


    fun addressToAddressDto(address: Address): AddressDto = AddressDto(
            address.id,
            address.type,
            address.address,
            address.number,
            address.complement,
            address.city,
            address.zipCode,
            address.country?.let { countryMapper.countryToCountryDto(it) },
            clientMapper.clientToClientDto(address.client))


    fun addressDtoToAddress(addressDto: AddressDto): Address = Address(
            addressDto.id,
            addressDto.type,
            addressDto.address,
            addressDto.number,
            addressDto.complement,
            addressDto.city,
            addressDto.zipCode,
            addressDto.countryDto?.let { countryMapper.countryDtoToCountry(it) },
            clientMapper.clientDtoToClient(addressDto.clientDto))
}