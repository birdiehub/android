package io.nerdclub.birdie.ui.components.nav

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.nerdclub.birdie.ui.navigation.NavItem

@Composable
fun BottomNavBar(
    navController: NavController,
    items: List<NavItem>,
    currentRoute: String?,
    onItemSelected: (NavItem) -> Unit,
    modifier: Modifier = Modifier
) {
    BottomAppBar(
        modifier = modifier,
        containerColor = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.onBackground,
        tonalElevation = 8.dp,
        contentPadding = PaddingValues(2.dp)
    ) {
        BottomNavBarContent(
            items = items,
            currentRoute = currentRoute,
            onItemSelected = { route ->
                navController.navigate(route)
            },
            modifier = modifier
        )
    }
}
