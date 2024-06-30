package com.bestswlkh0310.querydsl

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user")
class UserController(
    private val userRepository: UserRepository
) {

    @GetMapping
    fun getAll() =
        userRepository.getAll()
            .let { ResponseEntity.ok(it) }

}