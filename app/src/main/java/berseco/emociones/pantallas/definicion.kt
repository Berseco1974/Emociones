package berseco.emociones.pantallas

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun definicion (navController: NavController, text: String?){

   Scaffold (){

    }

    ContenidoCuerpod(navController, text)
    }
@Composable
fun ContenidoCuerpod(navController: NavController, text: String?) {

    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "yo solo")
        Button(onClick = { /*TODO*/ }) {
            Text(text = "primeros pasos")
        }
        
        text?.let {
            Text(text = it)
        }

        when (text){

            "Alegría" -> {
                Text(text = "Es una emoción positiva promovida por algo que nos gusta o" +
                        " emociona, se caracteriza por sentimiento de felicidad, entusiasmo, " +
                        "bienestar, satisfacción y gozo.")
            }

            "Tristeza"  -> {
                Text(text = "emoción negativa por motivos de pérdida, " +
                        "decepción o frustración, también se percibe como melancolía," +
                        " pesar, desánimo o falta de alegría.")
            }

            "Miedo" -> {
                Text(text = "Es una emoción que nos pone en alerta, surge" +
                        " en respuesta a un peligro o amenaza, se manifiesta como ansiedad," +
                        " temor o nerviosismo.")
            }
        }
    }
}
/*
@Preview
@Composable
fun VistaDefectod(){

    siento()
}

 */