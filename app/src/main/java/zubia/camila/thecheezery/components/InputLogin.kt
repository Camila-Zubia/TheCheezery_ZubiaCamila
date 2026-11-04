package zubia.camila.thecheezery.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.SecureTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import zubia.camila.thecheezery.utilities.Brighter_Pink
import zubia.camila.thecheezery.utilities.Dusty_white

@Composable
fun InputLogin(onEntrarClick: ()-> Unit){
    Column(Modifier.fillMaxWidth().padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween) {
        TextField(state = TextFieldState(), label = { Text("Correo electrónico") }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email))
        Spacer(Modifier.size(20.dp))
        SecureTextField(keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            state = TextFieldState(), label= { Text("Contraseña")})
        Spacer(Modifier.size(20.dp))
        Button(onEntrarClick,
            colors = ButtonColors(Brighter_Pink, Dusty_white,
                Brighter_Pink, Dusty_white
            )){
            Text("Entrar")
        }
    }
}