package kk.jetpackcompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kk.diveder.DividerHeight
import kk.diveder.DividerHeightBackground
import kk.jetpackcompose.ui.theme.JetPackComposeTheme
import kk.spacer.SpacerHeight
import kk.text.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android  ")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column{
        TextViews(name)
        CircularFillTextViews(name)
        SpacerHeight(10)
        CircularBorderTextViews(name)
        DividerHeight(4)
        SelectionContainer() {
            SingleBorderTextView(name = name)
        }
        Spacer(modifier = Modifier.height(20.dp))
        DoubleBorderTextView(name = name)

        DividerHeightBackground(3, Color.Magenta)
        SpacerHeight(height = 20)

        TextViewsClick(name = name)
        
    }
    
}

@Preview(showBackground = true, name = "light mode",
uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreview() {
    JetPackComposeTheme {
        Greeting("Android os")
    }
}