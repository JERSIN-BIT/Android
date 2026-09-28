package com.example.ejercicio01

class Persona(val nombre: String, val edad: Int) {
    fun presentarse() {
        println("Hola, soy $nombre y tengo $edad años")
    }
}

fun main() {
    val persona = Persona("Ana", 25)
    persona.presentarse()
}