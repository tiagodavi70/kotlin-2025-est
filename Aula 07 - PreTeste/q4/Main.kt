package q4

import java.time.LocalDateTime
import java.time.LocalTime
import kotlin.random.Random

//Um sistema de entregas tem três Classes: Pessoa, Entrega, Pacote. A classe Entrega
//tem dois atributos Pessoa: Um remetente e um destinatário, assim como informação de
//entregue ou não. A classe Pacote tem um ID e o peso. Crie 8 pessoas e faça 200 entregas
//variando os atributos


fun main() {
    val p1 = Pessoa("Tiago")
    val p2 = Pessoa("Davi")
    val p3 = Pessoa("Alexandre")
    val p4 = Pessoa("Paulo")
    val p5 = Pessoa("João")
    val p6 = Pessoa("Bernardo")
    val p7 = Pessoa("Manuel")
    val p8 = Pessoa("Isabel")

    val listaPessoas = listOf<Pessoa>(p1, p2, p3, p4, p5, p6, p7, p8)

    var listaPacotes = mutableListOf<Pacote>()
    for (i in 1..200) {
        listaPacotes.add(Pacote(LocalDateTime.now().toString(),
            Random.nextDouble(0.3, 3.0)))
    }

    var listaEntregas = mutableListOf<Entrega>()
    for (i in 1..200) {
        listaEntregas.add(Entrega(listaPessoas[Random.nextInt(0,7)],
            listaPessoas[Random.nextInt(0,7)], Random.nextBoolean()))
    }

    println(listaEntregas.size)
}


