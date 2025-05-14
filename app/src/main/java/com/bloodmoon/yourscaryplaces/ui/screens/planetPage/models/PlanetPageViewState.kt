package com.bloodmoon.yourscaryplaces.ui.screens.planetPage.models

sealed class PlanetPageViewState {
    data object Loading: PlanetPageViewState()
    data class Error(
        val icon: Int,
        val description: String
    ): PlanetPageViewState()
    data class Display(
        val planerName:String,
        val photo:String,
        val rating:Int,
        val description: String
    ): PlanetPageViewState()
}