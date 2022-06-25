package kk.text

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextViews(name: String) {

    Text(
        text = name.repeat(1),
        color = Color.Blue,
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier
            .padding(16.dp)
            .padding(10.dp)
            .fillMaxWidth(),
        )
}

@Composable
fun CircularBorderTextViews(name: String) {

    Text(
        text = name.repeat(1),
        color = Color.Blue,
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier
            .padding(16.dp)
            .border(1.dp, Color.Magenta, CircleShape)
            .background(color = Color.White, shape = RectangleShape)
            .padding(10.dp)
            .fillMaxWidth(),

        )
}

@Composable
fun CircularFillTextViews(name: String) {

    Text(
        text = name.repeat(1),
        color = Color.Blue,
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        maxLines = 2,
        modifier = Modifier
            .padding(16.dp)
            .border(1.dp, Color.Magenta, CircleShape)
            .background(color = Color.Yellow, shape = CircleShape)
            .padding(10.dp)
            .fillMaxWidth(),

        )
}


@Composable
fun SingleBorderTextView(name: String) {
    Text(
        text = name,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(Color.Cyan)
            .border(3.dp, Color.Magenta)
            .padding(20.dp)
    )
}


@Composable
fun DoubleBorderTextView(name: String) {
    Text(
        text = name,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(Color.Cyan)
            .border(3.dp, Color.Magenta)
            .padding(20.dp)
            .border(3.dp, Color.Green)
            .padding(20.dp)
    )
}


@Composable
fun TextViewsClick(name: String)  {

    Text(
        text = name.repeat(1),
        color = Color.Blue,
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier
            .padding(16.dp)
            .padding(10.dp)
            .fillMaxWidth()

    )
}

@Composable
fun MyRowText(name: String) {
    Text(text = name,
        fontSize = 16.sp,
        modifier = Modifier
            .width(100.dp)
            .height(50.dp)
            .padding(10.dp)
            .background(color = Color.Magenta)
            .padding(5.dp))

}