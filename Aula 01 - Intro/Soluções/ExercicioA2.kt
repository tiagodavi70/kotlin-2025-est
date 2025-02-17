//  Escreva uma função que dado um valor n crie um vetor com
//  n posições aleatórias.

import kotlin.random.Random

fun main() {
//    for (i in 0..<100) { // 0..99
//        print("${Random.nextInt(0,10)} ")
//    }
    println(randomArray(8).toList())
}

fun randomArray(n:Int): Array<Double> {
    var arrayAleatorio = Array<Double>(n) {Random.nextDouble()}
    return arrayAleatorio
}