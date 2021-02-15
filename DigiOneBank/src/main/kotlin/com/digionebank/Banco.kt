package com.digionebank

//classe que gerencia dados
data class Banco(
    val nome: String,
    val numero: Int
){
    fun bancoInfo() = "Nome do banco: $nome; número: $numero"
}
