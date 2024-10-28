package com.yebali.template

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EcsExampleApplication

fun main(args: Array<String>) {
    runApplication<EcsExampleApplication>(*args)
}
