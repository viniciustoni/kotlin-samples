package com.vagai

import com.vagai.domain.client.ClientService
import com.vagai.domain.client.dto.ClientDto
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import org.jboss.resteasy.reactive.RestPath

@Path("/client")
class ClientResource(val clientService: ClientService) {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun saveClient(clientDto: ClientDto) = clientService.saveClient(clientDto)

    @POST
    @Path("/error")
    @Consumes(MediaType.APPLICATION_JSON)
    fun saveClientError(clientDto: ClientDto) = clientService.saveClientError(clientDto)

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun findClientById(@RestPath id : Long) = clientService.findClientById(id)
}