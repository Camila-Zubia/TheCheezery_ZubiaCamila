package zubia.camila.thecheezery.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import zubia.camila.thecheezery.model.data.database.Product

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
