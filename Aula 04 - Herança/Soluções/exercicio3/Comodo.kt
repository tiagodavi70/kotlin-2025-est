package exercicio3

class Comodo(var tipo: String, var largura: Double,
             var comprimento: Double, var corParedes: String = "Branco", val janelas: Boolean = false) {
    val area: Double
        get() = largura * comprimento

    override fun toString(): String = "$tipo ${largura}x$comprimento $corParedes $janelas"
}