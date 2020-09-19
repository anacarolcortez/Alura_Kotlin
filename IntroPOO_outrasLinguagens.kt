fun main(){
    println("Bem-vinde ao Bytebank!")

    for (i in 3 downTo 1){ // i in 1..3 para crescente
        println(i)
    }
    println("Acesso liberado")

    val contaCarol = Conta()
    contaCarol.titular = "Carol Cortez"
    contaCarol.numero = 123456
    contaCarol.setSaldo(100.015)

    val contaAna = Conta()
    contaAna.titular = "Ana Cortez"
    contaAna.numero = 123487
    contaAna.setSaldo(50.0)

    contaCarol.depositar(500.0)
    contaAna.sacar(50.0)
    contaCarol.transferir(100.0, contaAna)
    contaAna.confereSaldo()
}

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0


    fun depositar(valor: Double) {
        saldo += valor
        println("Operação realizada!")
        confereSaldo()
    }

    fun sacar(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
            println("Operação realizada!")
        } else {
            println("Operação negada!")
        }

        confereSaldo()
    }

    fun transferir(valor: Double, destino: Conta) {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            println("Operação realizada")
            confereSaldo()
        } else {
            println("Operação negada!")
        }
    }

    fun confereSaldo() {
        when {
            saldo > 0.0 -> println("Saldo positivo em R$ ${saldo}. Gostaria de investir?")
            saldo == 0.0 -> println("Saldo zerado")
            else -> println("Saldo negativo em R$ ${saldo}. Gostaria de contratar um empréstimo?")
        }
    }

    fun getSaldo(): Double { //encapsulamento
        return saldo
    }

    fun setSaldo(valor:Double){
        if (valor > 0) {
            saldo = valor
        }
        
    }

}

