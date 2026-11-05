package zubia.camila.thecheezery.components

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import zubia.camila.thecheezery.R
import zubia.camila.thecheezery.model.dominio.Product
import zubia.camila.thecheezery.ui.theme.PurpleGrey40
import zubia.camila.thecheezery.ui.theme.Typography
import zubia.camila.thecheezery.utilities.DisabledGrey
import zubia.camila.thecheezery.utilities.Dusty_white
import zubia.camila.thecheezery.utilities.Less_Purple
import zubia.camila.thecheezery.utilities.Very_purple

@Composable
fun ListaProductos(lista: List<Product>, onAddProduct: (Product) -> Unit){
    LazyColumn() {
        items(lista){ p ->
            Row(Modifier.fillMaxWidth().padding(20.dp), verticalAlignment = Alignment.CenterVertically) {
                Box(Modifier.weight(1f)){
                    Image(painterResource(p.image), contentDescription= p.name)
                }
                Column(Modifier.weight(2f)) {
                    Text(p.name, style = Typography.titleLarge, color = Less_Purple)
                    p.description?.let { Text(it) }
                }
                Row(Modifier.weight(1f), horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    Text("$" + p.price, color = Very_purple, style = Typography.titleMedium)
                    FilledIconButton(onClick = { onAddProduct(p) }, colors = IconButtonColors(
                        containerColor = Very_purple,
                        contentColor = Dusty_white,
                        disabledContainerColor = DisabledGrey,
                        disabledContentColor = PurpleGrey40
                    ) ) {
                        Image(painterResource(R.drawable.add_cart), contentDescription = "add cart")
                    }
                }
            }
        }
    }
}
