// Escreva um programa que mostre todas as possibilidades de que no lançamento de dois dados tenhamos o valor 7 como resultado da soma dos valores de cada dado.
fun main() {
    for (i in 1..6) {
        for (j in 1..6) {
            if (i+j == 7) {
                println("D1 e D2: $i | $j | soma=${i + j}")
            }
        }
    }

}