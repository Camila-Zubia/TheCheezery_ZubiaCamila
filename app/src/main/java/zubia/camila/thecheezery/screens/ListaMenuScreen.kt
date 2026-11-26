package zubia.camila.thecheezery.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import zubia.camila.thecheezery.components.MenuByType
import zubia.camila.thecheezery.viewmodel.ClientViewModel

@Composable
fun ListaMenuScreen(
    innerPadding: PaddingValues,
    type: String,
    viewModel: ClientViewModel
) {
    val allProducts by viewModel.products.collectAsState()
    val filteredProducts = remember(allProducts, type) {
        allProducts.filter { it.category.equals(type, ignoreCase = true) }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ) {
        MenuByType(type, filteredProducts, viewModel::addProduct)
    }
}