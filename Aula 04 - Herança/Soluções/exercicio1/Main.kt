package exercicio1

import kotlin.random.Random
import kotlin.random.nextInt

// Implemente a classe Felino, e as subclasses Gato, Tigre e Leão.
// A classe Felino deve ter os atributos nome e peso, e um metodo que retorna se é
// doméstico ou não. Defina como deve ser o construtor de cada subclasse.
// Defina também usando polimorfismo se o Felino é ou não doméstico.
// Crie uma classe Zoologico com 40 animais para testar as classes criadas.

fun novoNome(): String {
    return String(CharArray(5) {"abcdefghijklmnopqrstuvwxyz".get(Random.nextInt(0, 25))})
}

fun main() {

    val felino1 = Felino("felino", 30.0)

    val gato1 = Gato("Nina", 2.0)
    val leao = Leao("Leao", 200.0)
    val tigre = Tigre("Tigre", 150.0)

//    println(3.0)
//    println(gato1)
//    println(leao)

    val zoo = mutableListOf<Felino>()
    for (i in 1..40) {
        when (Random.nextInt(0,10)) {
            in 0..3 -> {
                zoo.add(Leao(novoNome(), Random.nextDouble(250.0, 350.0)))
            }
            in 3..7 -> {
                zoo.add(Tigre(novoNome(), Random.nextDouble(90.0, 310.0)))
            }
            else -> {
                zoo.add(Gato(novoNome(), Random.nextDouble(4.0, 10.0)))
            }
        }
    }
    println(zoo.joinToString("\n"))
}