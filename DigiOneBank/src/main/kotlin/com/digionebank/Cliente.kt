package com.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {

    override fun login(): Boolean {
        return senha == "senha321"
    }

    override fun toString(): String {
        return "Nome: $nome, Documento: $cpf, tipo: ${clienteTipo.descricao}"
    }

}