fun main(){
    val aline = Cliente("Aline", 300.0, "feminino")
    val marcos = Cliente("Marcos", 150.0, "masculino")
    val pedro = Cliente("Pedro", 200.5, "masculino")
    val mariana = Cliente("Mariana", 350.7, "feminino")

    val conjFeminino = setOf<Cliente>(aline, mariana)
    val conjMasculino = setOf<Cliente>(marcos, pedro)
    val conjTeste = setOf<Cliente>(aline)

    val clientes = conjFeminino.union(conjMasculino)
    clientes.forEach{ println(it) }
    println("*********************")

    val mulheres = clientes.subtract(conjMasculino)
    mulheres.forEach{ println(it) }
    println("*********************")
    //subtrai do conjunto 1 os elementos do conjunto 2

    val teste = clientes.intersect(conjTeste)
    teste.forEach{ println(it) }
    println("*********************")
    //mantém no conjunto 1 apenas o que ele possuir de comum com o conjunto 2
}

data class Cliente(
    val nome: String,
    val ticketMedio: Double,
    val sexo: String
) {
    override fun toString():String {
        return "Nome: $nome; Ticket Médio: $ticketMedio; Sexo: $sexo"
    }
}
