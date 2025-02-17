// Escreva um programa que crie um vetor com 10 posições e
// receba seus valores do utilizador. Ao final deverá mostrar somente os
// valores acima da média.

fun main() {
    var valores = Array<Double>(10){0.0}

    for (i in 0..valores.size - 1) { // 0..<valores.size
        print("Entra com o valor $i: ")
        valores[i] = readln().toDouble()
    }
    var soma: Double = 0.0
    for (i in 0..< valores.size) {
        soma += valores[i]
    }
    val media: Double = soma / valores.size

    println(media)
    for (i in 0..< valores.size) {
        if (valores[i] > media) {
            println(valores[i])
        }
    }
    println(valores.filter {d -> d > media })
}