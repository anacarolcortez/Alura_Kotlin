package com.digionebank.teste

import com.digionebank.Analista
import com.digionebank.Gerente

fun main(){
    val madalena = Analista("Santa Rosa Madalena", "333.333.333-33", 2807.0)
    println(madalena)

    val nani = Gerente("Nani", "444.444.444-44", 10500.45, "senha123")
    println(nani)

    println(nani.login())
}