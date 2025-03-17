package exercicio1

class Gato(nome: String, peso: Double) : Felino(nome, peso) {

    override val domestico: Boolean get() = true

    override fun domestico(): Boolean = true
}