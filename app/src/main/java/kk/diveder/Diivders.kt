package kk.diveder

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.material.Colors
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DividerHeight(height : Int) {
    Divider(Modifier.height(height.dp).background(color = Color.Blue))
}

@Composable
fun DividerHeightBackground(height : Int, colors: Color) {
    Divider(Modifier.height(height.dp).background(color = colors))
}