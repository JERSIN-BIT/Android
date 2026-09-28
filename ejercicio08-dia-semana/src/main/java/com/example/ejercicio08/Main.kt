package com.example.ejercicio08

enum class DiaSemana {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO
}

fun main() {
    print("Ingresa un numero del 1 al 7: ")
    val numero = readlnOrNull()?.toIntOrNull()

    if (numero == null || numero !in 1..DiaSemana.values().size) {
        println("Entrada no valida. Debes escribir un numero del 1 al 7.")
        return
    }

    println(DiaSemana.values()[numero - 1])
}