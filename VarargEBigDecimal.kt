import java.math.BigDecimal

fun main(args: Array<String>) {
    //val salarios = Array<BigDecimal>(5) {BigDecimal.ZERO}
    val salarios = bigDecimalArrayOf("2800.0", "3500.0", "4200.0", "3200.00", "5000.0")

    var aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios.map{ salario -> 
        if (salario > "5000.0".toBigDecimal()){
            salario * aumento
        } else {
            salario + "500".toBigDecimal()
        }
    }.toTypedArray()

    println(salariosComAumento.contentToString())

    val totalSalarios = salariosComAumento.somatorio()
    println("${totalSalarios}")

}

//tipo vararg permite que lista utilizada como argumento tenha tamanho variável
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
    valores[i].toBigDecimal()}
}

//function extension de Array para criar função que soma valores do tipo BigDecimal (obj)
fun Array<BigDecimal>.somatorio(): BigDecimal {
    return this.reduce {
        acumulador, valor ->
        acumulador + valor
    }
}
