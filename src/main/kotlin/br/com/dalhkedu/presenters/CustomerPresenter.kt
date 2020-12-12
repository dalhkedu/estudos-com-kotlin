package br.com.dalhkedu.presenters

import java.time.LocalDate

class CustomerPresenter {

    private val firstName: String;
    private val lastName: String;
    private val email: String;
    private val birthday: LocalDate;

    constructor(firstName: String, lastName: String, email: String, birthday: LocalDate) {
        this.birthday = birthday
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    fun fullName(): String = firstName.plus(" ").plus(lastName)

    fun ages(): Int = LocalDate.now().compareTo(birthday)
}