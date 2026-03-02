fun main(){

    // Crie uma variável numérica e exiba uma contagem regressiva até zero

    print("Digite um número: ")
    val num: Int = readLine()!!.toInt()

    for (i in num downTo 0) {
        print("$i ")
        Thread.sleep(500)
    }
}