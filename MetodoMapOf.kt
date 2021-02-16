fun main(){
    val pair: Pair<String, Double> = Pair("Ana", 10500.75)
    val map = mapOf(pair)

    map.forEach{ (k, v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Pedro" to 8500.0,
        "Maria" to 9000.9,
        "Luiza" to 7200.8)

    println("*******************")
    map2.forEach{ (k, v) -> println("Chave: $k - Valor: $v") }

}
