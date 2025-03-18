package exercicio3

import java.io.File
import java.io.FileNotFoundException

// Crie alguns ficheiros numa pasta e crie exceções próprias para os seguintes casos: ficheiro não encontrado,
// ficheiro sem permissão de escrita, diretório sem permissão de escrita.

class FicheiroNaoEncontrado : FileNotFoundException("Ficheiro não encontrado.")

class SemPermissaoEscrita : FileNotFoundException("Sem permissão de escrita.")

fun main() {
//    try {
//        val ficheiro = verificarFicheiro("ficheiros/olamundo.txt")
//    } catch (e: FicheiroNaoEncontrado) {
//        println(e.message)
//    }

    try {
//        val ficheiro2 = verificarEscrita("ex3/ficheiroEmBranco.txt")
    } catch (e: SemPermissaoEscrita) {
        println(e.message)
    }
}

fun verificarFicheiro(caminho: String) : File {
    if (!File(caminho).exists()) throw FicheiroNaoEncontrado()
    return File(caminho)
}

//fun verificarEscrita(caminho: String) : File {
////    if (!File(caminho).canWrite()) throw SemPermissaoEscrita()
////    return File(caminho)
//}