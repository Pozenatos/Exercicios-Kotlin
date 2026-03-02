// Faça uma função que receba uma temperatura Celsius e retorne o valor em Fahrenheit

fun celsius(){

    print("Digite uma temperatura em celsius: ")
    val temp_celsius = readLine()!!.toDouble()

    val Fah = temp_celsius * 1.8 + 32.0

    println("$temp_celsius°C = $Fah°F")

}

fun main(){
    celsius()
}