package com.example.ejercicio07

interface Volador {
    fun volar()
}

interface Nadador {
    fun nadar()
}

class Pato : Volador, Nadador {
    override fun volar() {
        println("El pato esta volando")
    }

    override fun nadar() {
        println("El pato esta nadando")
    }
}

fun main() {
    val pato = Pato()
    pato.volar()
    pato.nadar()
}