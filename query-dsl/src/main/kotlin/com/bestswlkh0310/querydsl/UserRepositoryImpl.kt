package com.bestswlkh0310.querydsl

import com.querydsl.core.types.Projections
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Repository
import com.bestswlkh0310.querydsl.QUserEntity.userEntity

@Repository
class UserRepositoryImpl(
    private val queryFactory: JPAQueryFactory
) : UserRepository {

    override fun getAll(): List<UserEntity> =
        queryFactory.select(userProjection)
            .from(userEntity)
            .orderBy(userEntity.username.desc())
            .fetch()

    private val userProjection =
        Projections.constructor(
            UserEntity::class.java,
            userEntity.id,
            userEntity.username,
            userEntity.password,
        )
}