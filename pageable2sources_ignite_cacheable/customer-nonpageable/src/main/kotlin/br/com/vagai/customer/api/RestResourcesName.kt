package br.com.vagai.customer.api

const val API_V1 = "/v1"
const val BASE_REST_ENDPOINT = "$API_V1/rest"

const val COUNTRY_BASE_ENDPOINT = "$BASE_REST_ENDPOINT/country"

const val CLIENT_BASE_ENDPOINT = "$BASE_REST_ENDPOINT/client"
const val CLIENTS_BASE_ENDPOINT = "$BASE_REST_ENDPOINT/clients"

const val CONTACT_BASE_ENDPOINT = "$BASE_REST_ENDPOINT/contact"
const val FIND_CONTACT_BY_CLIENT_ID = "/client-id/{clientId}"
