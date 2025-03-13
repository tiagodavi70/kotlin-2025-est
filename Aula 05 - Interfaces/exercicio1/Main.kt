package exercicio1

// Um sistema de pagamentos precisa suportar diferentes formas de pagamento, como cartão de crédito,
// Débito, MBWay e PayPal. Crie uma interface única para processar os pagamentos,
// com duas funções - Realizar pagamento e aplicarTaxa e um atributo - taxa.
// Realize 500 pagamentos e apresente a média do valor gasto em cada um dos tipos.

fun main() {

    val pagamento1 = MBWay()
    val feito = PagamentoFeito(pagamento1, pagamento1.aplicarTaxa(50.0))

    println(feito)

    val (pagamento, valor) = feito
    println(valor)

    val feito2 = feito.copy()
    feito2.valor = 80.0
    println(feito2)
    println(feito)

    val pagamento2 = PP()

    Single.url = "localhost...."
    Single.conectarRede()

    val cor = Cor.VERMELHO
    println(cor.rgb)
}