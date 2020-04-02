package br.com.vagai.customer.mapper

import br.com.vagai.customer.dto.ClientDto
import br.com.vagai.customer.entity.Client
import org.springframework.stereotype.Component

@Component
class ClientMapper(val countryMapper: CountryMapper) {

    fun clientDtoToClient(clientDto: ClientDto): Client = Client(
            clientDto.id,
            clientDto.name,
            clientDto.active,
            clientDto.birth,
            clientDto.countryDto?.let { countryMapper.countryDtoToCountry(it) })


    fun clientToClientDto(client: Client): ClientDto = ClientDto(
            client.id,
            client.name,
            client.active,
            client.birth,
            client.country?.let { countryMapper.countryToCountryDto(it) })
}