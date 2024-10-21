package berseco.emociones.navegacion

import android.media.Image
import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import berseco.emociones.R
import androidx.navigation.NavController
import berseco.emociones.navegacion.appPantallas

class Botones {


    @Composable
    @Stable
    fun BtDicionario(ImagenPoner:Int, Tutilo:String, navController: NavController) {

        Button(onClick =
        { navController.navigate(route = appPantallas.definicion.Ruta + "/" + Tutilo) }
        ,
        shape = RectangleShape // Boton rectagular sin redondear los bordes

    ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Spacer(modifier = Modifier.size(5.dp))

                Image(
                    painter = painterResource(id = ImagenPoner),
                    contentDescription = Tutilo,
                    modifier = Modifier.width(170.dp)
                )
                Spacer(modifier = Modifier.size(3.dp))
                Text(text = Tutilo, style = TextStyle(fontSize = 25.sp))
                Spacer(modifier = Modifier.size(3.dp))
            }


        }
    }
}