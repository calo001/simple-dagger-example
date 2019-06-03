package com.github.calo001.simpledaggerexample.models

import javax.inject.Inject

class Profile @Inject constructor() {
    val nombre = "Pepe Escalante"
    val profesion = "Gerente de ventas"
    val compania = "Premier Inc."
    val correo = "pepeillo@gmail.com"

    fun saludo(): String {
        return "Hola me llamo $nombre y soy $profesion en $compania mi contacto es $correo"
    }
}