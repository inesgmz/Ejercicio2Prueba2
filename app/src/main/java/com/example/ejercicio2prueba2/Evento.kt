package com.example.ejercicio2prueba2

import java.io.Serializable

data class Evento(
    val name: String,
    val description: String,
    val price: Double,
    val date: String,
    val pass: Int,
    val direccion: String
) : Serializable {
    fun isFree(): Boolean = price == 0.0
}