package br.com.dalhkedu.controllers

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@ExtendWith(SpringExtension::class)
@ActiveProfiles(value = ["test"])
@WebMvcTest
@AutoConfigureMockMvc
class CustomerControllerTest {

    private val customersEndpoint: String = "/customers";

    @Autowired
    private lateinit var mvc: MockMvc;

    @Test
    @DisplayName("Faz consulta de usuário na base")
    fun findCustomer() {
        val request: MockHttpServletRequestBuilder = MockMvcRequestBuilders
                .get(customersEndpoint)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)

        mvc.perform(request)
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.jsonPath("data").isNotEmpty);
    }
}