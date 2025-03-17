package excecoes

// class DivisaoPorZero : ArithmeticException("Divisão com zeros não permitida.")

class DivisaoPorZero(override val message: String? = "Divisão com zeros não permitida.",
    var argumento: Int = 1) : ArithmeticException(message)

fun main() {

    while (true) {
        println("Entra com o número 1: ")
        var a = readln().toDouble()
        println("Entra com o número 2: ")
        var b = readLine()!!.toDouble()

        try {
            println(divisao(a,b))
        } catch(e: DivisaoPorZero) {
            println("Propria")
            println(e.message)
            println(e.argumento)
        } catch(e: ArithmeticException) {
            println("Aritmética")
            println(e.message)
        } catch(e: Exception) {
            println("")
            println(e.message)
        } finally {
            println("Tenta de novo!")
        }

//        if ((a != 0.0) and (b != 0.0))
//            println(divisao(a,b))
//        else {
//            println("Divisão por zero. Entra com os dados de novo.")
//        }
    }
}


fun divisao(a: Number, b: Number): Double {
    val a1 = a.toDouble()
    val b1 = b.toDouble()

    if ((a1 == 0.0) or (b1 == 0.0)) {
        throw DivisaoPorZero("Divisao com zeros não permitida", 1) //()
    } else {
        return a1 / b1
    }
}