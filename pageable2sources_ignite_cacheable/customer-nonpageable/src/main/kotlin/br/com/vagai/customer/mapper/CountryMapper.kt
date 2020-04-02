package br.com.vagai.customer.mapper

import br.com.vagai.customer.dto.CountryDto
import br.com.vagai.customer.entity.Country
import org.springframework.stereotype.Component

@Component
class CountryMapper {
    fun countryToCountryDto(country: Country): CountryDto = CountryDto(country.id, country.name, country.countryCode, country.phoneCode)

    fun countryDtoToCountry(countryDto: CountryDto): Country = Country(countryDto.id, countryDto.name, countryDto.contryCode, countryDto.phoneCode)
}