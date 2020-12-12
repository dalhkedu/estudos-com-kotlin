package br.com.dalhkedu.parameters

import java.time.LocalDate

class CustomerParameter {

    private val firstName: String;
    private val lastName: String;
    private val email: String;
    private val birthday: LocalDate;

    constructor(firstName: String, lastName: String, email: String, birthday: LocalDate) {
        this.firstName = firstName
        this.lastName = lastName
        this.email = email
        this.birthday = birthday
    }
}