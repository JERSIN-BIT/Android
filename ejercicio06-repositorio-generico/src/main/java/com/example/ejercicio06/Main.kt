package com.example.ejercicio06

interface Repositorio<T> {
    fun agregar(item: T)
    fun obtener(id: Int): T
    fun eliminar(id: Int)
    fun tamano(): Int
}

class RepositorioMemoria<T> : Repositorio<T> {
    private val elementos = mutableListOf<T>()

    override fun agregar(item: T) {
        elementos.add(item)
    }

    override fun obtener(id: Int): T = elementos[id]

    override fun eliminar(id: Int) {
        elementos.removeAt(id)
    }

    override fun tamano(): Int = elementos.size
}

data class Libro(val titulo: String, val autor: String, val anio: Int)

fun main() {
    val nombres = RepositorioMemoria<String>()
    nombres.agregar("Ana")
    nombres.agregar("Luis")
    println("Primer nombre: ${nombres.obtener(0)}")
    nombres.eliminar(0)
    println("Nombres restantes: ${nombres.tamano()}")

    val libros = RepositorioMemoria<Libro>()
    libros.agregar(Libro("El principito", "Antoine de Saint-Exupery", 1943))
    libros.agregar(Libro("Don Quijote", "Miguel de Cervantes", 1605))
    println("Primer libro: ${libros.obtener(0)}")
    libros.eliminar(0)
    println("Libros restantes: ${libros.tamano()}")
}