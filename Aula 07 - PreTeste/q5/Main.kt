package q5

import kotlin.random.Random

//Crie uma interface CalcularTamanho com uma função calcularArea e uma
//calcularPerimetro. Crie duas classes, Retangulo e Triangulo, que implementam essa
//interface. Crie 30 classes de cada tipo e calcule todas as áreas e perímetros. Valores das
//classes devem ser aleatórios

fun main() {

    val listaTamanhos = mutableListOf<CalcularTamanho>()
    for (i in 1..30) {
        listaTamanhos.add(Retangulo(Random.nextDouble(3.0,6.0),Random.nextDouble(3.0,6.0)))
    }
    for (i in 1..30) {
        listaTamanhos.add(Triangulo(Random.nextDouble(3.0,6.0), Random.nextDouble(3.0,6.0),Random.nextDouble(3.0,6.0)))
    }

    for (tam in listaTamanhos) {
        println("Area: ${tam.calcularArea()} | Perimetro: ${tam.calcularPerimetro()}")
    }
}