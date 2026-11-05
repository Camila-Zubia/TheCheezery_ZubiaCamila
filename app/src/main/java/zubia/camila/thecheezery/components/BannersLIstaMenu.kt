package zubia.camila.thecheezery.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import zubia.camila.thecheezery.R
import zubia.camila.thecheezery.ui.theme.Typography
import zubia.camila.thecheezery.utilities.Pinky

val fontHelloBunny = FontFamily(
    Font(R.font.hello_bunny, FontWeight.Light),
    Font(R.font.hello_bunny, FontWeight.Bold)
)

@Composable
fun BannerSalties(){
    Row(Modifier.fillMaxWidth().padding(30.dp), horizontalArrangement = Arrangement.Center) {
        Text("Salties", style = Typography.displayLarge, fontFamily = fontHelloBunny, color = Pinky, fontSize = 88.sp)
    }
}

@Composable
fun BannerHotDrinks(){
    Row(Modifier.fillMaxWidth().padding(30.dp), horizontalArrangement = Arrangement.Center) {
        Text("Hot Drinks", style = Typography.displayLarge, fontFamily = fontHelloBunny, color = Pinky, fontSize = 88.sp)
    }
}

@Composable
fun BannerCombos(){
    Row(Modifier.fillMaxWidth().padding(30.dp), horizontalArrangement = Arrangement.Center) {
        Text("Combos", style = Typography.displayLarge, fontFamily = fontHelloBunny, color = Pinky, fontSize = 88.sp)
    }
}

@Composable
fun BannerColdDrinks(){
    Row(Modifier.fillMaxWidth().padding(30.dp), horizontalArrangement = Arrangement.Center) {
        Text("Cold Drinks", style = Typography.displayLarge, fontFamily = fontHelloBunny, color = Pinky, fontSize = 88.sp)
    }
}

@Composable
fun BannerSweets(){
    Row(Modifier.fillMaxWidth().padding(30.dp), horizontalArrangement = Arrangement.Center) {
        Text("Sweets", style = Typography.displayLarge, fontFamily = fontHelloBunny, color = Pinky, fontSize = 88.sp)
    }
}