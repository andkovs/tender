package com.andkovs.tender.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = arrayOf("http://localhost:8081"))
@Controller
class IndexController {

    @GetMapping("/")
    fun index(): String {
        return "index.html"
    }
}