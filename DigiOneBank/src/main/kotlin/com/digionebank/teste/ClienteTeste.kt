package com.digionebank.teste

import com.digionebank.Cliente
import com.digionebank.ClienteTipo

fun main(){
    val janaina = Cliente("Janaina", "555.555.555-55", ClienteTipo.PF, "senha321")

    println(janaina)

    println(janaina.login())
}