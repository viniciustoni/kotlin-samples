package br.com.vagai.customer.api

import br.com.vagai.customer.dto.ClientDto
import br.com.vagai.customer.service.ClientService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ClientRest(val clientService: ClientService) {

    @GetMapping(path = [CLIENTS_BASE_ENDPOINT], produces = [APPLICATION_JSON_VALUE])
    fun findAll(): ResponseEntity<List<ClientDto>> = ResponseEntity(clientService.findAll(), HttpStatus.FOUND)

}