package com.bloodmoon.yourscaryplaces.ui.screens.planets.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.bloodmoon.yourscaryplaces.R
import com.bloodmoon.yourscaryplaces.ui.screens.planets.models.PlanetsAction
import com.bloodmoon.yourscaryplaces.ui.screens.planets.models.PlanetsEvent
import com.bloodmoon.yourscaryplaces.ui.theme.BackGroundColor
import com.bloodmoon.yourscaryplaces.ui.theme.OnPrimaryColor
import com.bloodmoon.yourscaryplaces.ui.theme.Typography
import com.bloodmoon.yourscaryplaces.ui.components.PlanetCard

data class Planet(
    val label: String,
    val rating: Int,
    val imagePath: String,
    val isClickable: Boolean?
)

@Composable
fun PlanetsViewDisplay(
    dispatcher: (PlanetsEvent.OpenPlanetPageScreen) -> Unit
) {
    val planets = listOf<Planet>(
        Planet("Ghost “Yenion”", 3, "file:///android_asset/App2_Image1.jpg", true),
        Planet("Destroyed platform", rating = 4, "file:///android_asset/App2_Image2.jpg", false),
        Planet("Gold mine", 5, "file:///android_asset/App2_Image3.jpg", false)
    )

    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundColor)
            .verticalScroll(scrollState)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.size(width = 150.dp, height = 56.dp)
        ) {
            Text(
                text = stringResource(R.string.header_title),
                fontSize = 24.sp,
                style = Typography.bodyLarge,
                color = OnPrimaryColor,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.size(39.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            planets.forEachIndexed { index, planet ->
                PlanetCard(
                    label = planet.label,
                    rating = planet.rating,
                    imagePath = planet.imagePath,
                    onClick = { dispatcher.invoke(PlanetsEvent.OpenPlanetPageScreen(index)) },
                    isClickable = planet.isClickable
                )
            }
        }
    }
}

/*
@Preview
@Composable
fun PlanetsViewDisplayPreview() {
    PlanetsViewDisplay(

    )
}
 */