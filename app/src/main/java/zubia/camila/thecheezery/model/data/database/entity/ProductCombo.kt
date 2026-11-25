package zubia.camila.thecheezery.model.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import zubia.camila.thecheezery.model.dominio.Product

@Entity(
    tableName = "ProductsCombo",
    foreignKeys = [
        ForeignKey(
            entity = Product::class,
            parentColumns = ["idProduct"],
            childColumns = ["idProduct"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Combo::class,
            parentColumns = ["idCombo"],
            childColumns = ["idCombo"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = ["idProduct"]),
        Index(value = ["idCombo"]),
        Index(value = ["idProduct", "idCombo"], unique = true)
    ]
)
data class ProductCombo(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idProductCombo")
    val id: Int = 0,
    @ColumnInfo(name = "nameProductCombo")
    val name: String,
    @ColumnInfo(name = "priceProductCombo")
    val price: Float
)
