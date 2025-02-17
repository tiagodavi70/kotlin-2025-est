// Escreva um programa que receba a idade, a altura e o peso de 12 pessoas. Ao final apresente:
// a quantidade de pessoas com idade superior a 50 anos
// a média das alturas das pessoas com idade entre 10 e 20 anos
// a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas.

fun main() {

    val numeroPessoas: Int = 12

    var superior50: Int = 0
    var somaAltura: Double = 0.0
    var contador1020: Int = 0
    var pesoInferior40: Int = 0

    for (i in 1..numeroPessoas) {
        println("Entra com os dados da pessoa $i")
        print("Entra com a idade: ")
        val idade: Int = readln().toInt()
        print("Entra com a altura: ")
        val altura: Double = readln().toDouble()
        print("Entra com o peso: ")
        val peso: Double = readln().toDouble()
        println()
        
        if (idade > 50) {
            superior50++ // superior50 += 1
        }
        if (idade in 10..20) {
            somaAltura += altura
            contador1020++
        }

        if (peso < 40) {
            pesoInferior40++
        }
    }

    println("Quantidade de pessoas com idade superior a 50 anos: $superior50")
    println("Média de altura entre as idades 10 e 20: ${somaAltura/contador1020}")

    val porcentagem40: Double = (pesoInferior40.toDouble()/numeroPessoas) * 100
    println("Porcentagem de pessoas com peso inferior a 40: $porcentagem40%")
}