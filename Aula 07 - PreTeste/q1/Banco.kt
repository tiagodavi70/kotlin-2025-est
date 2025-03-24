package q1

class Banco(val id: String, val nome: String) {

    fun abrirConta(): Boolean {
        return true
    }

    override fun toString(): String { return "ID: $id Nome: $nome" }
}