package com.hex.shopping.web

import io.micronaut.http.HttpResponse

class GreetingApiImpl : Api.Greeting.GreetingApi {
    override suspend fun greet(name: String): HttpResponse<String> {
        return HttpResponse.ok("Hello $name")
    }
}