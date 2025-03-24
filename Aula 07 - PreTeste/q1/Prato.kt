package q1

class Prato(val material: String, val diametro: Double, val cor: String) {

    fun temperatura(): Double {
        return 0.3
    }
    override fun toString(): String {
        return "Material: $material | Diametro: $diametro | Cor: $cor"
    }
}