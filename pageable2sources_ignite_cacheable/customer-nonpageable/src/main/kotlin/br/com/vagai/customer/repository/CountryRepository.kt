package br.com.vagai.customer.repository

import br.com.vagai.customer.entity.Country
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CountryRepository : CrudRepository<Country, Long> {

    fun findByCountryCode(countryCode: String) : Country?

}