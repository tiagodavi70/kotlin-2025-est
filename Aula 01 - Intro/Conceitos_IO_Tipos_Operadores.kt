
fun main() {
    println("Olá mundo!")
    println("Olá de novo")

    println(9)
    println(9 + 5)

    // val - palavra chave pra quando a variável não muda de valor
    // var - palavra chave pra quando a variável pode mudar de valor
    val variavel = 8

    println("Variável tem valor: ${variavel + 9}")

    val stringTeste = "Teste teste"

    println("String de teste: " + stringTeste)

    val a = 10
    val b = 10

    println(a + b)
    println(a - 10)
    println(10 * b)
    println(a / b)
    println(a % 4)

    val c = 5.1
    val d = 8.9

    println(c / d)
    println(c * d)

    val verdadeiro = true
    val falso = false

    println(verdadeiro and verdadeiro)
    println(verdadeiro and falso)
    println(falso and verdadeiro)
    println(falso and falso)
    println()
    println(verdadeiro or verdadeiro)
    println(verdadeiro or falso)
    println(falso or verdadeiro)
    println(falso or falso)
    println()
    println(!verdadeiro)
    println(!falso)

    println()
    println(d > c)
    println(d < c)
    println(d <= c)
    println(d >= c)
    println(d == c)


    println("Entra com teu nome: ")
    val nome = readln()
    println("Olá $nome")

    println("Entra com tua idade: ")
    val idade = readln().toInt()
    println("Tens $idade anos")

    // Int - Inteiro
    // Double - Flutuante de dupla precisão
    // String - Cadeira de caracteres
    // Boolean - Valor lógico
    // Float - Flutuante simples
    // Long - Inteiro longo

    val variavelTipada: Int = 8
    val varDouble: Double = 5.5
    val varString: String = "String mágica"
    val varBoolean: Boolean = true
    val varFloat: Float = 8.6f
    val varLong: Long = 8
    val varChar: Char = 'a'
}