// Faça uma função que receba um número e retorne o dobro dele

fun media(){
    val tamanho = 3
    val notas = DoubleArray(tamanho)
    for (i in notas.indices){
        print("Digite a ${i+1}° nota: ")
        var entrada = readLine()!!.toDouble()
        notas[i] = entrada
    }
    val soma = notas.sum()
    val resultadoMedia = soma / tamanho

    println("\nA média das $tamanho notas é: $resultadoMedia")
}

fun main(){
    media()
}