package br.com.vagai.customer.service.impl

import br.com.vagai.customer.dto.ContactDto
import br.com.vagai.customer.mapper.ContactMapper
import br.com.vagai.customer.repository.ContactRepository
import br.com.vagai.customer.service.ContactService
import org.springframework.stereotype.Service
import java.util.stream.Collectors.toList
import javax.persistence.EntityNotFoundException

@Service
class ContactServiceImpl(val contactRepository: ContactRepository,
                         val contactMapper: ContactMapper) : ContactService {

    override fun findByClientId(clientId: Long): List<ContactDto> = contactRepository.findByClientId(clientId)
            .stream()
            .map { contactMapper.contactToContactDto(it) }
            .collect(toList()) ?: throw EntityNotFoundException("Contact not found")

    override fun saveContact(contactDto: ContactDto): ContactDto {
        val contact = contactRepository.save(contactMapper.contactDtoToContact(contactDto))
        return contactMapper.contactToContactDto(contact)
    }
}