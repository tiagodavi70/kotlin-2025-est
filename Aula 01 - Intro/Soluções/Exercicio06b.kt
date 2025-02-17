fun main() {
    print("Entra com a idade do nadador: ")
    val idade: Int = readln().toInt()

    when {
        idade in 5..7 -> print("Infantil A")
        idade in 8..10 -> print("Infantil B")
        idade in 11..13 -> print("Juvenil A")
        idade in 14..17 -> print("Juvenil B")
        (idade > 18) and true -> println("Sênior")
        else -> print("Não pode nadar")
    }

    when (idade) {
        in 5..7 -> print("Infantil A")
        in 8..10 -> print("Infantil B")
        in 11..13 -> print("Juvenil A")
        in 14..17 -> print("Juvenil B")
        // idade > 18 -> println("") // muito errado
        else -> print("Não pode nadar")
    }
}