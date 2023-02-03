package com.example.myproject.component

import android.content.res.Configuration
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myproject.navigation.BottomNavItem

@Composable
fun BottomNavigationBar() {
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Search,
        BottomNavItem.Matches,
        BottomNavItem.Favorites,
        BottomNavItem.Settings,
    )
    BottomNavigation(
        backgroundColor = MaterialTheme.colorScheme.background,
        elevation = 5.dp,
        contentColor = Color.Blue
    ) {


        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painterResource(id = item.icon),
                        contentDescription = item.title,
                        tint = MaterialTheme.colorScheme.primary
                        /*     tint = if (currentSelectedItem == item.screen) {
                                 MaterialTheme.colorScheme.primary
                             } else {
                                 MaterialTheme.colorScheme.onSurfaceVariant
                             }*/

                    )
                },
                label = {
                    Text(text = item.title)
                },
                selectedContentColor = Color.Blue,
                unselectedContentColor = Color.Red.copy(0.4f),
                alwaysShowLabel = true,
                selected = false,
                onClick = {
                    /* Add code later */
                }
            )
        }
    }
}

@Preview(name = "Full Preview", showSystemUi = true)
@Preview(name = "Light Mode")
@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun BottomNavigationBarPreview() {
    BottomNavigationBar()
}