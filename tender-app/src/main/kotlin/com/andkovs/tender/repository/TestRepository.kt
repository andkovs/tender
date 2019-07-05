package com.andkovs.tender.repository

import com.andkovs.tender.model.TestPO
import org.springframework.data.repository.CrudRepository

interface TestRepository: CrudRepository<TestPO, Long> {
}