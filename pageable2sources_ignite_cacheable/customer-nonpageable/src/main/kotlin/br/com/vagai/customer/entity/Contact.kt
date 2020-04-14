package br.com.vagai.customer.entity

import br.com.vagai.customer.entity.enumerated.ContactType
import javax.persistence.*
import javax.persistence.EnumType.STRING
import javax.persistence.FetchType.LAZY
import javax.persistence.GenerationType.SEQUENCE

@Entity
@Table(name = "CONTACT")
@SequenceGenerator(name = "CONTACT_SEQ", sequenceName = "CONTACT_SEQ", allocationSize = 1)
class Contact(
        @Id
        @GeneratedValue(generator = "CONTACT_SEQ", strategy = SEQUENCE)
        @Column(name = "ID", nullable = false)
        var id: Long,

        @Enumerated(STRING)
        @Column(name = "TYPE", nullable = false)
        var type: ContactType,
        var contactValue: String?,
        var phoneNumber: Long?,
        var extension: Int?,

        @ManyToOne(fetch = LAZY)
        @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "ID", updatable = true, insertable = true)
        var country: Country?,

        @ManyToOne(fetch = LAZY)
        @JoinColumn(name = "CLIENT_ID", referencedColumnName = "ID", updatable = true, insertable = true, nullable = false)
        var client: Client)