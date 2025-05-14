package com.bloodmoon.yourscaryplaces.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.bloodmoon.yourscaryplaces.ui.theme.BackGroundColor
import com.bloodmoon.yourscaryplaces.ui.theme.OnSurfaceColor
import com.bloodmoon.yourscaryplaces.ui.theme.Shapes
import com.bloodmoon.yourscaryplaces.ui.theme.Typography

@Composable
fun PlanetCard(
    label: String, //название тура
    rating: Int, //рейтинг тура (от 1 до 5 звезд)
    imagePath: String, //путь к изображению
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    isClickable: Boolean?
) {
    val customModifier = if (isClickable == true) modifier.clickable (onClick = onClick) else modifier

    Column(
        modifier = customModifier
            .size(width = 366.dp, height = 165.dp)
            .background(BackGroundColor)
    ){
        Box(
            modifier = modifier
                .size(width = 366.dp, height = 136.dp)
                .clip(RoundedCornerShape(32.dp))
                .border(3.dp, shape = RoundedCornerShape(32.dp), color = Color.White)
        ){
            AsyncImage(
                modifier = modifier.size(width = 366.dp, height = 136.dp),
                model = imagePath,
                contentDescription = ""
            )
        }

        Spacer(modifier = modifier.size(10.dp))

        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 17.dp)
        ) {
            Text(
                text = label,
                fontSize = 16.sp,
                color = OnSurfaceColor,
                style = Typography.bodyMedium
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            )
            { JetRatingBar(rating = rating) }
        }

    }
}

@Preview
@Composable
fun PlanetCardPreview(){
    PlanetCard(
        label = "Ghost “Yenion”",
        rating = 3,
        imagePath = "file:///android_asset/App2_Image1.jpg",
        isClickable = true,
        onClick = { println("Clickable") }
    )
}