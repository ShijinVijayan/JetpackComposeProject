package com.example.myproject.ui.view.loginScreen

import com.google.firebase.auth.AuthResult

data class GoogleLoginState(
    val success: AuthResult? = null,
    val loading: Boolean = false,
    val error: String = ""
)
