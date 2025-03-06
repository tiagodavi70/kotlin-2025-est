class Cachorro(nome: String, val idade: Int): Animal(nome) {

    override fun domestico(): Boolean {
        return true
    }
}