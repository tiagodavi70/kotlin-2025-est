fun main() {

    val produtos = mutableListOf<Produto>()
    val vendas = mutableListOf<Produto>()

    println("Bem Vindo!")

    var opcao: Int = 1
    while ((opcao < 5) and (opcao > 0)) {
        println("Entra com uma opção: ")
        println("1 - Cadastrar produto")
        println("2 - Editar nome do produto")
        println("3 - Realizar venda")
        println("4 - Gerar relatório")
        println("5 - sair")
        opcao = readln().toInt()

        when (opcao) {
            1 -> {
                println("Entra com o nome: ")
                val nome: String = readln()
                println("Entra com o preço: ")
                val preco: Double = readln().replace(",", ".").toDouble()
                println("Entra com o tipo: ")
                val tipo: String = readln()
                produtos.add(Produto(nome, preco, tipo, produtos.size.toString()))
            }
            2 -> {
                exibirProdutos(produtos)
                println("Entra com o codigo para alterar o nome: ")
                val codigo: String = readln()
                var produtoEncontrado: Produto? = null
                for (p in produtos) {
                    if (p.codigo == codigo) {
                        produtoEncontrado = p
                        break
                    }
                }
                //val produtoEncontrado: Produto? = produtos.find { produto -> produto.codigo == codigo }
                if (produtoEncontrado != null) {
                    println("Entra com o novo nome:")
                    produtoEncontrado.nome = readln()
                } else {
                    println("Código não encontrado")
                }
            }
            3 -> {
                exibirProdutos(produtos)
                println("Entra com o codigo para realizar a venda: ")
                val codigo: String = readln()
                val produtoEncontrado: Produto? = produtos.find { produto -> produto.codigo == codigo }
                if (produtoEncontrado != null) {
                    vendas.add(produtoEncontrado)
                } else {
                    println("Código não encontrado")
                }
            }
            4 -> {
                var totalVendas: Double = 0.0
                for (produto in produtos) {
                    totalVendas += produto.preco
                }
                // totalVendas = produtos.sumOf { produto -> produto.preco }
                println("Vendas totais: $totalVendas")

                for (produto in produtos) {
                    var parcial: Double = 0.0
                    for (venda in vendas) {
                        if (produto.codigo == venda.codigo) { // produto == venda
                            parcial += venda.preco
                        }
                    }
                    println("${produto.exibir()}: $parcial")
                }

//                produtos.forEach { produto->
//                    val parcial = (vendas.filter { venda -> produto == venda }).sumOf { produto -> produto.preco }
//                    println("${produto.exibir()}: $parcial")
//                }
            }
        }
    }
}
