package com.example.myproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.myproject.component.StandardScaffold
import com.example.myproject.navigation.Navigation
import com.example.myproject.navigation.Screen
import com.example.myproject.ui.theme.MyProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MyProjectTheme {
                MainUI()
            }
        }
    }
}

@Composable

fun MainUI() {
    MyProjectTheme {
        Surface(
            color = MaterialTheme.colorScheme.background,
            modifier = Modifier.fillMaxSize()
        ) {
            val navController = rememberNavController()
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            StandardScaffold(
                navController = navController,
                showBottomBar = navBackStackEntry?.destination?.route in listOf(
                    Screen.HomeScreen.route
                ),
                modifier =Modifier.fillMaxSize(),
                onFabClick ={
                    navController.navigate(Screen.SearchScreen.route)
                }
            ){
                Navigation(navController)

            }

        }

    }

}


