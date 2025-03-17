package exercicio1

class Leao(nome: String, peso: Double) : Felino(nome, peso) {

    override val domestico: Boolean get() = false

    override fun domestico(): Boolean {
        return false
    }
}