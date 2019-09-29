package io.github.yassinefarich.productsms.controllers

import io.github.yassinefarich.productsms.beans.Product
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class ProductController {

    data class Response(val products: List<Product>,
                        val currentTimestamp: LocalDateTime = LocalDateTime.now())

    @GetMapping("/")
    fun getAllProducts(): Response =
            Response(listOf(Product(name = "Lenovo", price = 500.4),
                    Product(name = "Dell", price = 700.4),
                    Product(name = "Sony", price = 300.0),
                    Product(name = "Toshiba", price = 150.4)
            ))

}