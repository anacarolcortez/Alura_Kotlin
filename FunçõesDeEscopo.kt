//Funções de Escopo: coloam o próprio objeto dentro do escopo da função

fun main(){
    Endereco(logradouro = "rua alegria", numero = 123)
        .run {
            "$logradouro, $numero".toUpperCase()
        }.let {enderecoEmMaiusculo: String ->
            println(enderecoEmMaiusculo)
        }

    val endereco = Endereco()
        .also { println("Criando endereço") } // also é opcional
        .apply {
            logradouro = "rua das flores felizes"
            numero = 1500
        }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }

}

class Endereco(
    var logradouro: String? = null,
    var numero: Int? = null,
    var complemento: String? = null,
){}
