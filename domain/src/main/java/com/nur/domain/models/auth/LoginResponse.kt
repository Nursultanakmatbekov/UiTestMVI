package com.nur.domain.models.auth

data class LoginResponse(
    val access_token: String,
    val token_type: String,
    val expires_in: Int,
    val refresh_token: String,
    val scope: String,
    val created_at: Int
)