package com.andkovs.tender.configuration

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "spring.datasource", ignoreUnknownFields = false)
class DatasourceProperties {

    val url: String? = null
    val username: String? = null
    val password: String? = null
    val driverClassName: String? = null
}