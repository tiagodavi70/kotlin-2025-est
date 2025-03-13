
fun main() {
    val animal1 = Animal("Nina", 1.5, 2006)
    println(animal1)
    println(animal1.idade)

    val homem1 = Homem("Tiago", 32, 98.0)
    println(homem1.nome)

    val sala = Comodo("Sala", 3.0, 2.5, "Azul", true)
    val casaBanho = Comodo("Casa de Banho", 2.0, 2.0)
    val cozinha = Comodo("Cozinha", 2.5, 2.5, "Branco", true)
    val quarto1 = Comodo("Quarto", 3.0, 2.0, "Roxo", true)
    val quarto2 = Comodo("Quarto", 3.0, 2.0, "Roxo", true)

    println(casaBanho.area)

    val casa1 = Casa("Barro", "Parquet", mutableListOf(sala, casaBanho, cozinha, quarto1, quarto2) )
    println(casa1.area)

    var decimal: Double = 0.0

}
