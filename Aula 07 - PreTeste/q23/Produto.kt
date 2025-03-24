package q23

// Crie uma lista de 5 produtos. Apresente uma entrada para o utilizador ao final para
//entrar com o nome de um produto e apresente toda a informação sobre esse produto.

//3) Crie uma classe filha de Produto, ProdutoDesconto, e sobrescreva (override) a função
//aplicarImposto para diminuir o valor do produto em 10%. Altere também a Exceção
//lançada para uma que você criou.

open class Produto(var nome: String, var marca: String, preco: Double) {
    open var preco: Double = if (preco >= 0) preco else throw Exception("Valor menor que 0.")
        get() = field
        set(value) {
            field = if (value >= 0) value else throw Exception("Valor menor que 0.")
        }
    open fun imposto(valor: Double): Double {
        return preco * valor
    }
    open fun aplicarImposto(valor: Double): Double {
        return preco + imposto(valor)
    }

    override fun toString(): String {
        return "Nome: $nome | Marca: $marca | Preco: $preco | Preço Final: ${aplicarImposto(0.27)}"
    }
}