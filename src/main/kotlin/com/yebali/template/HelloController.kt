package com.yebali.template

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/hello")
    fun hello(): String = "Hello, World!"

    @GetMapping("/hello2")
    fun hello2(): String = "Hello, World! 2"
}
