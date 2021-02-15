package com.digionebank

import java.math.BigDecimal

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
): Funcionario(nome, cpf, salario), Logavel{
    override fun calculoBeneficios(): Double = salario * 0.3

    override fun login(): Boolean {
        return senha == "senha123"
    }

    override fun toString(): String {
        return "Nome: $nome; CPF: $cpf; salário: $salario"
    }
}