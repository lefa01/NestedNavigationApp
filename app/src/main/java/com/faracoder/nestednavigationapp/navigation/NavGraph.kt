package com.faracoder.nestednavigationapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.AuthRoute.route) {

        // Here we just have to call the authGraph
        authGraph(navController)

        // And here we just have to call appGraph
        appGraph(navController)
    }

}