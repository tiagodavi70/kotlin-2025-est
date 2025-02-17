// Dado um país A, com 5.000.000 de habitantes e uma taxa de natalidade de 3% ao ano, e um país B com 7.000.000 de
// habitantes e uma taxa de natalidade de 2% ao ano, escreva um programa que calcule o tempo necessário para que a população do país A ultrapasse a população do país B.

fun main() {
    var populacaoA: Int = 5000000
    var populacaoB: Int = 7000000
    val taxaA: Double = 3/100.0
    val taxaB: Double = 2/100.0

    var anos: Int = 0
    while (populacaoA < populacaoB) {
        println("$populacaoA $populacaoB")
        populacaoA += (taxaA*populacaoA).toInt()
        populacaoB += (taxaB*populacaoB).toInt()
        anos++
    }
    println("$populacaoA $populacaoB")
    println("Número de anos: $anos")
}