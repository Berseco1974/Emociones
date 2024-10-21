package berseco.emociones.pantallas

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.BottomAppBarDefaults.bottomAppBarFabColor
import androidx.compose.material3.BottomAppBarState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import berseco.emociones.navegacion.appNavegacion

@Composable
fun BottomAppBarComun(){

BottomAppBar(){

    IconButton(onClick = { /*TODO*/ }) {
     //   Icon(imageVector = Icons.Default.CheckCircle, contentDescription = "parte de abajo")
        Text(text = "conseguido")
    }
}
}