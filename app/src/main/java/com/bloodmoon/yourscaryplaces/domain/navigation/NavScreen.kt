package com.bloodmoon.yourscaryplaces.domain.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class NavScreen {
    @Serializable
    data object Planets : NavScreen()

    @Serializable
    data class PlanetPage (val planetId: Int): NavScreen()
}