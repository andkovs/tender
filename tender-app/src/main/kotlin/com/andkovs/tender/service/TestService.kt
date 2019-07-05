package com.andkovs.tender.service

import com.andkovs.tender.model.TestPO
import com.andkovs.tender.repository.TestRepository
import org.springframework.stereotype.Service

@Service
class TestService(private val testRepository: TestRepository) {

    fun allTests(): Iterable<TestPO> {
        return testRepository.findAll()
    }
}