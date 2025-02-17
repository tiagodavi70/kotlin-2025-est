// Escreva um programa que dado dois vetores indique os elementos que
// estão presentes nos dois vetores.

import kotlin.random.Random
import arrayToString

fun main() {
    val a = Array<Int>(Random.nextInt(100,150)){Random.nextInt(0,999)}
    val b = Array<Int>(Random.nextInt(100,150)){Random.nextInt(0,999)}

    println(arrayToString(a))
    println(b.toList())

    // jeito pacífico - metade de kotlin
    for (i in 0..< a.size) {
        if (b.contains(a[i])) { // a[i] in b
            println(a[i])
        }
    }
    println()
    // jeito perigoso - pouco kotlin
    for (i in 0..a.size - 1) {
        for (j in 0..b.size - 1) {
            if (a[i] == b[j]) {
                println(a[i])
            }
        }
    }

    // puro kotlin
    println(a.filter { d -> d in b })

    // puríssimo kotlin, inadulterado
    println(a.toList().intersect(b.toList()))
}