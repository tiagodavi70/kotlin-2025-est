package exercicio1

open class Felino(val nome: String, var peso: Double) {

    open val domestico: Boolean get() = false

    open fun domestico() : Boolean = false

    override fun toString(): String {
        return "${nome} | %.2f | $domestico".format(peso)
    }
}