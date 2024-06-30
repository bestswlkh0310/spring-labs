package com.bestswlkh0310.querydsl

import jakarta.persistence.*

@Entity
@Table(name = "user")
class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(nullable = false)
    val username: String,

    @Column(nullable = false)
    val password: String
)
