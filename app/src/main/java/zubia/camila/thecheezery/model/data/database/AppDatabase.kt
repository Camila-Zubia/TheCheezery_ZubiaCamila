package zubia.camila.thecheezery.model.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import zubia.camila.thecheezery.model.data.database.dao.ComboDao
import zubia.camila.thecheezery.model.data.database.dao.ProductComboDao
import zubia.camila.thecheezery.model.data.database.entity.Combo
import zubia.camila.thecheezery.model.data.database.entity.ProductCombo

@Database(
    entities = [
        Product::class,
        Combo::class,
        ProductCombo::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase: RoomDatabase(){
    abstract fun productDao(): ProductDao
    abstract fun comboDao(): ComboDao
    abstract fun productComboDao(): ProductComboDao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "cheezery.db"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
                instance
            }
        }
    }
}