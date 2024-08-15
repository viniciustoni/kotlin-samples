package com.vagai.dao

import com.vagai.entity.Client
import io.agroal.api.AgroalDataSource
import jakarta.enterprise.context.ApplicationScoped
import java.time.ZoneOffset

@ApplicationScoped
class ClientDao(val datasource: AgroalDataSource) {

    private val SELECT_CLIENT_BY_ID = """
            SELECT id, name, created_on 
              FROM client 
             WHERE id = ?
            """

    // use function is similar to try-catch with resources
    fun save(client: Client) = datasource.connection.use { conn ->
        val preparedStatement = conn.prepareStatement("INSERT INTO client(name) VALUES (?)")
        preparedStatement.setString(1, client.name)
        preparedStatement.execute()
    }

    fun findById(id: Long): Client = datasource.connection.use { conn ->
        val preparedStatement = conn.prepareStatement(SELECT_CLIENT_BY_ID)
        preparedStatement.setLong(1, id)

        val resultSet = preparedStatement.executeQuery()
        if (resultSet.next()) {
            return Client(
                    resultSet.getLong("id"),
                    resultSet.getString("name"),
                    resultSet.getTimestamp("created_on").toLocalDateTime().atZone(ZoneOffset.UTC))
        } else {
            throw RuntimeException("Client not found")
        }
    }
}