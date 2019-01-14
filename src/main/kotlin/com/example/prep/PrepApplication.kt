package com.example.prep

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrepApplication

fun main(args: Array<String>) {
    runApplication<PrepApplication>(*args)
}
