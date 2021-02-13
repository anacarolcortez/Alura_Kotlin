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
