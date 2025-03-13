package kilometragem

interface Direcao {

    val kmph: Double
    fun percorrer(km: Double)
    fun fazerCurva(angulo: Double) {
//        this.kmph = 0.0
        println("Fazer curva.")
    }
}