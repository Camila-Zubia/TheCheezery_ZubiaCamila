package zubia.camila.thecheezery.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import zubia.camila.thecheezery.model.data.InitialProducts
import zubia.camila.thecheezery.model.data.database.AppDatabase
import zubia.camila.thecheezery.model.data.database.ComboWithProducts
import zubia.camila.thecheezery.model.data.database.Product
import zubia.camila.thecheezery.model.data.repository.CheezeryRepository

class ClientViewModel(
    private val repository: CheezeryRepository
) : ViewModel() {

    companion object {
        fun Factory(context: Context): ViewModelProvider.Factory =
            object : ViewModelProvider.Factory {
                @Suppress("UNCHECKED_CAST")
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    if (modelClass.isAssignableFrom(ClientViewModel::class.java)) {
                        val database = AppDatabase.getInstance(context.applicationContext)
                        val repository = CheezeryRepository(database)
                        return ClientViewModel(repository) as T
                    }
                    throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
                }
            }
    }

    var cart by mutableStateOf<List<Product>>(emptyList())
        private set

    var email by mutableStateOf("")
        private set
    var password by mutableStateOf("")
        private set
    var loginError by mutableStateOf<String?>(null)
        private set

    val products: StateFlow<List<Product>> = repository.getAllProducts()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = emptyList()
        )

    val combosWithProducts: StateFlow<List<ComboWithProducts>> = repository.getCombosWithProducts()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = emptyList()
        )

    val total: Float get() = cart.sumOf { it.price.toDouble() }.toFloat()

    init {
        seedInitialProductsIfEmpty()
    }

    private fun seedInitialProductsIfEmpty() {
        viewModelScope.launch {
            if (repository.getAllProducts().stateIn(viewModelScope).value.isEmpty()) {
                repository.insertProducts(InitialProducts.all())
            }
        }
    }

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

    fun addProduct(product: Product) {
        cart = cart + product
    }

    fun removeProduct(index: Int) {
        if (index in cart.indices) {
            cart = cart.toMutableList().also { it.removeAt(index) }
        }
    }

    fun saveCombo(name: String, price: Float, productIds: List<Int>, onSuccess: () -> Unit = {}) {
        viewModelScope.launch {
            repository.createComboWithProducts(
                name = name.trim(),
                price = price,
                productIds = productIds
            )
            onSuccess()
        }
    }
}