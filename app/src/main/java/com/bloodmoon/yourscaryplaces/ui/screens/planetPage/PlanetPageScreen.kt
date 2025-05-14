package com.bloodmoon.yourscaryplaces.ui.screens.planetPage

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.navigation.NavController
import com.bloodmoon.yourscaryplaces.ui.components.JetDialog
import com.bloodmoon.yourscaryplaces.ui.screens.planetPage.models.PlanetPageAction
import com.bloodmoon.yourscaryplaces.ui.screens.planetPage.models.PlanetPageEvent
import com.bloodmoon.yourscaryplaces.ui.screens.planetPage.views.PlanetPageViewDisplay

@Composable
fun PlanetPageScreen(
    navController: NavController,
    planetId: Int
) {
    val viewAction = mutableStateOf<PlanetPageAction?>(null)

    when (val action = viewAction.value) {
        is PlanetPageAction.ShowDialog -> {
            JetDialog(
                title = action.title,
                body = action.body,
                onApply = { },
                onClose = { }
            )
        }

        else -> {}
    }

    PlanetPageViewDisplay(
        planetId = planetId,
        dispatcher = { PlanetPageEvent.CloseScreen },
    )
}