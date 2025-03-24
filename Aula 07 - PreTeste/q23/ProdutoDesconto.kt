package q23

class MenorQueZeroException: Exception("Valor menor que 0.")

class ProdutoDesconto(nome: String, marca: String, preco: Double)
    : Produto(nome, marca, preco) {

        override var preco: Double = if (preco >= 0.0) preco else throw MenorQueZeroException()
            get() = field
            set(value) {
                field = if (value >= 0) value else throw MenorQueZeroException()
            }

    override fun aplicarImposto(valor: Double): Double {
        return super.aplicarImposto(valor) * (1 - 0.1)
    }
}