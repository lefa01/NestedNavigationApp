package com.faracoder.nestednavigationapp.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.faracoder.nestednavigationapp.screens.HomeScreen
import com.faracoder.nestednavigationapp.screens.ScreenA
import com.faracoder.nestednavigationapp.screens.ScreenB

fun NavGraphBuilder.appGraph(navController: NavController) {

    navigation(startDestination = Screens.ScreenHomeRoute.route, route = Screens.AppRoute.route) {

        composable(route = Screens.ScreenHomeRoute.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screens.ScreenARoute.route) {
            ScreenA(navController = navController)
        }
        composable(route = Screens.ScreenBRoute.route) {
            ScreenB(navController = navController)
        }
    }

}