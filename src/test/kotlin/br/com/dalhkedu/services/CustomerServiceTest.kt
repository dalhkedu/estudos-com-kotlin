package br.com.dalhkedu.services

import br.com.dalhkedu.entities.CustomerEntity
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit.jupiter.SpringExtension
import java.time.LocalDate
import java.time.LocalDateTime

@ExtendWith(SpringExtension::class)
@ActiveProfiles(value = ["test"])
class CustomerServiceTest {

    private lateinit var service: ICustomerService;

    @BeforeEach
    fun setUp() {
        service = CustomerService()
    }

    @Test
    @DisplayName("Deve buscar dados do cliente pelo ID")
    fun findById() {
        val customer = CustomerEntity(
                "Eduardo",
                "Lopes",
                "eduardo.lopes@original.com.br",
                LocalDate.of(1988, 2, 13),
                LocalDateTime.now());

        val result = service.findById(Mockito.anyLong());

        assertThat(result.firstName).isEqualTo(customer.firstName)
    }

}