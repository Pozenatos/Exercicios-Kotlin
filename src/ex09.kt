// Crie uma função que receba um número e retorne o dobro dele

fun dobro(numero: Int){

    println(numero * 2)

}
fun main(){
    print("Digite um número: ")
    val num: Int = readLine()!!.toInt()
    dobro(num)
}