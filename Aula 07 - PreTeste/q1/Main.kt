package q1

//Considere as entidades abaixo:
//Banco, Casa, Mesa, Árvore, Prato
//Crie uma classe para cada entidade, com 2 atributos e 1 metodo no mínimo. Sobrescreva
//o metodo toString para apresentar as informações sobre a classe. Crie um programa em
//Kotlin que crie 2 objetos para cada classe criada e apresente na tela todos eles

fun main() {
    println(Banco("1", "Caixa"))
    println(Banco("2", "Santander Totta"))
    println(Casa("Branco", "Estarreja", 3))
    println(Casa("Vermelho", "Estarreja", 4))
    println(Mesa(1.5, 1.0, "Madeira"))
    println(Mesa(1.5, 1.0, "Vidro"))
    println(Arvore(3.5, "Salgueiro", 10))
    println(Arvore(4.5, "Carvalho", 15))
    println(Prato("Plastico", 20.0, "Branco"))
    println(Prato("Porcelana", 20.0, "Vermelho"))
}