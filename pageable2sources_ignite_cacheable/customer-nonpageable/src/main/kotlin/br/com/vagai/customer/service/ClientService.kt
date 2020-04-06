package br.com.vagai.customer.service

import br.com.vagai.customer.dto.ClientDto

interface ClientService {

    fun findAll(): List<ClientDto>

}