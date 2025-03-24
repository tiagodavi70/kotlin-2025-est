package q1

class Casa(val cor: String, val endereco: String, val numQuartos: Int) {

//    fun tipologia(): String {
//        when (numQuartos) {
//            1 -> return "T1"
//            2 -> return "T2"
//            3 -> return "T3"
//            else -> return "Outros"
//        }
//    }
    fun tipologia() = when (numQuartos) {
            1 -> "T1"
            2 -> "T2"
            3 -> "T3"
            else -> "Outros"
        }

    override fun toString(): String {
        return "Cor: $cor | Endereco: $endereco | Num Quartos: $numQuartos"
    }
}