package zubia.camila.thecheezery.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import zubia.camila.thecheezery.ui.theme.Typography
import zubia.camila.thecheezery.utilities.Brighter_Pink
import zubia.camila.thecheezery.utilities.Dusty_white
import zubia.camila.thecheezery.utilities.Purple_grey

@Composable
fun WelcomeBanner(onStartedClick: ()-> Unit){
    Column(Modifier.fillMaxSize().background(color= Purple_grey).padding(30.dp),
        verticalArrangement = Arrangement.SpaceBetween) {
        Row(Modifier.fillMaxWidth(), Arrangement.Center) {
            Text("Welcome to The Cheezery", style = Typography.titleLarge, color = Dusty_white)
        }
        Row(Modifier.fillMaxWidth(), Arrangement.Start) {
            Text("Home of the most wonderful desserts ever seen (and tasted) by the human being",
                style = Typography.bodyLarge, color = Dusty_white, fontStyle = FontStyle.Italic)
        }
        Row(Modifier.fillMaxWidth(), Arrangement.Center) {
            Button(onClick = {}, colors = ButtonColors(containerColor = Brighter_Pink,
                contentColor = Dusty_white, disabledContentColor = Dusty_white,
                disabledContainerColor = Brighter_Pink)) {
                Text("Get started!")
            }
        }
    }
}