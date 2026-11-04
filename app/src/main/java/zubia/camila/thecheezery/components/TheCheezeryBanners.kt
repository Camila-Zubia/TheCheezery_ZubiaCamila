package zubia.camila.thecheezery.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import zubia.camila.thecheezery.R

@Composable
fun CheezeryBanner(){
    Row(Modifier.fillMaxWidth().padding(45.dp), horizontalArrangement = Arrangement.Center) {
        Image(painterResource(R.drawable.grupo1), "cheezery logo sin cupcake")
    }
}

@Composable
fun CheezeryBannerCupcake(){
    Row(Modifier.fillMaxWidth().padding(45.dp), horizontalArrangement = Arrangement.Center) {
        Image(painterResource(R.drawable.grupo2), "cheezery logo con cupcake")
    }
}