package com.bloodmoon.yourscaryplaces.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.content.contentReceiver
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bloodmoon.yourscaryplaces.ui.theme.BackGroundColor
import com.bloodmoon.yourscaryplaces.ui.theme.OnSecondaryColor
import com.bloodmoon.yourscaryplaces.ui.theme.OnSurfaceColor
import com.bloodmoon.yourscaryplaces.ui.theme.Shapes
import com.bloodmoon.yourscaryplaces.ui.theme.SurfaceColor
import com.bloodmoon.yourscaryplaces.ui.theme.Typography
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun JetTextCard(
    label: String,
    value: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .size(width = 366.dp, height = 165.dp)
            .background(color = SurfaceColor, shape = Shapes.medium)
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = label,
            fontSize = 18.sp,
            color = OnSurfaceColor.copy(0.4f),
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(start = 10.dp, bottom = 8.dp, end = 11.dp)
        )
        Text(
            text = value,
            fontSize = 16.sp,
            color = OnSecondaryColor,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(start = 12.dp, bottom = 13.dp, end = 4.dp)
        )
    }
}

@Preview
@Composable
fun JetTextCardPreview(){
    JetTextCard(
        label = "Description",
        value = "We are happy to show you lost places in our endless galaxy. Fear and horror will follow you all the way. Only the most desperate travelers will be able to reach the end. You are ready?",
        Modifier
    )
}