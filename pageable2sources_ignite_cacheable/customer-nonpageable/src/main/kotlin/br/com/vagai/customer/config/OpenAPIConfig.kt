package br.com.vagai.customer.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springdoc.core.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenAPIConfig {

    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
                .info(Info().title("Customer without pageable feature.").version("0.0.1-SNAPSHOT"))
                .apply { }
    }

    @Bean
    fun customerDashboardApi(): GroupedOpenApi {
        val paths = arrayOf("/*/rest/**")
        return GroupedOpenApi.builder()
                .setGroup("customer")
                .pathsToMatch(*paths)
                .build()
    }
}