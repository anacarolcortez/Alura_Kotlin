package one.digitalinnovation.web

//por padrão, as collections não permitem alteração póstumo no seu conteúdo. Para adicionar, remover itens, por exemplo, é necessário criar uma versão "mutable" da coleção
fun main() {
    val trakinas = Fornecedor("Trakinas", "11.111.111/0001-11", "MG")
    val kalunga = Fornecedor("Kalunga", "22.222.222/0001-22", "SP")
    val magalu = Fornecedor("Magazine Luiza", "33.333.333/0001-33", "SP")

    println("******** List ************")
    val fornecedores = mutableListOf<Fornecedor>()
    fornecedores.add(trakinas)
    fornecedores.add(kalunga)
    fornecedores.add(magalu)

    fornecedores.forEach{ println(it) }
    fornecedores
        .groupBy{ it.estado }
        .forEach{ println(it) }

    println("******** Set ************")
    val fornecedoresSP = mutableSetOf<Fornecedor>(kalunga, magalu)
    fornecedoresSP.forEach{ println(it) }
}

data class Fornecedor(
    val nome: String,
    val cnpj: String,
    val estado: String
){
    override fun toString(): String {
        return "Empresa: $nome; CNPJ: $cnpj; Estado: $estado"
    }
}
