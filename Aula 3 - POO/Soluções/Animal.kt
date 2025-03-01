
class Animal(val nome: String, val peso: Double, val dataNascimento: Int) {

    val idade: Int
        get() = 2025 - dataNascimento
}