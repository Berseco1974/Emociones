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
fun siento(navController: NavController){

   Scaffold (){

    }

    ContenidoCuerpos(navController)
    }
@Composable
fun ContenidoCuerpos(navController: NavController) {

    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text ="pantalla siento")
        Button(onClick = { /*TODO*/ }) {
            Text(text = "primeros pasos")
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