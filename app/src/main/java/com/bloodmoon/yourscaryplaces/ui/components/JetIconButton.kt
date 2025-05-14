package com.bloodmoon.yourscaryplaces.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bloodmoon.yourscaryplaces.R
import com.bloodmoon.yourscaryplaces.ui.theme.SurfaceColor

@Composable
fun JetIconButton(
    vectorDrawableId: Int, //идентификатор векторного изображения, которое отобразит UI-компонент (например, рыбку)
    modifier: Modifier = Modifier, //для персонализации UI-компонента (например, определение размера)
    shape: RoundedCornerShape = RoundedCornerShape(8.dp), //для персонализации UI-компонента (например, определение размера)
    contentPadding: PaddingValues = PaddingValues(), //для задания внутренних отступов;
    onClick:() -> Unit
) {
    val chevronIcon = ImageVector.vectorResource(vectorDrawableId)

    Button(
        modifier = modifier
            .background(SurfaceColor, shape = shape)
            .clip(shape = shape)
            .size(48.dp),
        onClick = onClick
    ){
        Icon(
            imageVector = chevronIcon,
            contentDescription = null,
            tint = Color.White
        )
    }
}

@Preview
@Composable
fun JetIconButtonPreview(){
    JetIconButton(
        vectorDrawableId = 1,
        onClick = {}
    )
}