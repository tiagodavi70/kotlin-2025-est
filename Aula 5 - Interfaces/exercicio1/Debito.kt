package exercicio1

class Debito: Pagamento {
    override val taxa: Double
        get() = 0.1/100.0

    override fun realizarPagamento(valor: Double): Boolean {
        aplicarTaxa(valor)
        return true
    }

    override fun aplicarTaxa(valor: Double): Double {
        return taxa * valor + valor
    }
}