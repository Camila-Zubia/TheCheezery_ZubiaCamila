package zubia.camila.thecheezery.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import zubia.camila.thecheezery.model.data.GetListByType
import zubia.camila.thecheezery.model.dominio.Product

class ClientViewModel : ViewModel() {
    var cart by mutableStateOf<List<Product>>(emptyList())
        private set

    var email by mutableStateOf("")
        private set
    var password by mutableStateOf("")
        private set
    var loginError by mutableStateOf<String?>(null)
        private set

    val total: Float get() = cart.sumOf { it.price.toDouble() }.toFloat()

    fun updateEmail(value: String) { email = value }
    fun updatePassword(value: String) { password = value }

    fun validateLogin(): Boolean {
        loginError = when {
            email.isBlank() || password.isBlank() -> "Completa ambos campos."
            !android.util.Patterns.EMAIL_ADDRESS.matcher(email.trim()).matches() -> "Ingresa un correo electrónico válido."
            else -> null
        }
        return loginError == null
    }

    fun addProduct(product: Product) { cart = cart + product }

    fun removeProduct(index: Int) {
        if (index in cart.indices) cart = cart.toMutableList().also { it.removeAt(index) }
    }

    fun productsFor(type: String): List<Product> = GetListByType(type)
}
