fun main() {
    val arrayA: Array<Int> = arrayOf(1,2,3)
    var arrayAP = Array<Double>(3){ 0.0 }
    val arrayB = intArrayOf(1,2,3)


    val arrayDouble: DoubleArray = doubleArrayOf(1.1, 1.5)
    charArrayOf()
    longArrayOf()
    booleanArrayOf(true, false, false, true, false)

    val arrayGenerico = arrayOf(1,2,3) // evitar

    // val arrayDoideira = arrayOf(1, 2, 3.2, "OLA") // não usar por favor

    var arrayC = intArrayOf(1, 2, 3, 4, 5)
    var arrayD = intArrayOf(1, 2, 3, 4, 5)
    arrayC[4] = 50
    println("${arrayC[4]}")

    var arrayPreenchido = Array<Double>(8){ 0.0 }
//    for (i in 0..arrayPreenchido.size-1) {
//        print("${arrayPreenchido[i]} ")
//    }
    println(arrayToString(arrayPreenchido))

    val listaA = listOf(1, 2, 3)
    println(listaA[1])

    var listaB = mutableListOf<Int>(1, 2, 3)
    listaB.add(8)
    println(listaB)
    listaB.removeFirst()
    println(listaB)
    listaB.add(1, 9)
    println(listaB)

}

fun <T> arrayToString(arr: Array<T>): String {
    var saida: String = "["
    for (i in 0..arr.size-1) {
        saida += "${arr[i]}"
        if (i == arr.size-1) {
            saida += "]"
        } else {
            saida += " "
        }
    }
    return saida
}