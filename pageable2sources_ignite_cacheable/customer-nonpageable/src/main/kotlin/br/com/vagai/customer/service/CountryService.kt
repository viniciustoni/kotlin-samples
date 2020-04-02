package br.com.vagai.customer.service

import br.com.vagai.customer.dto.CountryDto

interface CountryService {

    fun findByCountryCode(countryCode: String): CountryDto

}