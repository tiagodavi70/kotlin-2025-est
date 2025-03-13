import kotlin.random.Random

/*
class Pessoa(var nome: String, val nif: String, var telemovel: String = "0000") {
}
*/

/*
class Pessoa(){ }
 */
class Pessoa {
    // get() = nome
    public var nome: String = ""
        get() {
            println("get get get")
            return field
        }
        set(value) {
            field = value
        }
    private var codigo: Int
    private var nif: String
    private var telemovel: String
    private var email: String

    init {
        this.codigo = Random.nextInt(0,10)
    }

    init {
        if (this.codigo > 5) {
            println("Codigo maior que 5")
        }
    }

    constructor(nome: String, nif: String, telemovel: String = "000", email: String = "@@") {
        this.nome = nome
        this.nif = nif
        this.telemovel = telemovel
        this.email = email
        println("Ola construtor 1")
    }

    constructor(nome: String, nif: String) {
        this.nome = nome
        this.nif = nif
        this.telemovel = "000"
        this.email = "@@"
    }

    // jeito java de viver
//    public fun getNome(): String {
//        return this.nome
//    }
//    public fun setNome(valor: String) {
//        this.nome = valor
//    }
}

