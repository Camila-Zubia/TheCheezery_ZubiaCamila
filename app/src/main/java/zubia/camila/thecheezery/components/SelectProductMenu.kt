package zubia.camila.thecheezery.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import zubia.camila.thecheezery.model.data.database.Product
import zubia.camila.thecheezery.ui.theme.Typography
import zubia.camila.thecheezery.utilities.Less_Purple
import zubia.camila.thecheezery.utilities.Very_purple

@Composable
fun SelectProductsMenu(
    lista: List<Product>,
    selectedIds: List<Int>,
    onToggleProduct: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(
            items = lista,
            key = { it.id }
        ) { p ->
            val isChecked = p.id in selectedIds

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onToggleProduct(p.id) }
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(Modifier.weight(1f)) {
                    p.image?.let {
                        Image(
                            painter = painterResource(it),
                            contentDescription = p.name
                        )
                    }
                }
                Column(Modifier.weight(2f)) {
                    Text(
                        text = p.name,
                        style = Typography.titleLarge,
                        color = Less_Purple
                    )
                    p.description?.let { Text(it) }
                }
                Row(
                    modifier = Modifier.weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "$" + p.price,
                        color = Very_purple,
                        style = Typography.titleMedium
                    )
                    Checkbox(
                        checked = isChecked,
                        onCheckedChange = { onToggleProduct(p.id) }
                    )
                }
            }
        }
    }
}