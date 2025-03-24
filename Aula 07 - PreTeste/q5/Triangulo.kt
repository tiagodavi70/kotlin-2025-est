package q5

class Triangulo(val l1: Double, val l2: Double, val l3: Double ): CalcularTamanho {

    override fun calcularArea(): Double {
        return (l1 * (Math.sqrt((l3*l3) - Math.pow(l1/2.0,2.0))) )/2
    }

    override fun calcularPerimetro() = l1 + l2 + l3
}