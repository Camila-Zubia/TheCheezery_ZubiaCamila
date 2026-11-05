package zubia.camila.thecheezery.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import zubia.camila.thecheezery.components.MenuByType
import zubia.camila.thecheezery.model.dominio.Product
import zubia.camila.thecheezery.viewmodel.ClientViewModel

@Composable
fun ListaMenuScreen(innerPadding: PaddingValues, type: String, viewModel: ClientViewModel){
    Column(Modifier.fillMaxSize()) {
        MenuByType(type, viewModel.productsFor(type), viewModel::addProduct)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewListaMenu(){
    ListaMenuScreen(PaddingValues(), "sweets", ClientViewModel())
}
