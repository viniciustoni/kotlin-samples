package com.vagai.domain.client

import com.vagai.dao.ClientDao
import com.vagai.domain.client.dto.ClientDto
import com.vagai.entity.Client
import jakarta.enterprise.context.ApplicationScoped
import jakarta.transaction.Transactional
import java.time.ZonedDateTime

@ApplicationScoped
class ClientService(val clientDao: ClientDao) {

    /**
     * It'll save the client under a transaction. It should save it properly
     */
    @Transactional
    fun saveClient(clientDto: ClientDto) = clientDao.save(Client(null, clientDto.name, ZonedDateTime.now()))

    /**
     * It'll try save the client under a transaction. However, it'll throw a runtime exception
     * after save which will rollback the transaction.
     *
     * If you want to see the affect of the transaction on it, just comment the @Transaction annotation, and run again.
     * It'll save the client even with the exception
     */
    @Transactional
    fun saveClientError(clientDto: ClientDto) {
        clientDao.save(Client(null, clientDto.name, ZonedDateTime.now()))
        throw RuntimeException("Error")
    }

    /**
     * Find a client by ID.
     */
    fun findClientById(id: Long): ClientDto {
        val client = clientDao.findById(id)
        return ClientDto(client.id, client.name!!, client.createdOn)
    }
}