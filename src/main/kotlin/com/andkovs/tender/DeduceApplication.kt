package com.andkovs.tender

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration

@Configuration
@SpringBootApplication
class DeduceApplication

fun main(args: Array<String>) {
    SpringApplication.run(DeduceApplication::class.java, *args)
}
