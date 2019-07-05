package com.andkovs.tender

import com.andkovs.tender.configuration.DatasourceProperties
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration
import org.flywaydb.core.Flyway
import org.springframework.context.annotation.Bean

@Configuration
@SpringBootApplication
class TenderApplication

fun main(args: Array<String>) {
    SpringApplication.run(TenderApplication::class.java, *args)
}

@Bean
fun datasourceProperties(): DatasourceProperties {
    return DatasourceProperties()
}

@Bean(initMethod = "migrate")
fun flyway(): Flyway {
    val properties = datasourceProperties()
    val flyway = Flyway()
    flyway.isBaselineOnMigrate = true
    flyway.setDataSource(properties.url, properties.username, properties.password)
    return flyway
}