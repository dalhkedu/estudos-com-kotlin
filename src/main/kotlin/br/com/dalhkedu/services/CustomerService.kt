package br.com.dalhkedu.services

import br.com.dalhkedu.entities.CustomerEntity
import java.time.LocalDate
import java.time.LocalDateTime

class CustomerService : ICustomerService {

    override fun findById(id: Long): CustomerEntity {
        return CustomerEntity(
                "Eduardo",
                "Lopes",
                "eduardo.lopes@original.com.br",
                LocalDate.of(1988, 2, 13),
                LocalDateTime.now());
    }

    override fun findAll(): List<CustomerEntity> {
        TODO("Not yet implemented")
    }

    override fun findByName(fullName: String): CustomerEntity {
        TODO("Not yet implemented")
    }
}