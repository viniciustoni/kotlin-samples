package br.com.vagai.customer.repository

import br.com.vagai.customer.entity.Client
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository : CrudRepository<Client, Long>