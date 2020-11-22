package com.hex.shopping

import assertk.assertThat
import assertk.assertions.isEqualTo
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
private class StarterTest {

    @Inject
    lateinit var application: EmbeddedApplication<*>

    @Test
    fun testItWorks() {
        assertThat(application.isRunning).isEqualTo(true)
    }
}