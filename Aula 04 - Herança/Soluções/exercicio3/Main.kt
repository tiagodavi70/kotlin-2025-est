package exercicio3

fun main() {

    val sala = Comodo("Sala", 3.0, 2.5, "Azul", true)
    val casaBanho = Comodo("Casa de Banho", 2.0, 2.0)
    val cozinha = Comodo("Cozinha", 2.5, 2.5, "Branco", true)
    val quarto1 = Comodo("Quarto", 3.0, 2.0, "Roxo", true)
    val quarto2 = Comodo("Quarto", 3.0, 2.0, "Roxo", true)

    val casas = mutableListOf<Casa>()
    for (i in 1..10) {
        casas.add(Casa("Barro", "Taco",
            mutableListOf(sala,casaBanho, cozinha,
                quarto1, quarto2)))
    }
    println(casas.joinToString("\n\n"))
}