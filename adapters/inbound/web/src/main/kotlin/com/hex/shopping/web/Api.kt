package com.hex.shopping.web

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Produces


object Api {

    object Greeting {
        @Controller("/")
        interface GreetingApi {
            @Get("/hello/{name}")
            @Produces(MediaType.APPLICATION_JSON)
            suspend fun greet(@PathVariable("name") name : String) : HttpResponse<String>
        }
    }

    object Shop {
        @Controller("/")
        interface ShopApi {
            @Get("/shop/name")
            @Produces(MediaType.APPLICATION_JSON)
            suspend fun shopName() : HttpResponse<String>
        }
    }

}