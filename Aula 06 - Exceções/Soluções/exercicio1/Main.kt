package exercicio1

// Crie uma calculadora que faça as operações básicas e trate as exceções como divisão por zero.

fun main() {

    while (true) {
        println("Entra com a operacao (a () b): ")
        val op = readln()

        try {
            val num1 = op.split(" ")[0].toDouble()
            val operacao = op.split(" ")[1].toCharArray()[0]
            val num2 = op.split(" ")[2].toDouble()

            try {
                val result = calc(num1, num2, operacao)
                println(result)
            } catch (e: ArithmeticException) {
                println(e.message)
            } catch (e: Exception) {
                println(e.message)
            }
        } catch (e: NumberFormatException) {
            println("Não esqueça: um espaço de cada vez.")
        } catch (e: IndexOutOfBoundsException) {
            println("Não esqueça: um espaço de cada vez.")
        } catch (e: Exception) {
            println("Não esqueça: um espaço de cada vez.")
        }
    }
}

fun calc(aout: Number, bout: Number, op: Char): Double {
    val a = aout.toDouble()
    val b = bout.toDouble()

    when (op) {
        '+' -> return a + b
        '-' -> return a - b
        '*' -> return a * b
        '/' -> {
            check((a != 0.0) and (b != 0.0)) { "Não divida por zero!" }
            return a / b
        }
        else -> {
            error("Operação não reconhecida")
            return 0.0
        }
    }
    return 0.0
}