package zubia.camila.thecheezery.navigation

import androidx.compose.ui.tooling.preview.Preview
import kotlinx.serialization.Serializable

@Serializable
object Welcome

@Serializable
object Login

@Serializable
object Menu

@Serializable
data class ListaMenu(val opcion: String)

@Serializable
object Order
