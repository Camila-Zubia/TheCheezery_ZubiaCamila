package zubia.camila.thecheezery.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import zubia.camila.thecheezery.components.CheezeryBannerCupcake
import zubia.camila.thecheezery.components.MenuOptions

@Composable
fun MenuScreen(innerPadding: PaddingValues){
    Column(Modifier.fillMaxSize()) {
        CheezeryBannerCupcake()
        MenuOptions()
    }
}

@Preview(showBackground = true)
@Composable
fun MenuScreensPreview(){
    MenuScreen(PaddingValues())
}