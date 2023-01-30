package com.example.myproject.ui.view.homeScreen


import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myproject.R
import com.example.myproject.navigation.Screen
import com.example.myproject.ui.theme.colorBlue
import com.example.myproject.ui.theme.colorRedDark
import com.example.myproject.ui.theme.darkBlue

@Composable
fun Home(navController: NavController) {


    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Hey", fontWeight = FontWeight.Bold,
                color = colorBlue,
                textAlign = TextAlign.Start,
                fontSize = 25.sp
            )
            Image(
                painter = painterResource(R.drawable.user),
                contentDescription = "profile_picture",
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, color = darkBlue, CircleShape),
            )
        }
        Spacer(modifier = Modifier.height(1.dp))
        Text(
            text = "Adopt a new friend!",
            color = darkBlue,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                navController.navigate(Screen.LoginScreen.route)
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = White,
                contentColor = colorRedDark
            ),
            modifier = Modifier.height(47.dp),
            shape = CircleShape
        ) {
            Icon(
                Icons.Default.Search,
                contentDescription = "Search",
                modifier = Modifier
                    .size(25.dp)
            )
            Spacer(modifier = Modifier.width(400.dp))

        }
        Image(
            painter = painterResource(R.drawable.header),
            contentDescription = "header",
            modifier = Modifier
                .fillMaxWidth()
                .clickable {

                }
                .padding(vertical = 10.dp)
//                .size(width = 400.dp, height = 100.dp)
        )


    }

}

@Preview(name = "Full Preview", showSystemUi = true)
@Preview(name = "Light Mode")
@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun preViewHome() {
    Home(navController = NavController(LocalContext.current))

}