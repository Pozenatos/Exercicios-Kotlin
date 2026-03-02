fun main(){

    // Crie uma váriavel númerica eexiba se o número é positivo, negativo ou zero


    print("Digite um número: ")
    val num: Int = readLine()!!.toInt()

    if(num < 0){
        println("O número $num é negativo")
    }   else if(num == 0){
        println("Você digitou o número $num")
    }   else{
        println("O número $num é positivo")
    }

}