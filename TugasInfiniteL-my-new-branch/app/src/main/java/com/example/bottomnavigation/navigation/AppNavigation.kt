package com.example.bottomnavigation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.bottomnavigation.component.shareItem
import com.example.bottomnavigation.screens.HomeScreen
import com.example.bottomnavigation.screens.ProfileScreen
import com.example.bottomnavigation.screens.SettingScreen
import com.example.bottomnavigation.R
import com.example.bottomnavigation.screens.DetailMentorScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation(
//    val navController: NavHostController,
//    title: String,
//    showBackButton: Boolean = false,
){
    val navController = rememberNavController()

    Scaffold (
        topBar = {
//            TopAppBar(
//                title = { Text(text = "Infinite App") },
//
//                actions = {
//                    IconButton(onClick = {  }) {
//                        Icon(
//                            imageVector = Icons.Default.Share, contentDescription = stringResource(
//                                id = androidx.compose.ui.R.string.navigation_menu
//                            )
//                        )
//                    }
//                }
//            )
            TopAppBar(
                title = { Text(text = "Infinite App") },
                navigationIcon = {
                    BackButton(navController = navController)
                },
                actions = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Default.Share, contentDescription = stringResource(
                                id = androidx.compose.ui.R.string.navigation_menu
                            )
                        )
                    }
                }
            )
        },
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                listOfNavItems.forEach { navItems ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any {it.route == navItems.route} == true ,
                        onClick = {
                                  navController.navigate(navItems.route){
                                      popUpTo(navController.graph.findStartDestination().id){
                                          saveState = true
                                      }
                                      launchSingleTop = true
                                      restoreState = true
                                  }

                                  },
                        icon = { 
                               Icon(imageVector = navItems.icon,
                                   contentDescription = null )
                        },
                        label = {
                            Text(text = navItems.label)

                        }

                    )
                }

            }
        }
    ) {paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.HomeScreen.name,
            modifier = Modifier.padding(paddingValues)
        ){
          composable(route = Screens.HomeScreen.name){
              HomeScreen(navController)
          }
          composable(route = Screens.ProfileScreen.name){
              ProfileScreen()
          }
          composable(route = Screens.SettingScreen.name){
              SettingScreen()
          }
          composable(
              Screen.Detail.route + "/{mentorId}",
              arguments = listOf(navArgument("mentorId"){ type = NavType.IntType})
          )  {navBackStackEntry ->
              DetailMentorScreen(
                  navController = navController,
                  mentorsId = navBackStackEntry.arguments?.getInt("mentorId"))
          }

        }

    }
}
@Composable
private fun BackButton(navController: NavHostController) {
    IconButton(onClick = { navController.navigateUp() }) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = stringResource(R.string.back)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun InfiniteAppPrev() {
    AppNavigation()
}



