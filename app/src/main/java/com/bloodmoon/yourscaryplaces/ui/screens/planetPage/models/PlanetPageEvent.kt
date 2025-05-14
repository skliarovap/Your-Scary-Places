package com.bloodmoon.yourscaryplaces.ui.screens.planetPage.models

sealed class PlanetPageEvent {
    data class EnterScreen (val planetId:Int) : PlanetPageEvent()
    data object ReloadScreen : PlanetPageEvent()
    data object BookTour : PlanetPageEvent()
    data object CloseScreen : PlanetPageEvent()
}