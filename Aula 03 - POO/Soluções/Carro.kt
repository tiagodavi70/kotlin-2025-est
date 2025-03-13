import java.time.LocalDateTime

class Carro(val marca: String, val modelo: String,
            val velocidadeMaxima: Double, val ano: Int) {
    val idade: Int
        get() = LocalDateTime.now().year - ano
    val velocidadeMPH: Double
        get() = 0.62137 * velocidadeMaxima

    fun exibir(): String {
        return "${marca} ${modelo} ${velocidadeMaxima}Km/h $ano"
    }
}