package com.bloodmoon.yourscaryplaces.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bloodmoon.yourscaryplaces.ui.theme.OnSurfaceColor
import com.bloodmoon.yourscaryplaces.ui.theme.Typography

@Composable
fun JetGradientButton(
    text: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(256.dp, 54.dp)
            .background(Brush.horizontalGradient(listOf(Color(0xFF1C1F1E), Color(0xFF804E4E))), RoundedCornerShape(24.dp)),
        Alignment.Center
    ) {
        Text(
            text = text,
            color = Color(0xFFE1E1E1),
            fontSize = 16.sp,
            style = Typography.bodyLarge
        )
    }
}

@Preview
@Composable
fun Previewa() {
    JetGradientButton("Send an application", Modifier)
}