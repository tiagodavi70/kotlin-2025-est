package ficheiros

import java.io.File

fun main() {

    val ola = "Olá mundo!"
    File("ola.txt").writeText(ola)
//    File("ola.txt").delete()
    val olaRead = File("ola.txt").readText()
    println(olaRead)
    File("ficheiros/").mkdir()
    File("ficheiros/ola.txt").writeText(ola + "\n" + ola)
    println(File("ficheiros/").listFiles().toList())
    println(File(".").listFiles().toList())
    File("ficheiros/ola.txt")
}