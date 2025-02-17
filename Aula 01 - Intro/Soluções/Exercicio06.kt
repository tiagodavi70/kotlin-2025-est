//Escreva um programa que receba a idade de um nadador e mostre na tela a sua categoria seguindo as regras:
//Categoria	Idade
//Infantil A	5 - 7 anos
//Infantil B	8 - 10 anos
//Juvenil A	11 - 13 anos
//Juvenil B	14 - 17 anos
//Sênior	maiores de 18 anos

fun main() {
    print("Entra com a idade do nadador: ")
    val idade: Int = readln().toInt()

    if ((idade >= 5) and (idade <= 7)) {
        print("Infantil A")
    } else if ((idade >= 8) and (idade <= 10)) {
        print("Infantil B")
    } else if ((idade >= 11) and (idade <= 13)) {
        print("Juvenil A")
    } else if ((idade >= 14) and (idade <= 17)) {
        print("Juvenil B")
    } else if (idade >= 18) {
        print("Sênior")
    } else {
        print("Não pode nadar.")
    }

}