package br.com.vagai.customer.repository

import br.com.vagai.customer.entity.Contact
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ContactRepository : CrudRepository<Contact, Long> {

    fun findByClientId(clientId: Long): List<Contact>
}