// 5.  Faça um programa que leia 6 valores informados pelo usuário, calcule,
// exiba os números informados e escreva a média aritmética desses valores lidos.
fun main() {
    val quantidadeValores = 6
    val valores = mutableListOf<Double>()

    //loop para ler os 6 valores
    for(i in 1..quantidadeValores){
        println("Digite o valor $i: ")
        val valor = readln()?.toDoubleOrNull()

        if(valor != null){
            valores.add(valor) // adiciona o valor á lista
        }
        else{
            println("Entrada inválida. Por favor, digite um número válido")
            return // encerra o programa se a entrada for inválida
        }
    }
    // exibe os valores informados
    println("\nValores informados:")
    valores.forEachIndexed { index, valor ->
        println("valor ${index + 1}: $valor")
    }
    //calcula o média aritmética
    val media = valores.average()
    println("\nA média aritmética dos valores é: $media")
}