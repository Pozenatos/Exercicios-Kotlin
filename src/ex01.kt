fun main(){

    // Crie uma váriavel númerica e diga se o número par ou ímpar

    print("Digite um número: ")
    val num: Int = readLine()!!.toInt()

    if(num % 2 == 0){
        println("Esse número é par")
    } else{
        println("Esse número é ímpar")
    }
}
