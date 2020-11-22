package com.hex.shopping

import assertk.assertThat
import com.hex.shopping.domain.ShopImpl
import org.junit.jupiter.api.Test

class ShopImplTest {

    @Test
    fun `The shop name should be as specified`() {
        val shopName = "A Shop Name"
        val shop = ShopImpl(shopName);
        assertThat(shop.name).equals(shopName)
    }

}