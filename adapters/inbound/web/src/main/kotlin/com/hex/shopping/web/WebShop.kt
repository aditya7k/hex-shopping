package com.hex.shopping.web

import com.hex.shopping.domain.ports.Shop
import io.micronaut.http.HttpResponse

class WebShop(val shop : Shop) : Api.Shop.ShopApi {
    override suspend fun shopName(): HttpResponse<String> =  HttpResponse.ok(shop.name)
}