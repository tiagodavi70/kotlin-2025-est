# Programação Orientada a Objetos


## Referência da linguagem Kotlin

### Entrada e Saída - CMD

* Saída de números e Strings

``` kotlin
println("Olá mundo!")
println(9)
```

* Interpolação com Strings
``` kotlin
val nome = "Tiago"
println("Olá " + nome)
println("Olá $nome")
```

* Interpolação com operações
``` kotlin
val numero = 20
println(numero)
println("numero + 10 = ${numero + 10}")
```

### Variáveis 

* Declaração sem tipo
``` kotlin
val decimal = 10.0
val inteira = 15
val cadeia = "Tiago"
```

* Variáveis mutáveis e imutáveis
``` kotlin
var mutavel = 5
mutavel = 6
val imutavel = 5
// imutavel = 8 // erro
```

### Tipos de dados
``` kotlin
val variavelInteira: Int = 10
val variavelDecimal: Double = 20.0
val variavelString: String = "Qualquer"
val variavelLogica: Boolean = true
val variavelFLutuante: Float = 3.2f
val variavelLong: Long = 6
val variavelChar: Char = 'a'
```
``` kotlin
variavelDecimal.toInt() // Kotlin tem várias opções para converter um tipo primitivo para outro
```

### Operadores
``` kotlin
val a = 10.0
val b = 15

a + b
a - b
a / b
a * b

val verdadeiro = true
val falso = false

verdadeiro and verdadeiro
falso or falso
!verdadeiro

a > b
a < b
a >= b
a <= b
a == b.toDouble()
a != b.toDouble()
```

### Estruturas de Decisão
``` kotlin
print("Entra com tua idade: ")
val idade = readln().toInt()
// val idade = readLine()!!.toInt()

if (idade >= 18) { // else não é obrigatório
    println("Pode votar!")
} else {
    println("Não pode votar")
}

print("Entra com tua cidade de nascimento: ")
//val cidade = readln()
val cidade = readLine()

if (cidade == "Belém") {
    println("Belenense")
} else if (cidade == "Oliveira de Azeméis") {
    println("Oliveirense")
} else if (cidade == "Porto") {
    println("Portuense")
} else if (cidade == "Aveiro") {
    println("Aveirense")
}

// Com uma variável pode-se comparar diretamente ou com (in começo..fim) para números
when (cidade) {
    "Belém" -> println("Belenense")
    "Oliveira de Azeméis" -> println("Oliveirense")
    "Porto" -> println("Portuense")
    "Aveiro" -> println("Aveirense")
    else -> println("Não sei")
}

// Sem variável qualquer condição lógica é válida
when {
    cidade == "Belém" -> println("Belenense")
    cidade == "Oliveira de Azeméis" -> println("Oliveirense")
    cidade == "Porto" -> println("Portuense")
    cidade == "Aveiro" -> println("Aveirense")
    else -> println("Não sei")
}

```
### Estruturas de Repetição
``` kotlin
for (i in 1..10){ // contar de um até 10
    print("$i ")
}
println()

for (i in 0..200 step 5) { // com passo 5
    print("$i ")
}
println()

for (i in 100 downTo 1) { // de trás pra frente
    print("$i ")
}
println()

var j = 1
while (j < 11) {
    print("$j ")
    j++ // j = j + 1, j += 1
}
```
### Arrays
``` kotlin
val arraySimples = arrayOf(1, 2 ,3)
arraySimples[0] // Os índices começam em 0
println(arraySimples[1])

var arrayMutavel = arrayOf(4, 5, 6)
arrayMutavel[1] = 10
println(arrayMutavel[1])
println(arrayMutavel)

// Não usar muito, mas é possível
var arrayGenerico = arrayOf(1, 1.6, "Ola", 'a')
println(arrayGenerico[3])

var arrayInteiro = intArrayOf(1, 2, 3)
var arrayDouble = doubleArrayOf(0.0, 0.0)

var arrayInteiroPreenchido = Array<Int>(10) { 0 }
for (i in arrayInteiroPreenchido) {
    print("$i ")
}
println()
for (i in 0 .. arrayInteiroPreenchido.size - 1) {
    print("${arrayInteiroPreenchido[i]} ")
}
```
### Listas
``` kotlin
val listaSimples = listOf(1, 2, 3)
val listaInteira = List<Int>(10) { 0 }

var listaMutavel = mutableListOf(4, 5, 6)
listaMutavel[2] = 10
println(listaMutavel)

listaMutavel.add(0, 9)
println(listaMutavel)
listaMutavel.add(15)
listaMutavel.removeFirst()
println(listaMutavel)
```
