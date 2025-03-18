package exercicio2

fun main() {

    val auto1 = Automovel("aa", 150.0, 150/1000.0)

    try {
        println(auto1.litrosUtilizados(100.0*12))
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println(auto1.litrosTanque)
    }
}