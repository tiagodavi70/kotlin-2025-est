//class Homem(val nome: String, var idade: Int, var peso: Double) {
//}

class Homem {
    var nome: String = ""
        get() = field
        set(value) {field = value}
    var idade: Int = 0
        get() = field
        set(value) {field = value}
    var peso: Double = 0.0
        get() = field
        set(value) {
            historico(this,field)
            field = value
        }
    val historico: MutableList<Double>
        get() = pegarHistorico(this)

    constructor(nome: String, idade: Int, peso: Double) {
        this.nome = nome
        this.peso = peso
        this.idade = idade
    }
}

fun historico(homem: Homem, peso: Double ) {
    // mandar pra um banco de dados ou pra internet
}

fun pegarHistorico(homem: Homem): MutableList<Double> {
   return mutableListOf<Double>()
}
