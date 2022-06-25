package kk.row

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kk.spacer.SpacerWidth
import kk.text.MyRowText

@Composable
fun RowView() {

    Card(shape = RoundedCornerShape(8.dp)) {
        Row(
            Modifier.height(IntrinsicSize.Min).background(color = Color.Yellow)
        ) {
            MyRowText("Home1")
            MyRowText("Latest")
            MyRowText("Account")
        }
    }



}

