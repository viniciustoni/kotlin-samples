package br.com.vagai.customer.service.impl

import br.com.vagai.customer.dto.ClientDto
import br.com.vagai.customer.mapper.ClientMapper
import br.com.vagai.customer.repository.ClientRepository
import br.com.vagai.customer.service.ClientService
import org.springframework.stereotype.Service

@Service
class ClientServiceImpl(val clientRepository: ClientRepository,
                        val clientMapper: ClientMapper) : ClientService {

    override fun findAll(): List<ClientDto> = clientRepository.findAll()
            .map { clientMapper.clientToClientDto(it) }
}