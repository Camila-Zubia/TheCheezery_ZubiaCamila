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
import zubia.camila.thecheezery.components.WelcomeBanner

@Composable
fun WelcomeScreen(innerPadding: PaddingValues, onStartedClick: ()-> Unit){
    Column(Modifier.fillMaxSize()) {
        Image(painter = painterResource(R.drawable.the_cheezery), contentDescription = "the cheezery logo")
        WelcomeBanner(onStartedClick)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewWelcomeScreem(){
    WelcomeScreen(PaddingValues(), {})
}