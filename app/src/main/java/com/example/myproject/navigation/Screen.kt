package com.example.myproject.navigation

sealed class Screen(val route: String){

    object HomeScreen : Screen("home_screen")
    object SearchScreen : Screen("search_screen")
    object WelcomeScreen : Screen("welcome_screen")
    object LoginScreen : Screen("login_screen")
}
