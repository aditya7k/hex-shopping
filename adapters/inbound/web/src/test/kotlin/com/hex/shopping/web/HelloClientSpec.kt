package com.hex.shopping.web

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class HelloClientSpec {

    @Inject
    lateinit var client: HelloClient

    @Test
    fun testHelloWorldResponse() {
        //Given
        val name :  String = "Aditya"
        //When
        val blockingGet = client.hello(name).blockingGet();
        //Then
        assertEquals("Hello $name", blockingGet)
    }
}