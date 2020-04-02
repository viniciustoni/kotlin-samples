package br.com.vagai.customer.entity

import br.com.vagai.customer.entity.enumerated.AddressType
import javax.persistence.*
import javax.persistence.EnumType.STRING
import javax.persistence.FetchType.LAZY
import javax.persistence.GenerationType.SEQUENCE

@Entity
@Table(name = "ADDRESS")
@SequenceGenerator(name = "ADDRESS_SEQ", sequenceName = "ADDRESS_SEQ", allocationSize = 1)
class Address(
        @Id
        @GeneratedValue(generator = "ADDRESS_SEQ", strategy = SEQUENCE)
        @Column(name = "ID", nullable = false)
        var id: Long,

        @Enumerated(STRING)
        @Column(name = "TYPE", nullable = false)
        var type: AddressType,
        var address: String?,
        var number: String?,
        var complement: String?,
        var city: String?,
        var zipCode: String?,

        @ManyToOne(fetch = LAZY)
        @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "ID", updatable = false, insertable = false)
        var country: Country?,

        @ManyToOne(fetch = LAZY)
        @JoinColumn(name = "CLIENT_ID", referencedColumnName = "ID", updatable = false, insertable = false, nullable = false)
        var client: Client)