package com.andkovs.tender.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "test")
data class TestPO(
        @Id
        @Column(name = "id")
        val id: Long,

        @Column(name = "title")
        val title: String
)
