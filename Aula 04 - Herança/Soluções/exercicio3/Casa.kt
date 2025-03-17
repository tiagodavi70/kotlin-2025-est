package exercicio3

class Casa {
    val tipoTelhado: String
    val piso: String
    val comodos: MutableList<Comodo>
    val area: Double
        //get() = comodos.sumOf { comodo -> comodo.area }
        get() {
            var soma: Double = 0.0
            for (comodo in comodos) {
                soma += comodo.area
            }
            return soma
        }

    constructor(tipoTelhado: String, piso: String, comodos: MutableList<Comodo>) {
        this.tipoTelhado = tipoTelhado
        this.piso = piso
        this.comodos = comodos
    }

    override fun toString(): String =
        "$tipoTelhado $piso \n - ${comodos.joinToString("\n - ")}"
}