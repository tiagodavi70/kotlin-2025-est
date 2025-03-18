package exercicio1

class MBWay: Pagamento {
    override val taxa: Double
        get() = 0.0

    override fun realizarPagamento(valor: Double): Boolean {
        aplicarTaxa(valor)
        return true
    }

    override fun aplicarTaxa(valor: Double): Double {
        return valor*taxa + valor
    }
}