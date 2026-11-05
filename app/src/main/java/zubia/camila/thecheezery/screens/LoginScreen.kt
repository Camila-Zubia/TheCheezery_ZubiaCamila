package zubia.camila.thecheezery.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import zubia.camila.thecheezery.R
import zubia.camila.thecheezery.components.CheezeryBanner
import zubia.camila.thecheezery.components.InputLogin
import zubia.camila.thecheezery.components.WelcomeBanner
import zubia.camila.thecheezery.viewmodel.ClientViewModel

@Composable
fun LoginScreen(innerPadding: PaddingValues, viewModel: ClientViewModel, onEntrarClick: ()-> Unit){
    Column(Modifier.fillMaxSize()) {
        CheezeryBanner()
        InputLogin(viewModel, onEntrarClick)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen(){
    LoginScreen(PaddingValues(), ClientViewModel(), {})
}
