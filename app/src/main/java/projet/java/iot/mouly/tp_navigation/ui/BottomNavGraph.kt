package projet.java.iot.mouly.tp_navigation.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import projet.java.iot.mouly.tp_navigation.ui.screens.HomeScreen
import projet.java.iot.mouly.tp_navigation.ui.screens.ProgramsScreen
import projet.java.iot.mouly.tp_navigation.ui.screens.SettingsScreen

/* 
 * BottomNavGraph                               04/10/2023
 */


@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Programs.route) {
            ProgramsScreen()
        }
        composable(route = BottomBarScreen.Settings.route) {
            SettingsScreen()
        }
    }
}