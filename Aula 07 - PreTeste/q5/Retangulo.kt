package q5

class Retangulo(var largura: Double, var comprimento: Double) : CalcularTamanho {

    override fun calcularArea(): Double {
        return largura * comprimento
    }

    override fun calcularPerimetro(): Double {
        return 2*largura + 2*comprimento
    }
}