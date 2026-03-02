fun main(){

    // Crie uma variável númerica e exiba sua tabuada até 10

    print("Digite um número para multiplicar: ")
    val num: Int = readlnOrNull()!!.toInt()

    for(i in 1..10){
        println("$num X $i = ${num * i}")
    }

}