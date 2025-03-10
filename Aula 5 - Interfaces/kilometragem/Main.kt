package kilometragem
fun main() {

    // Ligeiros e pesados
    // percorrer(km) e curvas(curva) (direita, esquerda)

    val corredores = mutableListOf<Direcao>()
    val ligeiro1 = Ligeiro("Ligeirinho", 120.0)
    val pesado1 = Pesado("Pesado pesado", 100.0)
    corredores.add(ligeiro1)
    corredores.add(pesado1)

    ligeiro1.percorrer(50.0)
    pesado1.percorrer(50.0)
}