package br.com.vagai.customer.service

import br.com.vagai.customer.dto.ContactDto

interface ContactService {

    fun findByClientId(clientId: Long): List<ContactDto>
}