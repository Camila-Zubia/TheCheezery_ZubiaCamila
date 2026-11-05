package zubia.camila.thecheezery.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import zubia.camila.thecheezery.model.dominio.Product
import zubia.camila.thecheezery.utilities.Brighter_Pink
import zubia.camila.thecheezery.utilities.Dusty_white
import zubia.camila.thecheezery.utilities.Less_Purple
import zubia.camila.thecheezery.utilities.Pinky
import zubia.camila.thecheezery.utilities.Very_purple
import kotlin.collections.listOf

@Composable
fun MenuOptions(onSelectOption: (opcion: String) -> Unit){
    Row(Modifier.fillMaxWidth().padding(horizontal = 40.dp), horizontalArrangement = Arrangement.spacedBy(10.dp)) {
        Column(Modifier.weight(1f).background(brush = Brush.verticalGradient(colors = listOf(Brighter_Pink, Pinky,
            Less_Purple, Very_purple))).padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(30.dp)) {
            Row(Modifier.clickable(onClick = { onSelectOption("hot") }), horizontalArrangement = Arrangement.Center) {
                Text("Hot drinks", color = Dusty_white)
            }
            Row(Modifier.clickable(onClick = { onSelectOption("salties") }), horizontalArrangement = Arrangement.Center) {
                Text("Salties", color = Dusty_white)
            }
            Row(Modifier.clickable(onClick = { onSelectOption("combos") }), horizontalArrangement = Arrangement.Center) {
                Text("Combos", color = Dusty_white)
            }
        }
        Column(Modifier.weight(1f).background(brush = Brush.verticalGradient(colors = listOf(Brighter_Pink, Pinky,
            Less_Purple, Very_purple))).padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(30.dp)) {
            Row(Modifier.clickable(onClick = { onSelectOption("cold") }), horizontalArrangement = Arrangement.Center) {
                Text("Cold drinks", color = Dusty_white)
            }
            Row(Modifier.clickable(onClick = { onSelectOption("sweets") }), horizontalArrangement = Arrangement.Center) {
                Text("Sweets", color = Dusty_white)
            }
            Row(Modifier.clickable(onClick = { onSelectOption("hot") }), horizontalArrangement = Arrangement.Center) {
                Text("Add new product", color = Dusty_white)
            }
        }
    }
}
