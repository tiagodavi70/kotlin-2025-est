
fun main() {
    val pessoa1 = Pessoa("Tiago", "00")
//    println(pessoa1.getNome())
    println(pessoa1)
    val davi = Pessoa("Davi", "01", "99999")
//    println(davi.getNome())
    println(davi)
    val pessoa2 = Pessoa("Tiago", "02")
//    println(pessoa2.getNome())
    println("$pessoa1 $pessoa2")
    if (pessoa1 == pessoa2) {
        println("Igual")
    } else {
        println("Diferente")
    }

//    println(pessoa1.getNome())
    println(pessoa1.nome) // pessoa.getNome()

//    pessoa1.nome = "Tiago Davi" // pessoa.setNome("Tiago Davi")

}