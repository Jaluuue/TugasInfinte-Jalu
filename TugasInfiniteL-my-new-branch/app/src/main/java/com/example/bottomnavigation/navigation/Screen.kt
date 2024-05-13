package com.example.bottomnavigation.navigation

sealed class Screen (val route: String) {
    data object Detail: Screen("detail_mentors")
    data object Gallery: Screen("gallery")
    data object Biodata: Screen("biodata")
}