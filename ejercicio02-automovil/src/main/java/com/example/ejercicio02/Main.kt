package com.example.ejercicio02

class Automovil(val marca: String, val modelo: String, val anio: Int) {
    constructor(marca: String, modelo: String) : this(marca, modelo, 2025)
}

fun main() {
    val automovil = Automovil("Toyota", "Corolla")
    println("Marca: ${automovil.marca}")
    println("Modelo: ${automovil.modelo}")
    println("Ano: ${automovil.anio}")
}