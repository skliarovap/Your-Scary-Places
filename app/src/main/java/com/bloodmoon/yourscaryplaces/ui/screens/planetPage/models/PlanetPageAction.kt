package com.bloodmoon.yourscaryplaces.ui.screens.planetPage.models

sealed class PlanetPageAction {
    data class ShowDialog(
        val title: String,
        val body: String,
        val buttonText: String
    ) : PlanetPageAction()
    data object CloseScreen : PlanetPageAction()
}