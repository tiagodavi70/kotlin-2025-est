import kotlin.random.Random

fun main() {

    val animalAbstrato = Animal("Animalesco")
    val gato = Gato("Nina 2")

    println(animalAbstrato.nome)
    println(gato.nome)

    println(animalAbstrato.domestico())
    println(gato.domestico())

    val cachorro = Cachorro("Pingo", 15)
    println(cachorro.idade)

    mostrarAnimal(animalAbstrato)
    mostrarAnimal(gato)
    mostrarAnimal(cachorro)

    val formas = mutableListOf<Forma>()
    for (i in 0..Random.nextInt(10, 15)) {
        if (Random.nextDouble() > 0.5) {
            formas.add(Quadrado(Random.nextInt(5,7).toDouble()))
        } else {
            formas.add(Circulo(Random.nextInt(5,7).toDouble()))
        }
    }
    for (forma in formas) {
        println("${forma.area()} ${forma.javaClass}")
    }
}

fun mostrarAnimal(animal: Animal) {
    println("${animal.nome} ${animal.javaClass}")
}