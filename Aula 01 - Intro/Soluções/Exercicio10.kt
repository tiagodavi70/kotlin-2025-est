// Escreva um programa que receba dois números e mostre o somatório dos números entre eles.
fun main() {
    println("Entra com o primeiro número: ")
    val numero1: Int = readln().toInt()
    println("Entra com o segundo número: ")
    val numero2: Int = readln().toInt()

    var somatorio: Int = 0
    for (i in numero1..numero2) {
        somatorio = somatorio + i // somatorio += i
    }

    println("Somatório entra $numero1 e $numero2: $somatorio")
}