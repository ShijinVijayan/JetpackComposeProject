package com.example.myproject.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myproject.ui.view.loginScreen.Login
import com.example.myproject.ui.view.search_screen.SearchScreenTest
import com.example.myproject.ui.view.welcome_screen.WelcomeScreen

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.WelcomeScreen.route,
        modifier = Modifier.fillMaxSize()
    ) {
        composable(
            route = Screen.WelcomeScreen.route
        ) {
            WelcomeScreen(navController)

        }

        composable(
            route = Screen.SearchScreen.route
        ) {
            SearchScreenTest(navController)
        }

        composable(
            route = Screen.LoginScreen.route
        ) {
            Login(navController)
        }

    }

}