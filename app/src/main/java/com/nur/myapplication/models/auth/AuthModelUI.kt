package com.nur.myapplication.models.auth

import com.nur.domain.models.auth.AuthModel

data class AuthModelUI(
    val grant_type: String = "password",
    val email: String,
    val password: String
)

fun AuthModel.toUI(): AuthModelUI = AuthModelUI(
    grant_type, email, password
)
