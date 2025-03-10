/*
class Comodo { // Divisao
    var tipo: String
    var largura: Double
    var comprimento: Double
    val area: Double
        get() = largura * comprimento
    var corParedes: String = ""

    constructor(tipo: String,
                largura: Double,
                comprimento: Double,
                corParedes: String = "Branco") {
        this.tipo = tipo
        this.largura = largura
        this.comprimento = comprimento
        this.corParedes = corParedes
    }
} // */

class Comodo(var tipo: String, var largura: Double,
             var comprimento: Double, var corParedes: String = "Branco", janelas: Boolean = false) {
    val area: Double
        get() = largura * comprimento
}