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
import berseco.emociones.navegacion.appPantallas

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun emociones(navController: NavController){

   Scaffold (){

    }

    ContenidoCuerpoe(navController)
    }
@Composable
fun ContenidoCuerpoe(navController: NavController) {

    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "entro en las definiciones de las emociones")
        Button(onClick = {
            navController.navigate(route = appPantallas.definicion.Ruta + "/Alegría")
        }) {
            Text(text = "Alegría")
        }

        Button(onClick = {
            navController.navigate(route = appPantallas.definicion.Ruta + "/Tristeza")
        }) {
            Text(text = "Tristeza")
        }

        Button(onClick = {
            navController.navigate(route = appPantallas.definicion.Ruta + "/Miedo")
        }) {
            Text(text = "Miedo")
        }

    }
}
/*
@Preview
@Composable
fun VistaDefectoe(){

    emociones()
}
*/