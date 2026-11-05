package zubia.camila.mypokedex.screens

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import zubia.camila.thecheezery.components.ListaOrden
import zubia.camila.thecheezery.components.fontHelloBunny
import zubia.camila.thecheezery.model.data.sweets
import zubia.camila.thecheezery.model.dominio.Product
import zubia.camila.thecheezery.ui.theme.Typography
import zubia.camila.thecheezery.utilities.Pinky
import zubia.camila.thecheezery.utilities.Very_purple

@Composable
fun OrderScreen(innerPadding: PaddingValues, orden: List<Product>, total: Float = orden.sumOf { it.price.toDouble() }.toFloat(), onRemove: (Int) -> Unit = {}){
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Column() {
            Row(Modifier.fillMaxWidth().padding(30.dp), horizontalArrangement = Arrangement.Center) {
                Text("My Order", style = Typography.displayLarge, fontFamily = fontHelloBunny, color = Pinky, fontSize = 88.sp)
            }
            ListaOrden(orden, onRemove)
        }
        Row(Modifier.fillMaxWidth().padding(30.dp), horizontalArrangement = Arrangement.End) {
            Text("Total", fontSize = 40.sp)
            Text("$" + String.format(java.util.Locale.US, "%.1f", total), fontSize = 50.sp, color = Very_purple)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewOrderScreen(){
    OrderScreen(PaddingValues(), sweets)
}
