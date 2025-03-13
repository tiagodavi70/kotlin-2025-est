package kilometragem

class Pesado(val modelo: String, override val kmph: Double) : Direcao {
    override fun percorrer(km: Double) {
        println("Percorreu: $km em ${(km/kmph)*60} min")
    }

    override fun fazerCurva(angulo: Double) {
        println("Curvando ${angulo}º")
    }
}