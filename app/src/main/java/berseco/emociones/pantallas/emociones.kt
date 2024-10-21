package berseco.emociones.pantallas

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.Style
import androidx.navigation.NavController
import berseco.emociones.R
import berseco.emociones.navegacion.Botones
import berseco.emociones.navegacion.appPantallas
import org.intellij.lang.annotations.JdkConstants.FontStyle

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun emociones(navController: NavController){

   Scaffold (){

    }

    ContenidoCuerpoe(navController)
    }
@Composable
fun ContenidoCuerpoe(navController: NavController) {

    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {

        val BotonEmo= Botones()


            Row {

                BotonEmo.BtDicionario(
                    ImagenPoner = R.drawable.alegria,
                    Tutilo = "Alegría",
                    navController = navController
                )
                BotonEmo.BtDicionario(
                    ImagenPoner = R.drawable.tristeza,
                    Tutilo = "Tristeza",
                    navController = navController
                )

            }
        Row {

            BotonEmo.BtDicionario(
                ImagenPoner = R.drawable.miedo,
                Tutilo = "Miedo",
                navController = navController
            )
            BotonEmo.BtDicionario(
                ImagenPoner = R.drawable.ira,
                Tutilo = "Ira",
                navController = navController
            )
        }
        Row {

            BotonEmo.BtDicionario(
                ImagenPoner = R.drawable.sorpresa,
                Tutilo = "Sorpresa",
                navController = navController
            )
            BotonEmo.BtDicionario(
                ImagenPoner = R.drawable.asco,
                Tutilo = "Asco",
                navController = navController
            )
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