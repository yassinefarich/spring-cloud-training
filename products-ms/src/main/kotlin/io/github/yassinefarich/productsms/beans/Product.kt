package io.github.yassinefarich.productsms.beans

import java.util.*

data class Product(val uuid: UUID = UUID.randomUUID(),
                   val name: String,
                   val type: String = "Electronics",
                   val price: Double)