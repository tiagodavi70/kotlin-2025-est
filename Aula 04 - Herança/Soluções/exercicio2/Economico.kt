package exercicio2

class Economico(modelo: String, litrosTanque: Double, litrosKm: Double)
    : Automovel(modelo, litrosTanque, litrosKm) {

    override fun consumirTanque(litros: Double) {
        super.consumirTanque(litros * (1 - (3/100)))
    }
}