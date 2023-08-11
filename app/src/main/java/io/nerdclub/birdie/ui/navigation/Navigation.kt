package io.nerdclub.birdie.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import androidx.navigation.NavHost

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("leaderboard") { LeaderboardScreen(navController) }
        composable("player") { PlayerScreen(navController) }
    }
}

data class NavItem(
    val title: String,
    val icon: ImageVector,
    val route: String,
    val screen: @Composable (NavController) -> Unit
)
