//Escreva um programa quer faça o controle de estoque de uma loja. Em um menu deve ter as opções:
//cadastrar produto
//editar produto
//vender pruduto
//gerar relatório
//
//Na opção de cadastro o usuário deve entrar com:
//nome do produto
//preço
//tipo
//
//Para cada produto cadastrado deve ser gerado um código.
//Na opção de editar deve permitir atualização do nome do produto.
//Na opção vender produto deve registrar uma venda do produto.
//E na opção gerar relatório deve mostrar o valor total ganho e a média por produto.

fun main() {

    var nomes = mutableListOf<String>()
    var precos = mutableListOf<Double>()
    var tipos = mutableListOf<String>()
    var codigos = mutableListOf<Int>()
    var vendas = mutableListOf<Int>()

    var opcao: Int = 1
    while (opcao != 5) {
        println("Bem vindo! Entra com uma opção: ")
        println("1 - Cadastrar produto")
        println("2 - Editar produto")
        println("3 - Vender produto")
        println("4 - Gerar relatório")
        println("5 - Sair")

        opcao = readln().toInt()
        when (opcao) {
            1 -> {
                println("Entra com o nome: ")
                nomes.add(readln())
                println("Entra com o tipo: ")
                tipos.add(readln())
                println("Entra com o preco: ")
                precos.add(readln().toDouble())
                codigos.add(codigos.size+1)
            }
            2 -> {
                mostrarProdutos(codigos, nomes, precos, tipos)
                println()
                print("Entra com o codigo para mudar o nome: ")
                val codigo = readln().toInt()
                print("Entra com o novo nome: ")
                nomes[codigos.indexOf(codigo)] = readln()
            }
            3 -> {
                mostrarProdutos(codigos, nomes, precos, tipos)
                println()
                print("Entra com o codigo para vender o produto: ")
                val codigo = readln().toInt()
                vendas.add(codigos.indexOf(codigo))
            }
            4 -> {
                // Total ganho
                var total: Double = 0.0
                for (venda in vendas) {
                    total += precos[codigos.indexOf(venda)]
                }
                println("Total ganho: $total")

                // Por produto - o mesmo de cima mas para cada produto
                for (codigo in codigos) {
                    var parcial: Double = 0.0
                    var cont: Int = 0
                    for (venda in vendas) {
                        if (venda == codigo){
                            parcial += precos[codigos.indexOf(venda)]
                            cont++
                        }
                    }
                    val nome = nomes[codigos.indexOf(codigo)]
                    println("Média por produto $nome: ${parcial/cont}")
                }
            }
        }

    }


}
fun mostrarProdutos(codigos: List<Int>, nomes: List<String>,
                     precos: List<Double>, tipos: List<String> ) {
    for (i in 0..codigos.size-1) {
        println("${codigos[i]} - ${nomes[i]} | ${precos[i]} | $tipos[i]")
    }
}
