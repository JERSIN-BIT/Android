package com.example.ejercicio10

enum class Nivel(val puntos: Int) {
    BAJO(10),
    MEDIO(50),
    ALTO(100);

    fun esMayorQue(nivel: Nivel): Boolean = puntos > nivel.puntos
}

fun main() {
    println("ALTO es mayor que MEDIO: ${Nivel.ALTO.esMayorQue(Nivel.MEDIO)}")
    println("BAJO es mayor que MEDIO: ${Nivel.BAJO.esMayorQue(Nivel.MEDIO)}")
    println("MEDIO es mayor que MEDIO: ${Nivel.MEDIO.esMayorQue(Nivel.MEDIO)}")
}