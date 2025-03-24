package diversos

import java.time.LocalDateTime

data class Pessoa(var nome: String, val anoNascimento: Int) {
}

fun main() {
    val pessoa1 = Pessoa("Tiago", 1992)
    println(pessoa1)
//    val pessoa2 = pessoa1
    val pessoa2 = pessoa1.copy()
    pessoa2.nome = "Davi"
    println(pessoa1.hashCode())
    println(pessoa2.hashCode())
}