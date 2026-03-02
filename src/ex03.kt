fun main(){

    // Crie uma variável idade e diga "Criança" se < 12, "Adolescente" se estiver entre 12 e 17, "Adulto" entre 18 e 59, 60 ou mais para "Idoso"

    print("Digite sua idade: ")
    val idade: Int = readlnOrNull()!!.toInt()

    when(idade){
        in Int.MIN_VALUE..-1 -> println("Idade Negativa?")
        in 0..12 -> println("Criança")
        in 12 .. 17 -> println("Adolescente")
        in 18 .. 59 -> println("Adulto")
        in 60 .. 120 -> println("Idoso")
        else -> println("Provavelmente morto")
    }
}