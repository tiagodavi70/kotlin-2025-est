package animal

abstract class Animal(val nome: String) {
    abstract var peso: Double
    override fun toString(): String = "$nome"

    abstract fun fazerBarulho(): String

    constructor(nome: String, peso: Double) : this(nome) {
        this.peso = peso
    }
}