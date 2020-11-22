package com.hex.shopping.web

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.reactivex.Single

@Client("/")
interface HelloClient {

    @Get("/hello/{name}")
    @Consumes(MediaType.APPLICATION_JSON)
    fun hello(name : String): Single<String>
}