package com.hex.shopping.domain

import com.hex.shopping.domain.ports.Shop
import javax.inject.Singleton

@Singleton
class ShopImpl : Shop {
    override val name: String
        get() = "Top Shop"
}