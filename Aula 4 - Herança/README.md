# Exercícios

1. Implemente a classe Felino, e as subclasses Gato, Tigre e Leão. A classe Felino deve ter os atributos `nome` e `peso`, e um método que retorna se é doméstico ou não. Defina como deve ser o construtor de cada subclasse. Defina também usando polimorfismo se o Felino é ou não doméstico. Crie uma classe Zoologico com 40 animais para testar as classes criadas.

2. 
``` kotlin
class Automovel(
    val modelo: String,
    var litrosTanque: Double, // litros que ainda estão no tanque
    var litrosKm: Double // consumo de litros por km
) {
    // Dado uma distância em km, calcula os litros utilizados
    fun litrosUtilizados(km: Double): Double {
        val litros = km * this.litrosKm
        consumirTanque(litros)
        return litros
    }

    // Consome a gasolina do tanque
    fun consumirTanque(litros: Double) {
       
    }
}
```

Utilizando a classe acima: termine a função `consumirTanque` e crie uma subclasse `Economico` que usa polimorfismo para diminuir o consumo em `3%`. Crie 50 automóveis e corra 150km com cada um.

3. Das classes `Comodo` e `Casa` do exercicio 1 da aula anterior crie os métodos `toString` usando `override`. Crie 10 casas e apresente as informações sobre elas.

