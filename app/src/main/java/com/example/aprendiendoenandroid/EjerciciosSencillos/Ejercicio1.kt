package com.example.aprendiendoenandroid.EjerciciosSencillos

fun main() {

    imprimirNotificaciones(89)

}


fun imprimirNotificaciones(notificacion:Int){

    if (notificacion<100){

        println("Tienes: $notificacion  notificaciones.")
    }else if(notificacion>100){
        println("Tienes +99 notificaciones")
    }else{
        println("Error en el programa")
    }


}