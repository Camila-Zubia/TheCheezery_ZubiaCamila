package zubia.camila.thecheezery.model.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import zubia.camila.thecheezery.model.data.database.entity.ProductCombo

@Dao
interface ProductComboDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProductCombo(productCombo: ProductCombo): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProductCombos(productCombos: List<ProductCombo>)

    @Update
    suspend fun updateProductCombo(productCombo: ProductCombo)

    @Delete
    suspend fun deleteProductCombo(productCombo: ProductCombo)

    @Query("SELECT * FROM ProductsCombo")
    fun getAllProductCombos(): Flow<List<ProductCombo>>

    @Query("SELECT * FROM ProductsCombo WHERE idProductCombo = :productComboId")
    suspend fun getProductComboById(productComboId: Int): ProductCombo?

    @Query(
        """
        SELECT pc.* FROM ProductsCombo pc
        INNER JOIN Products p ON pc.idProduct = p.idProduct
        WHERE p.nameProduct LIKE '%' || :name || '%'
        """
    )
    fun searchProductCombos(name: String): Flow<List<ProductCombo>>
}