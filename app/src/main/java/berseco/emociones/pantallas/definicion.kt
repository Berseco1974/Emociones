package berseco.emociones.pantallas

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

        
        text?.let {
            Text(text = it, fontSize = 40.sp, color = Color.Blue)
        }

        Spacer(modifier = Modifier.size(32.dp))

        when (text){

            "Alegría" -> {
                Text(text = "Es una emoción positiva promovida por algo que nos gusta o" +
                        " emociona, se caracteriza por sentimiento de felicidad, entusiasmo, " +
                        "bienestar, satisfacción y gozo.",
                    fontSize = 20.sp, color = Color.White,
                    modifier = Modifier.padding(horizontal = 15.dp)
                        .background(Color.Blue))
            }

            "Tristeza"  -> {
                Text(text = "emoción negativa por motivos de pérdida, " +
                        "decepción o frustración, también se percibe como melancolía," +
                        " pesar, desánimo o falta de alegría.",
                    fontSize = 20.sp, color = Color.White,
                    modifier = Modifier.padding(horizontal = 15.dp)
                        .background(Color.Blue))
            }

            "Miedo" -> {
                Text(text = "Es una emoción que nos pone en alerta, surge" +
                        " en respuesta a un peligro o amenaza, se manifiesta como ansiedad," +
                        " temor o nerviosismo.",
                    fontSize = 20.sp, color = Color.White,
                    modifier = Modifier.padding(horizontal = 15.dp)
                        .background(Color.Blue))
            }
            "Ira" -> {
                Text(text = "",
                    fontSize = 20.sp, color = Color.White,
                    modifier = Modifier.padding(horizontal = 15.dp)
                        .background(Color.Blue))
            }

            "Sorpresa" -> {
                Text(text = "" +
                        "",
                    fontSize = 20.sp, color = Color.White,
                    modifier = Modifier.padding(horizontal = 15.dp)
                        .background(Color.Blue))
            }
            "Asco" -> {
                Text(text = "",
                    fontSize = 20.sp, color = Color.White,
                    modifier = Modifier.padding(horizontal = 15.dp)
                        .background(Color.Blue))
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