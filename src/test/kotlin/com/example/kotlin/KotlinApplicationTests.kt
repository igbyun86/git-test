package com.example.kotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KotlinApplicationTests {

    @Test
    fun contextLoads() {

        var items = listOf<String>("aaa", "bbb", "ccc")
        var index = 0
        for (item in items) {
            println("item is $item")
        }

    }

}
