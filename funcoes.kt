//ordem superior
fun main() {
    
    val multiplicate:Int
    val sumNumbers:Int
    
    multiplicate = calculate(10, 2) {a,b -> a * b}
    println("Resultado da multiplicação: $multiplicate")
    
    sumNumbers = calculate(10,2,::sum)
    println("Resultado da soma: $sumNumbers")
}
fun sum(a:Int, b:Int) = a.plus(b)

fun calculate(a:Int, b:Int, operation:(Int, Int) -> Int): Int{
    return operation(a,b)
}

//single line
private fun getFullName(name:String, lastName:String) = "$name $lastName"

//extensões: cria uma função que só pode ser chamada por um tipo específico, cujo valor pode ser referenciado dentro da função por meio da palavra this
fun String.randomCapitalizedLetter() = this[(0..this.length-1).random()].toUpperCase()


