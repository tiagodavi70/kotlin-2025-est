fun main() {

    /*
    print("Bem vindo!\nEntra com teu nome: ")
    val nome: String = readln()
    print("Bem vindo $nome. Entra com tua idade: ")
    val idade: Int = readln().toInt()

    if ( idade > 18 ) {
        println("Pode votar.")
    } else {
        println("Não pode votar.")
    } */

//    println("Entra com a cidade de nascimento: ")
//    val cidade: String = readln()
//
//    when (cidade) {
//        "Belém" -> println("Belenense")
//        "Estarreja" -> println("Estarrejense")
//        "Oliveira de Azémeis" -> println("Oliveirense")
//        "Lisboa" -> println("Lisboeta")
//        "Aveiro" -> println("Aveirense")
//        "Porto" -> {
//            println("Portuense")
//            println("Dizem também tripeiros")
//        }
//    }
//
//    if (cidade == "Belém") {
//        println("Belenense")
//    } else if (cidade == "Estarreja") {
//        println("Estarrejense")
//    } else if (cidade == "Oliveira") {
//        println("Oliveirense")
//    }

    print("Entra com um número de 0 até 100: ")
    val numero: Int = readln().toInt()
    println(numero)

    // Laço que conta de 1 até 10
    for (i in 1..10) {
        print("$i ")
    }
    println()

    // Laço que conta de 1 até numero
    for (i in 1..numero) {
        print("$i ")
    }
    println()

    // Laço que conta de numero até 200 com passo 5
    for (i in numero..200 step 5) {
        print("$i ")
    }
    println()

    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    var j:Int = 0
    while (j < 10) {
        print("$j ")
        j++
    }
}