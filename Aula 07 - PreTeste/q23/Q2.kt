package q23

fun main() {

    val p1 = Produto("Portatil", "Lenovo", 3.000)
    val p2 = Produto("Smartphone", "Xiaomi", 759.0)
    val p3 = Produto("Fones", "Sony", 49.99)
    val p4 = Produto("Tablet", "Samsung", 250.0)
    val p5 = Produto("Rato", "Razer", 50.0)

    val listaProdutos = listOf<Produto>(p1, p2, p3, p4, p5)

    print("Entra com um nome para pesquisar: ")
    val nome = readln()
    var encontrado: Produto? = null
    for (p in listaProdutos) {
        if (p.nome == nome) {
            encontrado = p
        }
    }
    if (!(encontrado == null)) {
        println(encontrado)
    } else {
        println("Não existe")
    }

    var indice = -1
    for (i in 0..listaProdutos.size-1) {
        if (listaProdutos[i].nome == nome) {
            indice = i
        }
    }
    if (indice != -1) {
        println(listaProdutos[indice])
    } else {
        println("Não existe")
    }


    listaProdutos.forEach { p -> if (p.nome == nome) println(p) }
    val resultado = listaProdutos.filter {p -> p.nome == nome}

    if (resultado.size > 0) println(resultado[0])
    else println("Não existe")
}