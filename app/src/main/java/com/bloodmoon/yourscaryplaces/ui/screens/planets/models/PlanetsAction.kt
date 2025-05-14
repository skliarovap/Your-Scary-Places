package com.bloodmoon.yourscaryplaces.ui.screens.planets.models

import com.bloodmoon.yourscaryplaces.ui.screens.planetPage.models.PlanetPageAction

sealed class PlanetsAction {
    data class ShowDialog(
        val title: String,
        val body: String,
        val buttonText: String
    ) : PlanetsAction()
}