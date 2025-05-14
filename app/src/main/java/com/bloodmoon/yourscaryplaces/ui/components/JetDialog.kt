package com.bloodmoon.yourscaryplaces.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bloodmoon.yourscaryplaces.ui.theme.OnPrimaryColor
import com.bloodmoon.yourscaryplaces.ui.theme.OnSecondaryColor
import com.bloodmoon.yourscaryplaces.ui.theme.OnSurfaceColor
import com.bloodmoon.yourscaryplaces.ui.theme.PrimaryColor
import com.bloodmoon.yourscaryplaces.ui.theme.Typography
import kotlin.reflect.typeOf

@Composable
fun JetDialog(
    title: String = "Tour details", //шаблонное значение "Tour details";
    body: String = "Name: Ghost “Yenion”\nDate: Tommorow", //шаблонное значение "Name ...";
    positiveButtonText: String = "Apply", //шаблонное значение "Apply";
    negativeButtonText: String = "Cancel", //шаблонное значение "Cancel";
    onApply: () -> Unit,
    onClose: () -> Unit
) {
    Column(
        modifier = Modifier
            .width(381.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(PrimaryColor)
            .padding(top = 19.dp)
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = title,
            textAlign = TextAlign.Center,
            style = Typography.bodyLarge,
            color = OnSurfaceColor,
        )

        Divider(
            modifier = Modifier
                .width(123.dp)
                .align(Alignment.CenterHorizontally),
            thickness = 1.dp,
            color = OnSurfaceColor
        )

        Spacer(modifier = Modifier.height(9.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = body,
            textAlign = TextAlign.Center,
            style = Typography.bodySmall,
            fontSize = 14.sp,
            color = OnSurfaceColor,
            lineHeight = 14.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Button(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(OnPrimaryColor),
                onClick = onApply,
                shape = RoundedCornerShape(bottomStart = 8.dp)
            ) {
                Text(
                    text = positiveButtonText,
                    color = Color.White,
                    style = Typography.bodyLarge
                )
            }

            Button(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(OnPrimaryColor),
                onClick = onClose,
                shape = RoundedCornerShape(bottomEnd = 8.dp)
            ) {
                Text(
                    text = negativeButtonText,
                    color = PrimaryColor,
                    style = Typography.bodyLarge
                )
            }
        }
    }
}

@Preview
@Composable
fun JetDialogPreview() {
    JetDialog(
        onApply = {},
        onClose = {}
    )
}