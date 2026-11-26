package zubia.camila.thecheezery.model.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import zubia.camila.thecheezery.model.data.database.ComboWithProducts
import zubia.camila.thecheezery.model.data.database.entity.Combo

@Dao
interface ComboDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCombo(combo: Combo): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCombos(combos: List<Combo>)

    @Update
    suspend fun updateCombo(combo: Combo)

    @Delete
    suspend fun deleteCombo(combo: Combo)

    @Query("SELECT * FROM Combos")
    fun getAllCombos(): Flow<List<Combo>>

    @Query("SELECT * FROM Combos WHERE idCombo = :comboId")
    suspend fun getComboById(comboId: Int): Combo?

    @Query("SELECT * FROM Combos WHERE nameCombo LIKE '%' || :name || '%'")
    fun searchCombos(name: String): Flow<List<Combo>>

    @Transaction
    @Query("SELECT * FROM Combos")
    fun getCombosWithProducts(): Flow<List<ComboWithProducts>>
}