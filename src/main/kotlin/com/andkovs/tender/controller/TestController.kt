package com.andkovs.tender.controller

import com.andkovs.tender.model.TestPO
import com.andkovs.tender.service.TestService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = arrayOf("http://localhost:8080"))
@RestController
@RequestMapping("/api")
class TestController(private val testService: TestService) {

    @GetMapping("/test")
    fun allTests(): Iterable<TestPO> {
        return testService.allTests()
    }
}