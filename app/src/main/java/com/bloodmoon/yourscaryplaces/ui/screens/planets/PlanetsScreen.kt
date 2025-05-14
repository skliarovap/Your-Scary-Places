package com.bloodmoon.yourscaryplaces.ui.screens.planets

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.navigation.NavController
import com.bloodmoon.yourscaryplaces.ui.components.JetDialog
import com.bloodmoon.yourscaryplaces.domain.navigation.NavScreen
import com.bloodmoon.yourscaryplaces.ui.screens.planets.models.PlanetsAction
import com.bloodmoon.yourscaryplaces.ui.screens.planets.models.PlanetsEvent
import com.bloodmoon.yourscaryplaces.ui.screens.planets.views.PlanetsViewDisplay

@Composable
fun PlanetsScreen(
    navController: NavController,
) {
    val actionView = mutableStateOf<PlanetsAction?>(null)

    when (val action = actionView.value) {
        is PlanetsAction.ShowDialog -> {
            JetDialog(
                title = action.title,
                body = action.body,
                onApply = { },
                onClose = { }
            )
        }

        else -> {}
    }

    PlanetsViewDisplay(
        dispatcher = { event: PlanetsEvent.OpenPlanetPageScreen ->
            navController.navigate(NavScreen.PlanetPage(event.id))
        }
    )
}