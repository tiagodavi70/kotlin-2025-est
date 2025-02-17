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
        }
        // TODO: Continuar em casa (Vale pra todos, e mais ainda pro professor)
    }

}
