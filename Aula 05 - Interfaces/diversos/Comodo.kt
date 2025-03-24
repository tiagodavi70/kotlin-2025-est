package diversos

class Comodo {
}

typealias Divisao = Comodo

fun main() {
    val comodo = Comodo()
    val comodo1 = Divisao()

    val lista1 = mutableListOf<Divisao>(comodo, comodo1)
}