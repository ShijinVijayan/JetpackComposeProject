package com.example.myproject.ui.view.loginScreen

data class LoginState(
    val isLoading : Boolean = false,
    val isSuccess :String?="",
    val isError :String?=""
)
