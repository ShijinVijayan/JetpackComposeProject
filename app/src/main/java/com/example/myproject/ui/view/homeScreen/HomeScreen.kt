package com.example.myproject.ui.view.homeScreen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myproject.ui.theme.colorBlue

@Composable
fun Home(navController: NavController) {

    val textState = remember { mutableStateOf(TextFieldValue("")) }

/*    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = "Hey,",
                fontWeight = FontWeight.Bold,
                color = colorBlue,
                textAlign = TextAlign.Start,
                fontSize = 25.sp
            )
        }

    }*/
}