package exercicio1

class PayPal: Pagamento {
    override val taxa: Double
        get() = 2.5/100.0

    override fun realizarPagamento(valor: Double): Boolean {
        aplicarTaxa(valor)
        return true
    }

    override fun aplicarTaxa(valor: Double): Double {
        return valor*taxa + valor
    }
}

typealias PP = PayPal