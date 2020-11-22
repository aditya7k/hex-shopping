package com.hex.shopping

import io.micronaut.runtime.Micronaut.*

private const val ROOT_PACKAGE = "com.hex.shopping"

object Starter {
    @JvmStatic
    fun main(vararg args: String) {
        build().args(*args).packages(ROOT_PACKAGE).mainClass(Starter.javaClass).start()
    }
}