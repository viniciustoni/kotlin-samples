package br.com.vagai.customer.api

import br.com.vagai.customer.dto.CountryDto
import br.com.vagai.customer.service.CountryService
import org.springframework.http.HttpStatus.FOUND
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(COUNTRY_BASE_ENDPOINT)
class CountryRest(val countryService: CountryService) {

    @GetMapping(produces = [APPLICATION_JSON_VALUE])
    fun findByNameAndCountryCode(@RequestParam("countryCode") countryName: String): ResponseEntity<CountryDto> =
            ResponseEntity(countryService.findByCountryCode(countryName), FOUND)

}