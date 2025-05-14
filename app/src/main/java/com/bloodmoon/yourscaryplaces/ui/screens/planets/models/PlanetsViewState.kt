package com.bloodmoon.yourscaryplaces.ui.screens.planets.models

sealed class PlanetsViewState {
    data object Loading: PlanetsViewState()
    data class Error(
        val icon: Int,
        val description: String
    ): PlanetsViewState()
    data class Display(
        val listOfPlaces: List<String> = listOf( "Ghost “Yenion”", "Destroyed platform", "Gold mine")
    ): PlanetsViewState()
}