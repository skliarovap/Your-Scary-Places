package com.bloodmoon.yourscaryplaces.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.bloodmoon.yourscaryplaces.ui.theme.SurfaceColor

@Composable
fun JetRatingBar(
    rating: Int, //рейтинг тура (от 1 до 5 звезд);
    modifier: Modifier = Modifier
) {
    var colors = listOf<Color>()
    val vectorImage = ImageVector.vectorResource(com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_star_16_filled)

    when (rating) {
        0 -> colors = listOf(SurfaceColor, SurfaceColor, SurfaceColor, SurfaceColor, SurfaceColor)
        1 -> colors = listOf(Color.White, SurfaceColor, SurfaceColor, SurfaceColor, SurfaceColor)
        2 -> colors = listOf(Color.White, Color.White, SurfaceColor, SurfaceColor, SurfaceColor)
        3 -> colors = listOf(Color.White, Color.White, Color.White, SurfaceColor, SurfaceColor)
        4 -> colors = listOf(Color.White, Color.White, Color.White, Color.White, SurfaceColor)
        5 -> colors = listOf(Color.White, Color.White, Color.White, Color.White, Color.White)
    }

    Row() {
        Icon(
            imageVector = vectorImage,
            contentDescription = null,
            tint = colors[0],
        )

        Icon(
            imageVector = vectorImage,
            contentDescription = null,
            tint = colors[1],
        )

        Icon(
            imageVector = vectorImage,
            contentDescription = null,
            tint = colors[2],
        )
        Icon(
            imageVector = vectorImage,
            contentDescription = null,
            tint = colors[3],
        )
        Icon(
            imageVector = vectorImage,
            contentDescription = null,
            tint = colors[4],
        )
    }
}

@Preview
@Composable
fun Prewieeq(){
    JetRatingBar(
        rating = 3
    )
}