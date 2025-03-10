package animal

class Gato(nome: String): Animal(nome) {

    override var peso: Double = 0.0
        get() = field
        set(value) { field = value}

    override fun fazerBarulho(): String {
        return "Miau"
    }
}