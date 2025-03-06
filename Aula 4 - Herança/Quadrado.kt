class Quadrado(val lado: Double): Forma() {
    override fun area(): Double {
        return lado * lado
    }
}