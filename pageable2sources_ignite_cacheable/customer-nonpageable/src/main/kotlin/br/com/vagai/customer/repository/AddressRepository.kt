package br.com.vagai.customer.repository

import br.com.vagai.customer.entity.Address
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AddressRepository : CrudRepository<Address, Long>