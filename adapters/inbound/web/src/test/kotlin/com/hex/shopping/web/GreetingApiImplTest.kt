package com.hex.shopping.web

import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class GreetingApiImplTest {

    @Inject
    @field:Client("/")
    lateinit var client: HttpClient

    @Test
    fun testHelloWorldResponse() = runBlocking<Unit> {
        //Given
        val name = "Aditya"
        //When
        val rsp: String = client.toBlocking().retrieve("/hello/$name")
        //Then
        assertEquals(rsp, "Hello $name")
    }


}