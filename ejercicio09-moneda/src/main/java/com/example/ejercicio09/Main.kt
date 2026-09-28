package com.example.ejercicio09

enum class Moneda(val simbolo: String) {
    DOLAR("$"),
    EURO("€"),
    PESO("COP$")
}

fun main() {
    Moneda.values().forEach { moneda ->
        println("${moneda.name}: ${moneda.simbolo}")
    }
}