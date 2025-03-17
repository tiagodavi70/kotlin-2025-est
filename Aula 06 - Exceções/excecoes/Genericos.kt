package excecoes

import jdk.jfr.Experimental

fun main() {

    try {
        println(criarLista(5))
        println(criarLista(1))
        println(criarLista(10))
        println(criarLista(6))
        println(criarLista3(-1))
    } catch (e: IllegalArgumentException) {
        println("Illegal")
        println(e.message)
    } catch (e: Exception) {
        println("Generico")
        println(e.message)
    }
}

fun criarLista(tamanho: Int): List<Int> {
    // require(tamanho > 0) { Exception("Tamanho tem que ser maior que 0.") }
    require(tamanho > 0) { "Tamanho tem que ser maior que 0." }

    return List<Int>(tamanho) { 0 }
}

fun criarLista2(tamanho: Int): List<Int> {
    check(tamanho > 0) { "Use um valor maior que 0." }

    return List<Int>(tamanho) { 0 }
}


fun criarLista3(tamanho: Int): List<Int> {
    if (tamanho <= 0) {
        error("Tamanho tem que ser > 0.")
    }
    return List<Int>(tamanho) { 0 }
}