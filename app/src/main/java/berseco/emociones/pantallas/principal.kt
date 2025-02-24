package berseco.emociones.pantallas

import android.annotation.SuppressLint
import android.icu.text.CaseMap.Title
import android.text.style.BackgroundColorSpan
import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import berseco.emociones.R
import berseco.emociones.navegacion.appPantallas

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun principal(navController: NavController) {


    Scaffold(
        topBar = {
            topAppBarComun("Pantalla Principal")
        },
        bottomBar =  {


            BottomAppBarComun()

        },
        //modifier = Modifier.background(Color.Blue)

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

        Button(onClick = {
            navController.navigate(route = appPantallas.emociones.Ruta)
        }) {
            Column {
                Image(painter = painterResource(id = R.drawable.dicionario), contentDescription = "Dicionario emocional")
                Spacer(modifier = Modifier.size(4.dp))
                Text(text = "Diccionario emocional", textAlign = TextAlign.Center, modifier = Modifier.height(46.dp))
                Spacer(modifier = Modifier.size(24.dp))
            }

        }

        Button(onClick = { navController.navigate(route = appPantallas.siento.Ruta) }) {

            Text(text = "¿Qué siento")
        }
    }
}


