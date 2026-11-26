package zubia.camila.thecheezery.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import zubia.camila.thecheezery.components.SelectProductsMenu
import zubia.camila.thecheezery.model.data.database.Product

@Composable
fun AddComboScreen(
    products: List<Product>,
    onSaveCombo: (name: String, price: Float, productIds: List<Int>) -> Unit,
    onCancel: () -> Unit
) {
    var comboName by remember { mutableStateOf("") }
    var comboPrice by remember { mutableStateOf("") }
    val selectedProductIds = remember { mutableStateListOf<Int>() }

    val parsedPrice = comboPrice.toFloatOrNull()
    val isValid = comboName.isNotBlank() &&
            parsedPrice != null &&
            parsedPrice > 0f &&
            selectedProductIds.isNotEmpty()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        OutlinedTextField(
            value = comboName,
            onValueChange = { comboName = it },
            label = { Text("Nombre del combo") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        OutlinedTextField(
            value = comboPrice,
            onValueChange = { comboPrice = it },
            label = { Text("Precio del combo") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal)
        )

        SelectProductsMenu(
            lista = products,
            selectedIds = selectedProductIds,
            onToggleProduct = { productId ->
                if (selectedProductIds.contains(productId)) {
                    selectedProductIds.remove(productId)
                } else {
                    selectedProductIds.add(productId)
                }
            },
            modifier = Modifier.weight(1f)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            OutlinedButton(
                onClick = onCancel,
                modifier = Modifier.weight(1f)
            ) {
                Text("Cancelar")
            }

            Button(
                onClick = {
                    val validPrice = parsedPrice ?: return@Button
                    onSaveCombo(comboName, validPrice, selectedProductIds.toList())
                },
                enabled = isValid,
                modifier = Modifier.weight(1f)
            ) {
                Text("Guardar combo")
            }
        }
    }
}