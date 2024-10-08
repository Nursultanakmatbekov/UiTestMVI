package com.nur.data.network.dtos.auth

import com.nur.domain.models.auth.AuthModel
import com.google.gson.annotations.SerializedName

data class AuthModelDto(
    @SerializedName("grant_type")
    val grant_type: String = "password",
    @SerializedName("username")
    val email: String,
    @SerializedName("password")
    val password: String
)

fun AuthModelDto.toDomain(): AuthModel = AuthModel(
    grant_type, email, password
)
