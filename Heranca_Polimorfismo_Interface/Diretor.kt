class Diretor(
        nome: String,
        cpf: String,
        salario: Double,
        senha: Int,
        val plr: Double
) : Funcionario(
        nome = nome,
        cpf = cpf,
        salario = salario,
        senha = senha
) {

    override fun bonificacao(): Double {
        return salario * 0.3
    }

    fun calculaPLR(): Double {
        val salarioBonus = bonificacao()
        return salarioBonus * plr
    }

}