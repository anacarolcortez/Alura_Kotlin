fun main() {
    val livro1 = Livro(
        titulo = "O Capital - Volume 1",
        autor = "Karl Marx",
        ano = 1997,
        editora = "Sociologia Aplicada"
    )

    val livro2 = Livro(
        titulo = "Formação Econômica do Brasil",
        autor = "Celso Furtado",
        ano = 1959,
        editora = "Sociologia Aplicada",
    )

    val livro3 = Livro(
        titulo = "Teoria Geral do Emprego, do Juro e da Moeda",
        autor = "John Maynard Keynes",
        ano = 1997,
        editora = "Sociologia Aplicada",
    )

    val livro4 = Livro(
        titulo = "Valsa Brasileira",
        autor = "Laura Carvalho",
        ano = 2018,
        editora = "Sociologia Aplicada",
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "O Capital no século XXI",
            autor = "Thomas Piketty",
            ano = 2011,
            editora = "Sociologia Aplicada",
        )
    )
    val livrosOrdenados: MutableList<Livro?> = livros.sorted().toMutableList()
    //para usar o sorted, é necessário sobrescrever a função compareTo, para informar qual será o critério de ordenação natural da classe
    livrosOrdenados.imprimir()

    val livrosPorAno: MutableList<Livro?> = livros.sortedBy { livro -> livro.ano }.toMutableList()
    livrosPorAno.imprimir()

    val filtroLivros = livros
        .filter { livro -> livro.titulo.startsWith("O Capital") }
        .sortedBy { livro -> livro.autor  }
        .map { livro -> livro.titulo  }

    println(filtroLivros.toString())
}

fun MutableList<Livro?>.imprimir() {
    val lista =  this.filterNotNull()
        .joinToString (separator = "\n"){
        livro -> "título: ${livro?.titulo}, autor: ${livro?.autor}, ano: ${livro?.ano}, editora: ${livro.editora ?: "não informada"}"
    }
    println("####### LIVROS ######")
    println(lista)
}

data class Livro(
    val titulo: String,
    val autor: String,
    val ano: Int,
    val editora: String? = null
): Comparable<Livro> {
    override fun compareTo(other: Livro): Int {
        return this.titulo.compareTo(other.titulo)
    }
}
