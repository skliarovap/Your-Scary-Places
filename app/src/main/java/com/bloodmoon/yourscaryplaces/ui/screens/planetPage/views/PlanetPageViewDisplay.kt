package com.bloodmoon.yourscaryplaces.ui.screens.planetPage.views

import androidx.compose.foundation.background
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.bloodmoon.yourscaryplaces.R
import com.bloodmoon.yourscaryplaces.ui.screens.planetPage.models.PlanetPageEvent
import com.bloodmoon.yourscaryplaces.ui.theme.BackGroundColor
import com.bloodmoon.yourscaryplaces.ui.theme.OnPrimaryColor
import com.bloodmoon.yourscaryplaces.ui.theme.Typography
import com.bloodmoon.yourscaryplaces.ui.components.JetGradientButton
import com.bloodmoon.yourscaryplaces.ui.components.JetIconButton
import com.bloodmoon.yourscaryplaces.ui.components.JetTextCard
import com.bloodmoon.yourscaryplaces.ui.components.PlanetCard

@Composable
fun PlanetPageViewDisplay(
    planetId:Int,
    dispatcher: (PlanetPageEvent) -> Unit
) {
    val verticalScroll = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundColor)
            .verticalScroll(verticalScroll)
            .padding(24.dp)
    ) {
        JetIconButton(
            vectorDrawableId = com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_chevron_left_16_filled,
            onClick = {dispatcher.invoke(PlanetPageEvent.CloseScreen)}
        )

        Spacer(modifier = Modifier.size(38.dp))

        Text(
            text = "Ghost “Yenion”",
            fontSize = 24.sp,
            style = Typography.bodyMedium,
            color = OnPrimaryColor
        )

        Spacer(modifier = Modifier.size(24.dp))

        PlanetCard(
            label = "Ghost “Yenion”",
            rating = 3,
            imagePath = "file:///android_asset/App2_Image1.jpg",
            isClickable = false
        )

        Spacer(modifier = Modifier.size(24.dp))

        JetTextCard(
            label = stringResource(R.string.description),
            value = "We are happy to show you lost places in our endless galaxy. Fear and horror will follow you all the way. Only the most desperate travelers will be able to reach the end. You are ready?",
        )

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier.padding(bottom = 2.dp)
        ) {
            JetGradientButton(
                text = stringResource(R.string.send_application),
                modifier = Modifier.size(width = 366.dp, height = 54.dp)
            )
        }
    }
}

/*
@Preview
@Composable
fun PlanetPageViewDisplayPreview() {
    PlanetPageViewDisplay()
}
 */