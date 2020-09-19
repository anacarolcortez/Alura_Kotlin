fun main(){
    println("Bem-vinde ao Bytebank!")

    for (i in 3 downTo 1){ // i in 1..3 para crescente
        println(i)
    }
    println("Acesso liberado")

    val contaCarol = Conta()
    contaCarol.titular = "Carol Cortez"
    contaCarol.numero = 123456

    val contaAna = Conta()
    contaAna.titular = "Ana Cortez"
    contaAna.numero = 123487

    contaCarol.depositar(500.0)
    contaAna.sacar(50.0)
    contaCarol.transferir(100.0, contaAna)
    contaAna.confereSaldo()
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0 //set e get é um atributo padrão de qualquer propriedade de classe
        private set //não precisa declarar o saldo como privado nem alterar os getters e setters. O provate set garante que só a classe terá acesso a ele
        /* Se fosse setar o valor, a sintaxe seria:
        set(valor){
            if (valor > 0){
                field = valor // field é como o this.valor
            }
        }
        //No Kotlin, o encapsulamento é o comportamento padrão do código
         */

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
