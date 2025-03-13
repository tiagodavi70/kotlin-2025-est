package exercicio1

interface Pagamento {
    val taxa: Double

    fun realizarPagamento(valor: Double): Boolean
    fun aplicarTaxa(valor: Double): Double
}