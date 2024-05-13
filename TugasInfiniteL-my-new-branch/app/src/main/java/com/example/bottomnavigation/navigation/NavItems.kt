package com.example.bottomnavigation.navigation


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItems(
    val label: String,
    val icon: ImageVector,
    val route: String
)

val listOfNavItems: List<NavItems> = listOf(
    NavItems(
        label = "Home",
        icon = Icons.Default.Home,
        route = Screens.HomeScreen.name
    ),
    NavItems(
        label = "Profile",
        icon = Icons.Default.Person,
        route = Screens.ProfileScreen.name
    ),
    NavItems(
        label = "Setting",
        icon = Icons.Default.Settings,
        route = Screens.SettingScreen.name
    )
)