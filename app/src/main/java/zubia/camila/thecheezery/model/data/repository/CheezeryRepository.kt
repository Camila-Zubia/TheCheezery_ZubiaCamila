package zubia.camila.thecheezery.model.data.repository

import kotlinx.coroutines.flow.Flow
import zubia.camila.thecheezery.model.data.database.AppDatabase
import zubia.camila.thecheezery.model.data.database.Product
import zubia.camila.thecheezery.model.data.database.entity.Combo
import zubia.camila.thecheezery.model.data.database.entity.ProductCombo

class CheezeryRepository(private val database: AppDatabase){
    private val productDao = database.productDao()
    private val comboDao = database.comboDao()
    private val productComboDao = database.productComboDao()

    suspend fun insertProduct(product: Product): Long{
        return productDao.insertProduct(product)
    }

    suspend fun insertProducts(products: List<Product>){
        productDao.insertProducts(products)
    }

    suspend fun updateProduct(product: Product){
        productDao.updateProduct(product)
    }

    suspend fun deleteProduct(product: Product){
        productDao.deleteProduct(product)
    }

    fun getAllProducts(): Flow<List<Product>>{
        return productDao.getAllProducts()
    }

    suspend fun getProductById(productId: Int): Product?{
        return productDao.getProductById(productId)
    }

    fun searchProducts(name: String): Flow<List<Product>>{
        return productDao.searchProducts(name)
    }
    suspend fun insertCombo(combo: Combo): Long{
        return comboDao.insertCombo(combo)
    }

    suspend fun insertCombos(combos: List<Combo>){
        comboDao.insertCombos(combos)
    }

    suspend fun updateCombo(combo: Combo){
        comboDao.updateCombo(combo)
    }

    suspend fun deleteCombo(combo: Combo){
        comboDao.deleteCombo(combo)
    }

    fun getAllCombos(): Flow<List<Combo>>{
        return comboDao.getAllCombos()
    }

    suspend fun getComboById(comboId: Int): Combo?{
        return comboDao.getComboById(comboId)
    }

    fun searchCombos(name: String): Flow<List<Combo>>{
        return comboDao.searchCombos(name)
    }

    suspend fun insertProductCombo(productCombo: ProductCombo): Long{
        return productComboDao.insertProductCombo(productCombo)
    }

    suspend fun insertProductCombos(productCombos: List<ProductCombo>){
        productComboDao.insertProductCombos(productCombos)
    }

    suspend fun updateProductCombo(productCombo: ProductCombo){
        productComboDao.updateProductCombo(productCombo)
    }

    suspend fun deleteProductCombo(productCombo: ProductCombo){
        productComboDao.deleteProductCombo(productCombo)
    }

    fun getAllProductCombos(): Flow<List<ProductCombo>>{
        return productComboDao.getAllProductCombos()
    }

    suspend fun getProductComboById(productComboId: Int): ProductCombo?{
        return productComboDao.getProductComboById(productComboId)
    }

    fun searchProductCombos(name: String): Flow<List<ProductCombo>>{
        return productComboDao.searchProductCombos(name)
    }
}