class Circulo(val raio: Double): Forma() {
    override fun area(): Double {
        return 2 * Math.PI * (raio * raio)
    }
}