package br.com.dalhkedu.services

import br.com.dalhkedu.entities.CustomerEntity

interface ICustomerService {

    fun findById(id: Long): CustomerEntity

    fun findAll(): List<CustomerEntity>

    fun findByName(fullName: String): CustomerEntity
}