package com.faracoder.nestednavigationapp.navigation

sealed class Screens(val route: String) {
    object ScreenLoginRoute: Screens(route = "Login")
    object ScreenForgetPassRoute: Screens(route = "ForgetPass")
    object ScreenRegisterRoute: Screens(route = "Register")
    object ScreenHomeRoute: Screens(route = "Home")
    object ScreenARoute: Screens(route = "ScreenA")
    object ScreenBRoute: Screens(route = "ScreenB")
    object AuthRoute: Screens(route = "Auth")
    object AppRoute: Screens(route = "App")
}
