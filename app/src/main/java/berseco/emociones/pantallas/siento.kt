package berseco.emociones.pantallas

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun siento(navController: NavController){

   Scaffold (){

    }

    ContenidoCuerpos(navController)
    }
@Composable
fun ContenidoCuerpos(navController: NavController) {

    var slidePosition by remember { mutableStateOf(0f) }
    var slidePosition2 by remember { mutableStateOf(0f) }
    var Animo: String = ""
    var Energia: String = ""

    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text ="pantalla siento")
        Button(onClick = { /*TODO*/ }) {
            Text(text = "primeros pasos")
        }

        Slider(value = slidePosition,
            onValueChange = {slidePosition = it},
            colors = SliderDefaults.colors(
                thumbColor = MaterialTheme.colorScheme.inversePrimary,
                activeTrackColor = MaterialTheme.colorScheme.secondary,
                inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer
            ),
            steps = 9,
            valueRange = -5f..5f

        )
       Text(text = slidePosition.toFloat().toInt().toString()).toString()
        Animo= slidePosition.toFloat().toInt().toString()


    Slider(value = slidePosition2,
        onValueChange = {slidePosition2 = it},
        colors = SliderDefaults.colors(
            thumbColor = MaterialTheme.colorScheme.inversePrimary,
            activeTrackColor = MaterialTheme.colorScheme.secondary,
            inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer
        ),
        steps = 9,
        valueRange = -5f..5f

    )
    Text(text = slidePosition2.toFloat().toInt().toString()).toString()

        Energia= slidePosition2.toFloat().toInt().toString()

        when{

            Animo=="-1" && Energia=="-1" -> {
                Text(text = "Apatico:")

            }
            Animo=="-1" && Energia=="-2" -> {
                Text(text = "Aburrido: ")

            }
            Animo=="-1" && Energia=="-3" -> {
                Text(text = "Cansado: ")
            }
            Animo=="-1" && Energia=="-4" -> {
                Text(text = "Fatigado:  ")

            }
            Animo=="-1" && Energia=="-5" -> {
                Text(text = "Agotado: ")

            }
            Animo=="-1" && Energia=="1" -> {
                Text(text = "Tocado: ")

            }
            Animo=="-1" && Energia=="2" -> {
                Text(text = "Molesto: ")

            }
            Animo=="-1" && Energia=="3" -> {
                Text(text = "Inquieto: ")

            }
            Animo=="-1" && Energia=="4" -> {
                Text(text = "Aturdido: ")

            }
            Animo=="-1" && Energia=="5" -> {
                Text(text = "conmocionado: ")

            }

            Animo=="-2" && Energia=="-1" -> {
                Text(text = "Decaido: ")

            }
            Animo=="-2" && Energia=="-2" -> {
                Text(text = "Tiste: ")

            }
            Animo=="-2" && Energia=="-3" -> {
                Text(text = "Desconsolado: ")
            }
            Animo=="-2" && Energia=="-4" -> {
                Text(text = "Exhausto:  ")

            }
            Animo=="-2" && Energia=="-5" -> {
                Text(text = "Devastado: ")

            }
            Animo=="-2" && Energia=="1" -> {
                Text(text = "Desasosegado: ")

            }
            Animo=="-2" && Energia=="2" -> {
                Text(text = "Irritado: ")

            }
            Animo=="-2" && Energia=="3" -> {
                Text(text = "Nervioso: ")

            }
            Animo=="-2" && Energia=="4" -> {
                Text(text = "Tenso: ")

            }
            Animo=="-2" && Energia=="5" -> {
                Text(text = "Agitado: ")

            }
            Animo=="-3" && Energia=="-1" -> {
                Text(text = "Decepcionado: ")

            }
            Animo=="-3" && Energia=="-2" -> {
                Text(text = "Desalentado: ")

            }
            Animo=="-3" && Energia=="-3" -> {
                Text(text = "Solitario: ")
            }
            Animo=="-3" && Energia=="-4" -> {
                Text(text = "Sin ganas:  ")

            }
            Animo=="-3" && Energia=="-5" -> {
                Text(text = "Desolado: ")

            }
            Animo=="-3" && Energia=="1" -> {
                Text(text = "Alarmado: ")

            }
            Animo=="-3" && Energia=="2" -> {
                Text(text = "Preocupado: ")

            }
            Animo=="-3" && Energia=="3" -> {
                Text(text = "Enojado: ")

            }
            Animo=="-3" && Energia=="4" -> {
                Text(text = "Frustrado: ")

            }
            Animo=="-3" && Energia=="5" -> {
                Text(text = "Estresado: ")

            }
            Animo=="-4" && Energia=="-1" -> {
                Text(text = "Sombrio: ")

            }
            Animo=="-4" && Energia=="-2" -> {
                Text(text = "Malhumorado: ")

            }
            Animo=="-4" && Energia=="-3" -> {
                Text(text = "Miserable: ")
            }
            Animo=="-4" && Energia=="-4" -> {
                Text(text = "Deprimido:  ")

            }
            Animo=="-4" && Energia=="-5" -> {
                Text(text = "Desesperanzado: ")

            }
            Animo=="-4" && Energia=="1" -> {
                Text(text = "Irascible: ")

            }
            Animo=="-4" && Energia=="2" -> {
                Text(text = "Aprensivo: ")

            }
            Animo=="-4" && Energia=="3" -> {
                Text(text = "Atemorizado: ")

            }
            Animo=="-4" && Energia=="4" -> {
                Text(text = "Furioso: ")

            }
            Animo=="-4" && Energia=="5" -> {
                Text(text = "Pánico: ")

            }
            Animo=="-5" && Energia=="-1" -> {
                Text(text = "Rechado: ")

            }
            Animo=="-5" && Energia=="-2" -> {
                Text(text = "Negativo: ")

            }
            Animo=="-5" && Energia=="-3" -> {
                Text(text = "Aislado: ")
            }
            Animo=="-5" && Energia=="-4" -> {
                Text(text = "Abatido:  ")

            }
            Animo=="-5" && Energia=="-5" -> {
                Text(text = "Desesperado: ")

            }
            Animo=="-5" && Energia=="1" -> {
                Text(text = "Disgustado: ")

            }
            Animo=="-5" && Energia=="2" -> {
                Text(text = "Ansioso: ")

            }
            Animo=="-5" && Energia=="3" -> {
                Text(text = "Enfurecido: ")

            }
            Animo=="-5" && Energia=="4" -> {
                Text(text = "Con cólera: ")

            }
            Animo=="-5" && Energia=="5" -> {
                Text(text = "Ira: ")

            }
            Animo=="1" && Energia=="-1" -> {
                Text(text = "Capaz:")

            }
            Animo=="1" && Energia=="-2" -> {
                Text(text = "Calmado: ")

            }
            Animo=="1" && Energia=="-3" -> {
                Text(text = "Relajado: ")
            }
            Animo=="1" && Energia=="-4" -> {
                Text(text = "Apaecible:  ")

            }
            Animo=="1" && Energia=="-5" -> {
                Text(text = "somnoliento: ")

            }
            Animo=="1" && Energia=="1" -> {
                Text(text = "Agrdable: ")

            }
            Animo=="1" && Energia=="2" -> {
                Text(text = "Gozoso: ")

            }
            Animo=="1" && Energia=="3" -> {
                Text(text = "Energico: ")

            }
            Animo=="1" && Energia=="4" -> {
                Text(text = "Nervioso: ")

            }
            Animo=="1" && Energia=="5" -> {
                Text(text = "Somprendido: ")

            }
            Animo=="2" && Energia=="-1" -> {
                Text(text = "Cómodo: ")

            }
            Animo=="2" && Energia=="-2" -> {
                Text(text = "Seguro: ")

            }
            Animo=="2" && Energia=="-3" -> {
                Text(text = "Plácido: ")
            }
            Animo=="2" && Energia=="-4" -> {
                Text(text = "Pensativo:  ")

            }
            Animo=="2" && Energia=="-5" -> {
                Text(text = "Complacido: ")

            }
            Animo=="2" && Energia=="1" -> {
                Text(text = "Alegre: ")

            }
            Animo=="2" && Energia=="2" -> {
                Text(text = "Feliz: ")

            }
            Animo=="2" && Energia=="3" -> {
                Text(text = "Animado: ")

            }
            Animo=="2" && Energia=="4" -> {
                Text(text = " Jubiloso: ")

            }
            Animo=="2" && Energia=="5" -> {
                Text(text = "Excitado: ")

            }
            Animo=="3" && Energia=="-1" -> {
                Text(text = "Contento: ")

            }
            Animo=="3" && Energia=="-2" -> {
                Text(text = "Satisfecho: ")

            }
            Animo=="3" && Energia=="-3" -> {
                Text(text = "Sosegado: ")
            }
            Animo=="3" && Energia=="-4" -> {
                Text(text = "Pacifico:  ")

            }
            Animo=="3" && Energia=="-5" -> {
                Text(text = "Tranquilo: ")

            }
            Animo=="3" && Energia=="1" -> {
                Text(text = "Concentrado: ")

            }
            Animo=="3" && Energia=="2" -> {
                Text(text = "Esperanzado: ")

            }
            Animo=="3" && Energia=="3" -> {
                Text(text = "Entusiasta: ")

            }
            Animo=="3" && Energia=="4" -> {
                Text(text = "Motivado: ")

            }
            Animo=="3" && Energia=="5" -> {
                Text(text = "Festivo: ")

            }
            Animo=="4" && Energia=="-1" -> {
                Text(text = "Amorosidad: ")

            }
            Animo=="4" && Energia=="-2" -> {
                Text(text = "Agradecido: ")

            }
            Animo=="4" && Energia=="-3" -> {
                Text(text = "Afortunado: ")
            }
            Animo=="4" && Energia=="-4" -> {
                Text(text = "Confortable:  ")

            }
            Animo=="4" && Energia=="-5" -> {
                Text(text = "Querido: ")

            }
            Animo=="4" && Energia=="1" -> {
                Text(text = "A gusto: ")

            }
            Animo=="4" && Energia=="2" -> {
                Text(text = "Orgulloso: ")

            }
            Animo=="4" && Energia=="3" -> {
                Text(text = "Optimista: ")

            }
            Animo=="4" && Energia=="4" -> {
                Text(text = "Inspirado: ")

            }
            Animo=="4" && Energia=="5" -> {
                Text(text = "Dichoso: ")

            }
            Animo=="5" && Energia=="-1" -> {
                Text(text = "Pleno: ")

            }
            Animo=="5" && Energia=="-2" -> {
                Text(text = "Conmovido: ")

            }
            Animo=="5" && Energia=="-3" -> {
                Text(text = "Equilibrado: ")
            }
            Animo=="5" && Energia=="-4" -> {
                Text(text = "Despreocupado:  ")

            }
            Animo=="5" && Energia=="-5" -> {
                Text(text = "Sereno: ")

            }
            Animo=="5" && Energia=="1" -> {
                Text(text = "Positivo: ")

            }
            Animo=="5" && Energia=="2" -> {
                Text(text = "Encantado: ")

            }
            Animo=="5" && Energia=="3" -> {
                Text(text = "Emocionado: ")

            }
            Animo=="5" && Energia=="4" -> {
                Text(text = "Exaltado: ")

            }
            Animo=="5" && Energia=="5" -> {
                Text(text = "Eufórico: ")

            }
    }
}
}

/*
@Preview
@Composable
fun VistaDefectos(){

    siento(navController)
}
*/