// Crie uma classe chamada Carro com os atributos marca, modelo, velocidade e ano. Crie um metodo que exiba essas informações. Depois, crie quatro objetos e mostre seus dados.
// Utilizando a classe da questão anterior crie um metodo idade para calcular a idade do carro e um metodo conversão para converter de Km/h para MPH. ('x' km = (0.62137x) milhas)

fun main() {

    var carro: Carro = criarVeiculo()

    val carro1 = Carro("aaa", "bbb", 150.0, 2008)
    val carro2 = Carro("ccc", "ddd", 140.0, 2009)
    val carro3 = Carro("eee", "fff", 160.0, 2006)
    val carro4 = Carro("ggg", "hhh", 170.0, 2012)

    for (carro in arrayOf(carro1, carro2, carro3, carro4)) {
        println(carro.exibir())
    }
}


fun criarVeiculo(): Carro {
    return Carro("aa", "a", 30.0, 1992)
}