package q6
// Escreva uma classe abstrata chamada Compartimento. Um Compartimento deve
//conter:
//• Um nome
//• Um tipo de piso
//• Um tamanho em M2
// Escreva as classes Quarto, Cozinha e Sala, subclasses de Compartimento
//• Quarto contém um campo que indica o tipo de cama (String)
//• Cozinha contém um campo que indica quantidade de geladeiras (Int)
//• Sala contém um campo que indica quantos sofás tem na sala (Int)
//Crie um programa com uma lista com 8 desses compartimentos, e crie uma função que
//dado uma lista de compartimentos retorne o compartimento com o maior tamanho dessa
//lista.

fun main() {

    val c1 = Quarto("Quarto 1", "Taco", 6.0, 1)
    val c2 = Quarto("Quarto 2", "Cerâmica", 8.0, 2)
    val c3 = Quarto("Quarto 3", "Parquet", 7.0, 1)

    val cz1 = Cozinha("Cozinha 1", "Taco", 5.0, 1)
    val cz2 = Cozinha("Cozinha 2", "Cerâmica", 6.0, 2)
    val cz3 = Cozinha("Cozinha 3", "Parquet", 4.5, 1)

    val s1 = Sala("Sala 1", "Taco", 9.0, 1)
    val s2 = Sala("Sala 2", "Cerâmica", 10.0, 2)

    val listaCompartimentos = listOf<Compartimento>(c1, c2, c3, cz1, cz2, cz3, s1, s2)

    println(maiorCompartimento(listaCompartimentos).tamanho)
    println(listaCompartimentos.maxOf { cmp -> cmp.tamanho })
    println(listaCompartimentos.sortedBy { cmp -> cmp.tamanho }[listaCompartimentos.size-1].tamanho)
}

fun maiorCompartimento(lista: List<Compartimento>): Compartimento {
    var maior: Compartimento = lista[0]
    for (l in lista) {
        if (maior.tamanho < l.tamanho) {
            maior = l
        }
    }
    return maior
}