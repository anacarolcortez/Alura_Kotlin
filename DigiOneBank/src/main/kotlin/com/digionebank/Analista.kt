package com.digionebank

import java.math.BigDecimal

class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(nome, cpf, salario){
    override fun calculoBeneficios(): Double = salario * 0.1

    override fun toString(): String {
        return "Nome: $nome; CPF: $cpf; salário: $salario"
    }
}