package com.example.myproject.navigation

import com.example.myproject.R

sealed class BottomNavItem(var title: String, var icon: Int) {

    object Home : BottomNavItem(
        title = "Home",
        icon = R.drawable.ic_bhome_24
    )

    object Search : BottomNavItem(
        title = "Search",
        icon = R.drawable.ic_category
    )

    object Matches : BottomNavItem(
        title = "Matches",
        icon = R.drawable.ic_profile
    )

    object Favorites : BottomNavItem(
        title = "Favorites",
        icon = R.drawable.ic_fav
    )

    object Settings : BottomNavItem(
        title = "Settings",
        icon = R.drawable.ic_profile
    )
}
