class Conta(val titular: String,
            val numero: Int
) {
    var saldo = 0.0 //set e get é um atributo padrão de qualquer propriedade de classe
        private set

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Operação realizada!")
        } else {
            println("Operação inválida!")
        }
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

}
