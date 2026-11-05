package zubia.camila.thecheezery.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import zubia.camila.thecheezery.model.dominio.Product

@Composable
fun MenuByType(type: String, products: List<Product>, onAddProduct: (Product) -> Unit){
    Column() {
        when(type){
            "salties" -> BannerSalties()
            "hot" -> BannerHotDrinks()
            "sweets" -> BannerSweets()
            "cold" -> BannerColdDrinks()
            "combos" -> BannerCombos()
        }

        ListaProductos(products, onAddProduct)
    }
}
