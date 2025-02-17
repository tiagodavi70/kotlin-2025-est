fun main() {
    print("Entra com a idade do nadador: ")
    val idade: Int = readln().toInt()

    when {
        idade in 5..7 -> print("Infantil A")
        idade in 8..10 -> print("Infantil B")
        idade in 11..13 -> print("Juvenil A")
        idade in 14..17 -> print("Juvenil B")
        idade > 18 -> println("")
        else -> print("Não pode nadar")
    }
}