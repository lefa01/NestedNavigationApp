package com.faracoder.nestednavigationapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.faracoder.nestednavigationapp.navigation.Screens

@Composable
fun LoginScreen(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login Screen", fontSize = 40.sp)
        Spacer(modifier.height(40.dp))
        Button(
            onClick = {
                navController.navigate(route = Screens.ScreenHomeRoute.route)
            }
        ) {
            Text(text = "Register (Go to Home)", fontSize = 25.sp)

        }
        Spacer(modifier.height(40.dp))
        Button(
            onClick = {
                navController.navigate(route = Screens.ScreenForgetPassRoute.route)
            }
        ) {
            Text(text = "Forgot Password", fontSize = 25.sp)

        }
        Spacer(modifier.height(40.dp))
        Button(
            onClick = {
                navController.navigate(route = Screens.ScreenRegisterRoute.route)
            }
        ) {
            Text(text = "Register", fontSize = 25.sp)

        }
    }

}