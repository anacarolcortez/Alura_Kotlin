fun main(){

    val ana = Funcionario("Ana", 10000.0, "diretor")
    val maria = Funcionario("Maria", 5807.0, "gerente")
    val joao = Funcionario("João", 2807.0, "analista")
    val penelope = Funcionario("Penélope", 2807.0, "analista")


    val funcionarios = listOf<Funcionario>(ana, maria, joao, penelope)
    funcionarios.forEach{println(it)}

    println("****************")

    println(funcionarios.find{ it.nome == "Ana" })

    println("****************")

    funcionarios
        .sortedBy{ it.salario }
        .forEach{ println(it) }

    println("****************")

    funcionarios
        .groupBy{ it.cargo }
        .forEach{ println(it)}
    //faz uma lista por cargo, com chave e valor (propriedade e valor), e insere todos os objetos conforme o recorte
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val cargo: String
) {
    override fun toString():String {
        return "Nome: $nome; Salário: $salario; Cargo: $cargo"
    }
}
