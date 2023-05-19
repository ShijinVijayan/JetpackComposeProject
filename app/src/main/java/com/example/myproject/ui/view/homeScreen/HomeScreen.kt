package com.example.myproject.ui.view.homeScreen


import android.content.res.Configuration
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myproject.R
import com.example.myproject.component.BottomNavigationBar
import com.example.myproject.component.DefaultThumbnail
import com.example.myproject.component.Section
import com.example.myproject.component.TopPlayers
import com.example.myproject.data.ShoeDataSource
import com.example.myproject.navigation.Screen
import com.example.myproject.ui.theme.CardViewBackground
import com.example.myproject.ui.theme.Shapes
import com.example.myproject.ui.theme.colorBlue
import com.example.myproject.ui.theme.colorDArkGray
import com.example.myproject.ui.theme.darkBlue
import com.example.myproject.util.CATEGORY
import java.util.*


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController) {
    val shoeList = ShoeDataSource().getShoeList()
    val item = listOf("PlayerCard","locationMatches", "Banner","players", "product", )

    Scaffold(
        bottomBar = { BottomNavigationBar() },
        topBar = {
            ProfileIconBlock()

        },
        content = {
                padding -> // We have to pass the scaffold inner padding to our content. That's why we use Box.

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(paddingValues = padding)

            ) {

                item.forEach {
                    when (it) {
                        "locationMatches" -> {
                            Spacer(modifier = Modifier.height(10.dp))
                            LocationTopBar(CATEGORY) {
                                navController.navigate(Screen.LocationMatches.route)
                            }
                        }


                        "players" -> {
                            Spacer(modifier = Modifier.height(20.dp))
                            TopPlayers()
                        }

                        "product" -> {
                            Spacer(modifier = Modifier.height(20.dp))
                            Section("Popular shoes") {
                                LazyRow(
                                    modifier = Modifier
                                        .padding(start = 5.dp)
                                        .fillMaxWidth()
                                ) {
                                    items(shoeList) { shoe ->
                                        Spacer(modifier = Modifier.width(5.dp))
                                        DefaultThumbnail(
                                            shoe, shoe.shoeTypes[0]
                                        ) { selectedShoe ->
                                            println(selectedShoe.id.toString())
//
                                            /*     navController.navigate(
                                                    *//* Screen.DetailsScreen.withArgs(selectedShoe.id.toString())
//                                          Screen.DetailsScreen.withArgs("selectedShoe.id.toString()")*//*
                                    )*/
                                        }
                                        Spacer(modifier = Modifier.width(10.dp))
                                    }
                                }
                            }
                        }

                        "Banner" -> {
                            Spacer(modifier = Modifier.height(20.dp))
                            SingleBannerImage()
                        }

                        "PlayerCard"->{
                            Spacer(modifier = Modifier.width(20.dp))
                            MainTwoBlock()
                        }
                    }

                }
                Spacer(modifier = Modifier.height(20.dp))

            }
        },
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileIconBlock() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .statusBarsPadding()
                .padding(vertical = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painterResource(id = R.drawable.foodizone_logo),
                contentDescription = "Personal Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(start = 16.dp)
                    .size(48.dp)
                    .clip(CircleShape)
                    .border(2.dp, colorBlue, shape = CircleShape)
            )

            Text(
                text = "Hi Shijin,",
                fontWeight = FontWeight.Bold,
                color = colorBlue,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp, end = 8.dp),
                fontSize = 16.sp
            )

            Icon(
                imageVector = Icons.Outlined.Notifications,
                contentDescription = "profile_picture",
                tint = colorDArkGray,
                modifier = Modifier
                    .padding(end = 16.dp)
                    .size(28.dp),
            )

        }


    }

}




@Composable
fun LocationTopBar(categoryList: List<Pair<String, Int>>, onCategoryClicked: (String) -> Unit) {

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        contentPadding = PaddingValues(end = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {

        items(categoryList.size) {
            LocationTopBarItem(categoryList[it], onCategoryClicked)
        }
    }

}


@Composable
fun LocationTopBarItem(subject: Pair<String, Int>, onCategoryClicked: (String) -> Unit) {
    Column(
        modifier = Modifier
            .padding(start = 16.dp)
            .clickable { onCategoryClicked.invoke(subject.first) },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            modifier = Modifier.width(80.dp),
            shape = Shapes.medium,
            color = CardViewBackground
        ) {
            Text(
                modifier = Modifier.padding(all = 16.dp),
                textAlign = TextAlign.Center,
                text = subject.first.take(1),
                fontSize = 32.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold

            )
        }
        androidx.compose.material.Text(
            text = subject.first,
            modifier = Modifier.padding(top = 4.dp),
            style = TextStyle(color = Color.Gray)
        )
    }
}


@Composable
fun SingleBannerImage() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp)
            .height(180.dp),
        shape = Shapes.large,
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Box(Modifier.fillMaxSize()) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.img),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp)
            ) {
                Text(
                    text = showDayCookMessage(),
                    style = MaterialTheme.typography.titleSmall,
                    color = Color.White
                )
                Button(onClick = {

                }) {
                    Text(
                        text = "Get a Random Meal", style = MaterialTheme.typography.labelMedium
                    )
                }
            }
        }
    }

}

fun showDayCookMessage(): String {
    // Get the time of day
    val date = Date()
    val cal = Calendar.getInstance()
    cal.time = date

    return when (cal[Calendar.HOUR_OF_DAY]) {
        in 12..16 -> {
            "What to cook for lunch?"
        }

        in 17..20 -> {
            "What to cook for dinner?"
        }

        in 21..23 -> {
            "What to cook tonight?"
        }

        else -> {
            "What to cook for breakfast?"
        }
    }
}

@Preview(name = "Full Preview", showSystemUi = true)
@Preview(name = "Light Mode")
@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun preViewHome() {
    Home(navController = NavController(LocalContext.current))

}
