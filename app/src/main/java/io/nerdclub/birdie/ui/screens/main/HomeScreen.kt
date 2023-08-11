package io.nerdclub.birdie.ui.screens.main

import io.nerdclub.birdie.R

sealed class HomeScreen(val title: String, val icon: Int, val route: String) {
    object Home : HomeScreen("Home", R.drawable.ic_home, "home")
    object Tour : HomeScreen("Tour", R.drawable.ic_tour, "tour")
    object WorldRank : HomeScreen("World Rank", R.drawable.ic_world_rank, "world_rank")
    object Settings : HomeScreen("Settings", R.drawable.ic_settings, "settings")
    object Notifications : HomeScreen("Notifications", R.drawable.ic_notifications, "notifications")

    companion object {

        fun all() = listOf(Home, Tour, WorldRank, Settings, Notifications)
        fun fromRoute(route: String?): HomeScreen = when (route?.substringBefore("/")) {
            Home.route -> Home
            Tour.route -> Tour
            WorldRank.route -> WorldRank
            Settings.route -> Settings
            Notifications.route -> Notifications
            else -> Home
        }

    }

    override fun toString(): String {
        return title
    }
}
