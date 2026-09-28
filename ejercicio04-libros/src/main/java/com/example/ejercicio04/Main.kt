package com.example.ejercicio04

data class Libro(val titulo: String, val autor: String, val anio: Int)

fun main() {
    val libros = listOf(
        Libro("Cien anos de soledad", "Gabriel Garcia Marquez", 1967),
        Libro("El principito", "Antoine de Saint-Exupery", 1943)
    )
    val libroActualizado = libros.first().copy(anio = 2025)

    println("Libros originales:")
    libros.forEach(::println)
    println("Copia con otro ano:")
    println(libroActualizado)
}