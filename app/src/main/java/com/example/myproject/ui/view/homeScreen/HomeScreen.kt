package com.example.myproject.ui.view.homeScreen


import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myproject.R
import com.example.myproject.component.BottomNavigationBar
import com.example.myproject.ui.theme.colorBlue
import com.example.myproject.ui.theme.darkBlue


@Composable
fun Home(navController: NavController) {
    Scaffold(
        bottomBar = { BottomNavigationBar() },
        content = { padding -> // We have to pass the scaffold inner padding to our content. That's why we use Box.
            Box(modifier = Modifier.padding(padding)) {
                Column(
                    modifier = Modifier.fillMaxSize()

                ) {
                    Row(
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Hey", fontWeight = FontWeight.Bold,
                            color = colorBlue,
                            textAlign = TextAlign.Start,
                            modifier = Modifier
                                .weight(1f)
                                .padding(start = 20.dp),
                            fontSize = 25.sp
                        )
                        Image(
                            painter = painterResource(R.drawable.user),
                            contentDescription = "profile_picture",
                            modifier = Modifier
                                .padding(end = 20.dp)
                                .size(48.dp)
                                .clip(CircleShape)
                                .border(1.5.dp, color = darkBlue, CircleShape),
                        )
                    }
                    Spacer(modifier = Modifier.height(1.dp))
                    Text(
                        text = "Adopt a new friend!",
                        modifier = Modifier.padding(start = 20.dp),
                        color = darkBlue,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(20.dp))


                }
            }
        },
    )




}

@Preview(name = "Full Preview", showSystemUi = true)
@Preview(name = "Light Mode")
@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun preViewHome() {
    Home(navController = NavController(LocalContext.current))

}