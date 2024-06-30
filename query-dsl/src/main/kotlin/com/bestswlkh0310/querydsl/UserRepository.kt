package com.bestswlkh0310.querydsl

interface UserRepository {
    fun getAll(): List<UserEntity>
}