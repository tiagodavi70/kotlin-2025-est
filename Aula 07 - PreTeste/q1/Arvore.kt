package q1

class Arvore(val altura: Double, val especie: String, val idade: Int) {

    fun estimativaProducaoO2(): Double {
        return altura * 0.1
    }
    override fun toString(): String {
        return "Altura: $altura | Espécie: $especie | Idade: $idade"
    }
}