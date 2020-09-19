fun main(){
    println("Bem-vinde ao Bytebank!")

    for (i in 3 downTo 1){ // i in 3 downTo 1 para regressiva
        println(i)
    }
    println("Acesso liberado")

    val contaCarol = Conta()
    contaCarol.titular = "Carol Cortez"
    contaCarol.numero = 123456
    contaCarol.saldo = 100.015

    val contaAna = Conta()
    contaAna.titular = "Ana Cortez"
    contaAna.numero = 123487
    contaAna.saldo = 50.0

    contaCarol.depositar(500.0)
    contaAna.sacar(50.0)
    contaCarol.transferir(100.0, contaAna)
    contaAna.confereSaldo()
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0


    fun depositar(valor: Double) {
        this.saldo += valor
        println("Operação realizada!")
        this.confereSaldo()
    }

    fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
            println("Operação realizada!")
        } else {
            println("Operação negada!")
        }

        this.confereSaldo()
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
            this.saldo > 0.0 -> println("Saldo positivo em R$ ${this.saldo}. Gostaria de investir?")
            this.saldo == 0.0 -> println("Saldo zerado")
            else -> println("Saldo negativo em R$ ${this.saldo}. Gostaria de contratar um empréstimo?")
        }
    }

}




