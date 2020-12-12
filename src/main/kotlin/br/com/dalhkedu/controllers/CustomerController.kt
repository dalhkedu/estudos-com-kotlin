package br.com.dalhkedu.controllers

import br.com.dalhkedu.presenters.CustomerPresenter
import br.com.dalhkedu.presenters.data.Presenter
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping(value = ["/customers"])
class CustomerController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun findCustomer(): Presenter<CustomerPresenter> {
        return Presenter(CustomerPresenter(
                "Eduardo",
                "Lopes",
                "eduardo.lopes@original.com.br",
                LocalDate.of(1988, 2, 13)));
    }
}