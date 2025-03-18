package exercicio2

open class Automovel(
    val modelo: String,
    var litrosTanque: Double, // litros que ainda estão no tanque
    var litrosKm: Double // consumo de litros por km
) {
    // Dado uma distância em km, calcula os litros utilizados
    fun litrosUtilizados(km: Double): Double {
        val litros = km * this.litrosKm
        consumirTanque(litros)
        return litros
    }

    // Consome a gasolina do tanque
    open fun consumirTanque(litros: Double) {
//        if ((this.litrosTanque - litros) > 0)
//            this.litrosTanque -= litros
//        else
//            this.litrosTanque = 0.0

        check(this.litrosTanque - litros > 0) { "Consumindo ${-(this.litrosTanque - litros)} a mais do que tem no tanque." }
        this.litrosTanque = this.litrosTanque - litros
    }
}