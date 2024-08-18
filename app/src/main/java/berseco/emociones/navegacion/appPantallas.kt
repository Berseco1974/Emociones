package berseco.emociones.navegacion

sealed class appPantallas(val Ruta: String) {

    object principal: appPantallas("principal")
    object siento: appPantallas("siento")
    object emociones: appPantallas("emociones")
    object definicion: appPantallas("definicion")

}