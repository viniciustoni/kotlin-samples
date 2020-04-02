package br.com.vagai.customer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CustomerNopageableApplication

fun main(args: Array<String>) {
    runApplication<CustomerNopageableApplication>(*args)
}
