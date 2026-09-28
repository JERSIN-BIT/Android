package com.example.ejercicio03

open class Animal {
    open fun hacerSonido() {
        println("El animal hace un sonido")
    }
}

class Perro : Animal() {
    override fun hacerSonido() {
        println("Guau")
    }
}

class Gato : Animal() {
    override fun hacerSonido() {
        println("Miau")
    }
}

fun main() {
    val animales: List<Animal> = listOf(Perro(), Gato())
    animales.forEach { it.hacerSonido() }
}