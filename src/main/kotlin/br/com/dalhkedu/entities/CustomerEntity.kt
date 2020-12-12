package br.com.dalhkedu.entities

import java.time.LocalDate
import java.time.LocalDateTime

class CustomerEntity {

    val firstName: String
    private val lastName: String
    private val email: String
    private val birthday: LocalDate
    private val created: LocalDateTime
    private val updated: LocalDateTime

    constructor(firstName: String, lastName: String, email: String, birthday: LocalDate, created: LocalDateTime) {
        this.firstName = firstName
        this.lastName = lastName
        this.email = email
        this.birthday = birthday
        this.created = created
        this.updated = LocalDateTime.now();
    }

}