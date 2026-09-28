package com.example.ejercicio05

interface Reproducible {
    fun play()
    fun pause()
}

class Cancion(private val titulo: String) : Reproducible {
    override fun play() {
        println("Reproduciendo la cancion: $titulo")
    }

    override fun pause() {
        println("Cancion pausada: $titulo")
    }
}

class Video(private val titulo: String) : Reproducible {
    override fun play() {
        println("Reproduciendo el video: $titulo")
    }

    override fun pause() {
        println("Video pausado: $titulo")
    }
}

fun main() {
    val lista: List<Reproducible> = listOf(
        Cancion("Mi cancion"),
        Video("Mi video")
    )

    lista.forEach {
        it.play()
        it.pause()
    }
}