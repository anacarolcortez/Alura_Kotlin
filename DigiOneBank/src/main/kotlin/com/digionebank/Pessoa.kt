package com.digionebank

abstract class Pessoa (
    val nome: String,
    val cpf: String
    )
{
    fun pessoaInfo() = "Nome: $nome; CPF: $cpf"
}

//classes abstratas não possuem instâncias