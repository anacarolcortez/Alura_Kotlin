package com.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
): Pessoa(nome, cpf) {
    abstract fun calculoBeneficios(): Double
    //métodos que são obrigatórios de implementar na classe filha
}