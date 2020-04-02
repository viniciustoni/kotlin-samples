package br.com.vagai.customer.entity

import javax.persistence.*
import javax.persistence.GenerationType.SEQUENCE

@Entity
@Table(name = "COUNTRY")
@SequenceGenerator(name = "COUNTRY_SEQ", sequenceName = "COUNTRY_SEQ", allocationSize = 1)
class Country(
        @Id
        @GeneratedValue(generator = "COUNTRY_SEQ", strategy = SEQUENCE)
        @Column(name = "ID", nullable = false)
        var id: Long,

        @Column(name = "NAME", nullable = false, unique = true)
        var name: String,

        @Column(name = "COUNTRY_CODE", nullable = false, unique = true)
        var countryCode: String,

        @Column(name = "PHONE_CODE", nullable = false, unique = true)
        var phoneCode: String)