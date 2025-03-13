fun main() {
//7. Faça um programa que leia 6 números que o usuário vai informar.
// Todos os números lidos com valor inferior a 72 devem ser somados.
// Escreva o valor final da soma efetuada e também todos valores que o usuário informou.

    var i = 0
    var numero : Int
    var soma = 0
    val numeros = IntArray(6) { 0 }

    while(i <= 5){
        println("Insira o ${i + 1}º valor: ")
        numeros[i] = readln().toInt()
        i++
    }
    i = 0
    println("Valores informados:")
    println(numeros.joinToString())

    while(i <= 5){
        if(numeros[i] < 72){
            soma += numeros[i]
        }
        i++
    }
    println("A soma dos valores menores que 72: ${soma}")
}