package br.com.vagai.customer.service.impl

import br.com.vagai.customer.dto.CountryDto
import br.com.vagai.customer.mapper.CountryMapper
import br.com.vagai.customer.repository.CountryRepository
import br.com.vagai.customer.service.CountryService
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class CountryServiceImpl(val countryRepository: CountryRepository,
                         val countryMapper: CountryMapper) : CountryService {

    override fun findByCountryCode(countryCode: String): CountryDto = countryRepository.findByCountryCode(countryCode)
            ?.let { return countryMapper.countryToCountryDto(it) } ?: throw EntityNotFoundException("Country not found")

}