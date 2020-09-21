fun testaComportamentosConta() {
    println("Bem-vinde ao Bytebank!")

    for (i in 3 downTo 1) { // i in 1..3 para crescente
        println(i)
    }
    println("Acesso liberado")

    val contaCarol = Conta("Carol Cortez", 123456)
    val contaAna = Conta("Ana Cortez", 123487)

    contaCarol.depositar(500.0)
    contaAna.sacar(50.0)
    contaCarol.transferir(100.0, contaAna)
    contaAna.confereSaldo()
}

fun testaComportamentosFuncionario() {
    val carol = Funcionario(
            nome = "Carol",
            cpf = "111.111.111-11",
            salario = 1500.0,
            senha = 321654
    )

    val ana = Gerente(
            nome = "Ana",
            cpf = "222.222.222-22",
            salario = 10000.0,
            senha = 123456
    )

    val roberta = Diretor(
            nome = "Roberta",
            cpf = "333.333.333-33",
            salario = 20000.0,
            senha = 25789,
            plr = 0.12
    )

    println("Bonificação Carol ${carol.bonificacao()}")
    println("Bonificação Ana ${ana.bonificacao()}")
    println("Bonificação Roberta ${roberta.bonificacao()}")
    ana.confereSenha(123478)
}