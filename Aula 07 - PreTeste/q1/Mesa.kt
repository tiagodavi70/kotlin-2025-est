package q1

class Mesa(val comprimento: Double, val altura: Double, val material: String) {

    fun suportaPeso(): Boolean {
//        return if (material == "vidro") false else true
        return !(material == "vidro")
    }

    override fun toString(): String {
        return "$comprimento x $altura | $material"
    }
}