class Produto(var nome: String, val preco: Double, val tipo: String, val codigo: String) {
    fun exibir(): String = "$codigo - $nome | $preco | $tipo"
}

fun exibirProdutos(produtos: MutableList<Produto>) {
    for (p in produtos) println(p.exibir())
}