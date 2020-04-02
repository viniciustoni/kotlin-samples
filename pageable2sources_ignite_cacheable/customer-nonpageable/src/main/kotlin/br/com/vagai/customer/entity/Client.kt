package br.com.vagai.customer.entity

import java.time.LocalDate
import javax.persistence.*
import javax.persistence.FetchType.LAZY
import javax.persistence.GenerationType.SEQUENCE

@Entity
@Table(name = "CLIENT")
@SequenceGenerator(name = "CLIENT_SEQ", sequenceName = "CLIENT_SEQ", allocationSize = 1)
class Client(
        @Id
        @GeneratedValue(generator = "CLIENT_SEQ", strategy = SEQUENCE)
        @Column(name = "ID", nullable = false)
        var id: Long,

        @Column(name = "NAME", nullable = false)
        var name: String,

        @Column(name = "ACTIVE", nullable = false)
        var active: Boolean,
        var birth: LocalDate?,

        @ManyToOne(fetch = LAZY)
        @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "ID", updatable = false, insertable = false)
        var country: Country?)