open class Funcionario (
        val nome: String,
        val cpf: String,
        val salario: Double,
        val senha: Int
) {

    open fun bonificacao(): Double {
        return salario * 0.1
    }

    fun confereSenha(senha: Int) {
        if (this.senha == senha){
            println("Login com sucesso")
        }

        println("Falha na auntenticação")
    }


}