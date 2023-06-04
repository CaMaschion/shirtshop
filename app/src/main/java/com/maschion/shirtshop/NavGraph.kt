package com.maschion.shirtshop

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.maschion.shirtshop.hometabscreen.TabScreen
import com.maschion.shirtshop.login.LoginScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = ShirtshopDestinations.Login.route
    ) {
        composable(
            route = ShirtshopDestinations.Login.route
        ) {
            LoginScreen(navController = navController)
        }
        composable(
            route = ShirtshopDestinations.Tab.route
        ) {
            TabScreen(viewModel())

        }
    }
}