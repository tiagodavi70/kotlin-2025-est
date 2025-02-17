
// Escreva um programa que receba 3 valores e imprima a média entre eles.
fun main() {
    print("Entra com o valor 1: ")
    val val1: Double = readln().toDouble()
    print("Entra com o valor 2: ")
    val val2: Double = readln().toDouble()
    print("Entra com o valor 3: ")
    val val3: Double = readln().toDouble()

    print("Média entre os valores: ${(val1 + val2 + val3) / 3}")
}