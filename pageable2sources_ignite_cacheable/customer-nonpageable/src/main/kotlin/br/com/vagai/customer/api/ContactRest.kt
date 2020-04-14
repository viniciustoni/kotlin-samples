package br.com.vagai.customer.api

import br.com.vagai.customer.dto.ContactDto
import br.com.vagai.customer.service.ContactService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(CONTACT_BASE_ENDPOINT)
class ContactRest(val contactService: ContactService) {

    @GetMapping(path = [FIND_CONTACT_BY_CLIENT_ID], produces = [APPLICATION_JSON_VALUE])
    fun findByClientId(@PathVariable("clientId") clientId: Long): ResponseEntity<List<ContactDto>> =
            ResponseEntity(contactService.findByClientId(clientId), HttpStatus.FOUND)

    @PostMapping(produces = [APPLICATION_JSON_VALUE], consumes = [APPLICATION_JSON_VALUE])
    fun saveContact(@RequestBody contactDto: ContactDto): ResponseEntity<ContactDto> =
            ResponseEntity(contactService.saveContact(contactDto), HttpStatus.OK)

}