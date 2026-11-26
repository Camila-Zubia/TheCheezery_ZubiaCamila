package zubia.camila.thecheezery.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import zubia.camila.thecheezery.R
import zubia.camila.thecheezery.model.data.database.Product
import zubia.camila.thecheezery.ui.theme.PurpleGrey40
import zubia.camila.thecheezery.ui.theme.Typography
import zubia.camila.thecheezery.utilities.DisabledGrey
import zubia.camila.thecheezery.utilities.Dusty_white
import zubia.camila.thecheezery.utilities.Very_purple

@Composable
fun ListaOrden(orden: List<Product>, onRemove: (Int) -> Unit){
    if (orden.isEmpty()) {
        Box(Modifier.fillMaxWidth().height(420.dp), contentAlignment = Alignment.Center) {
            Text("Add some products to your order!", textAlign = TextAlign.Center)
        }
        return
    }
    LazyColumn() {
        items(orden.size){ index ->
            val p = orden[index]
            Row(Modifier.fillMaxWidth().padding(40.dp, 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text(p.name, style = Typography.titleMedium)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("$" + p.price, color = Very_purple, style = Typography.titleMedium)
                    FilledIconButton(onClick = { onRemove(index) }, colors = IconButtonColors(
                        containerColor = Dusty_white,
                        contentColor = Dusty_white,
                        disabledContainerColor = DisabledGrey,
                        disabledContentColor = PurpleGrey40
                    ) ) {
                        Image(painterResource(R.drawable.delete), contentDescription = "add cart")
                    }
                }
            }
        }
    }
}
