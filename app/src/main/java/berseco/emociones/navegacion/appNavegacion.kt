package berseco.emociones.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import berseco.emociones.pantallas.definicion
import berseco.emociones.pantallas.emociones
import berseco.emociones.pantallas.principal
import berseco.emociones.pantallas.siento

@Composable
fun appNavegacion(){

    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = appPantallas.principal.Ruta){

        composable(route = appPantallas.principal.Ruta){
            principal(navController)

        }

        composable(route = appPantallas.definicion.Ruta + "/{text}",
            arguments = listOf(navArgument(name="text"){
                type= NavType.StringType
            })){
            definicion(navController, it.arguments?.getString("text"))

        }

        composable(route = appPantallas.emociones.Ruta){
            emociones(navController)

        }

        composable(route = appPantallas.siento.Ruta){
            siento(navController)

        }

    }
}

