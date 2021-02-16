fun main() {
    val valores = IntArray(5)
    //val outrosValores = arrayOf( 1, 2, 3, 4, 5)

    for (i in 0..4){
        valores[i] = (10..99).random()
        println(valores[i])
    }

    println("****************")

    for (indice in valores.indices){
        println("$indice: ${valores[indice]}")
    }

    println("****************")

    valores.sort()

    valores.forEach {
        println("Num: $it")
    }

    println("****************")

    val nomes = Array(5) {""}
    nomes[0] = "Carlos"
    nomes[1] = "Paula"
    nomes[2] = "Dito"
    nomes[3] = "Rita"
    nomes[4] = "Lea"

    nomes.forEach { println(it) }

    println("****************")

    val frutas = arrayOf("pêra", "uva", "maçã", "salada mista")
    frutas.forEach { println(it) }

    println("****************")

    val salarios = doubleArrayOf(2807.0, 3200.0, 5200.0, 6300.0)
    println("O maior salário: R$ ${salarios.maxOrNull()}")
    println("O menor salário: R$ ${salarios.minOrNull()}")
    println("A média salarial: R$ ${salarios.average()}")

    println("****************")

    val filtroSalario = salarios.filter{
        it > 5000
    }

    println(filtroSalario)

    println("****************")

    println(salarios.count{ it in 3000.0..6000.0}) //devolve um inteiro

    println("****************")

    println(salarios.find{ it < 4000.0 }) //devolve o elemento

    println("****************")

    println(salarios.any{ it > 2500.0 }) //devolve um boleano
}
