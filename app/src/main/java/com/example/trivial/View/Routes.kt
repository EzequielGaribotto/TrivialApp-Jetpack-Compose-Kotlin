package com.example.trivial.View

sealed class Routes(val route: String) {
    object MenuScreen : Routes("MenuScreen")

    object GameScreen : Routes("GameScreen")

    object ResultScreen : Routes("ResultScreen")

    object SettingsScreen : Routes("SettingsScreen")
}
