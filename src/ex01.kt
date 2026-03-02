fun main(){
    var valor_inicial: Double = 0.0
    var numerovalido: Boolean = false
    var juros: Double = 0.0

    println("Olá, seja bem vindo ao simulador de financiamento!")
    print("Qual valor deseja inserir na caixinha?: ")
    while (!numerovalido) {
        try {
            valor_inicial = readlnOrNull()!!.toDouble()
            numerovalido = true
        } catch (e: NumberFormatException) {
            print("de ruim, tente novamente: ")
            0.0
        }
    }

    numerovalido = false

    print("Qual a taxa de juros?")
    while (!numerovalido) {
        try {
            juros = readlnOrNull()!!.toDouble()
            numerovalido = true
        } catch(e:NumberFormatException) {
            print("Digite uma taxa de juros válida por favor: ")
        }
    }


    val valorfinal: Double = valor_inicial + (valor_inicial *  juros / 100)

    println("R$$valorfinal")

}