fun main(){

    // Dado um array de números. calcule somente a soma dos números pares

    var soma = 0
    val numeros = arrayOf(1,2,3,4,5)
    for(i in numeros){
        if (i % 2 == 0){
            soma += i
        }
    }
    print(soma)
}