package zubia.camila.thecheezery.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import zubia.camila.thecheezery.R
import zubia.camila.thecheezery.utilities.Less_Purple

@Composable
fun CheezeryBanner(){
    Row(Modifier.fillMaxWidth().padding(45.dp), horizontalArrangement = Arrangement.Center) {
        Image(painterResource(R.drawable.grupo1), "cheezery logo sin cupcake")
    }
}

@Composable
fun CheezeryBannerCupcake(){
    Column(Modifier.fillMaxWidth().padding(45.dp)) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
            Box(Modifier.background(color = Less_Purple, shape = CircleShape).size(40.dp), contentAlignment = Alignment.Center) {
                Image(painterResource(R.drawable.cart), contentDescription = "carrito de compras")
            }
        }
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Image(painterResource(R.drawable.grupo2), "cheezery logo con cupcake")
        }
    }
}