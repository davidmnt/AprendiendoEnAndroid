package com.example.aprendiendoenandroid

fun main() {

   // arrays()
   // listasInmutables()
    listasMutables()

}

fun arrays() {
    var Empleados = arrayOf("David", "Juan", "Miguel")

    for (i in Empleados.indices) {

        println(Empleados[i])
    }

}

fun listasInmutables() {

    var Empleados: List<String> = listOf("David", "Juan", "Miguel")
    println(Empleados.last())

    //Filtrar listas

    val example = Empleados.filter { it.contains('d') }

    println(example)

    //For each con listas

    Empleados.forEach { nombres -> println(nombres) }


}

fun listasMutables(){

    var Empleados:MutableList<String> = mutableListOf("David", "Juan", "Miguel")

    Empleados.add("Pepe")
    Empleados.add(0,"Carasa")

    println(Empleados)

    println("Condicion:")

    if(Empleados.isEmpty()){
        println("Lista vacia")
    }else{
        Empleados.forEach { a -> println(a) }
    }

}
