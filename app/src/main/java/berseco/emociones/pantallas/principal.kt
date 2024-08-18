package berseco.emociones.pantallas

import android.annotation.SuppressLint
import android.icu.text.CaseMap.Title
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import berseco.emociones.navegacion.appPantallas

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun principal(navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                Icon(imageVector = Icons.Default.AccountBox,
                    contentDescription = "al carajo")},

                title = {

                    Text(text = "lo hice")
                })


        }
    ) {
            ContenidoCuerpo(navController = navController)
    }
}
@Composable
fun ContenidoCuerpo(navController: NavController) {

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "yo solo, pantalla principal")
        Button(onClick = {
            navController.navigate(route = appPantallas.emociones.Ruta)
        }) {
            Text(text = "Diccionario de emociones")
        }
    }
}


