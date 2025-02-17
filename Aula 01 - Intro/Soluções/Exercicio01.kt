// Escreva um programa que receba o valor de um produto, e para cada 100,00€ dê um desconto de 0,05%.
fun main(){
    print("Entra com o valor do produto: ")
    val valorProduto: Double = readln().toDouble()
    val aplicarDesconto = (valorProduto / 100).toInt()
    val desconto = 0.05/100
    val valorDesconto = (aplicarDesconto * desconto) * valorProduto
    print("Valor do produto com desconto: ${valorProduto - valorDesconto}")
//    100 - 0.05
//    200 - 0.1
//    300 - 0.15
//        ......
}