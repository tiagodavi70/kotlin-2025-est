import kotlin.random.Random

// somatorio e media
fun main() {
    val a = Array<Double>(Random.nextInt(100,150)){ Random.nextInt(0,999).toDouble()}
    println(somatorioMedia(a).toList())
}

fun somatorioMedia(arr: Array<Double>): DoubleArray {
    return doubleArrayOf(arr.sum(),arr.average())
}