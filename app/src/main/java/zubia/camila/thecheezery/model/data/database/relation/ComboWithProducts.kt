package zubia.camila.thecheezery.model.data.database

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import zubia.camila.thecheezery.model.data.database.entity.Combo
import zubia.camila.thecheezery.model.data.database.entity.ProductCombo

data class ComboWithProducts(
    @Embedded
    val combo: Combo,
    @Relation(
        parentColumn = "idCombo",
        entityColumn = "idProduct",
        associateBy = Junction(
            value = ProductCombo::class,
            parentColumn = "idCombo",
            entityColumn = "idProduct"
        )
    )
    val products: List<Product>
)