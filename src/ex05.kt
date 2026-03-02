fun main(){

    // Com um array de número, calcule a soma de todos eles

    var soma = 0
    val numeros = arrayOf(1,2,3,4,5)
    for(i in numeros){
        soma += i
    }
    print(soma)
}