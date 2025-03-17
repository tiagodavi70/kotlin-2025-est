package exercicio2

import kotlin.random.Random

fun main() {
    val automoveis = mutableListOf<Automovel>()

    for (i in 1..50) {
        if (Random.nextDouble() > 0.25) {
            automoveis.add(Automovel(exercicio1.novoNome(),
                Random.nextDouble(50.0, 70.0), Random.nextDouble((50.0/1000.0), (70.0/1000.0))))
        }
    }
    for (auto in automoveis) {
        println(auto.litrosTanque)
        auto.litrosUtilizados(150.0)
        println(auto.litrosTanque)
        println()
    }


}