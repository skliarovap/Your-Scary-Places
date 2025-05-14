package com.bloodmoon.yourscaryplaces.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.bloodmoon.yourscaryplaces.domain.navigation.NavScreen
import com.bloodmoon.yourscaryplaces.ui.screens.planetPage.PlanetPageScreen
import com.bloodmoon.yourscaryplaces.ui.screens.planets.PlanetsScreen

@Composable
fun NavHostScreen() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavScreen.Planets,
        builder = {
            composable<NavScreen.Planets> {
                PlanetsScreen(navController = navController)
            }

            composable<NavScreen.PlanetPage> { backStackEntry ->
                val page = backStackEntry.toRoute<NavScreen.PlanetPage>()

                PlanetPageScreen(
                    navController = navController,
                    planetId = page.planetId
                )
            }
        }
    )

}