package com.example.myproject.ui.view.tournament_screen


import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myproject.data.TournamentData
import com.example.myproject.navigation.Screen
import com.example.myproject.ui.view.welcome_screen.WelcomeScreen

@Composable
fun TournamentScreen(navController: NavController) {
    TournamentToolBar(
        { navController.popBackStack() },
        { navController.navigate(Screen.WelcomeScreen.route) }
    )
}

@Composable
fun TournamentToolBar(
    OnBackClicked: () -> Unit,
    OnMatchesClicked: () -> Unit
) {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { OnBackClicked.invoke() }) {
                androidx.compose.material.Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null
                )
            }
        },
        elevation = 2.dp,
        backgroundColor = Color.White,
        modifier = Modifier.fillMaxWidth(),
        title = {
            Text(
                text = "Tournaments",
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        },
        actions = {
            IconButton(
                onClick = { OnMatchesClicked.invoke() },
                modifier = Modifier.padding(end = 6.dp)
            ) {
                androidx.compose.material.Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null
                )
            }
        }
    )

}


@Composable
fun TournamentList(
    data:List<TournamentData>,
){

}

@Preview(name = "Light Mode")
@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable

fun TournamentScreenPreview() {
    TournamentScreen(navController = NavController(LocalContext.current))
}