fun main() {
    //8. Escreva um programa que calcule a média de quatro números informados pelo usuário,
    // mas somente se esses números forem maiores que 0 e menores que 10.
    // No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste".
    // Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"

    val quantNotas = 4
    val notas = mutableListOf<Double>()

    //loop para ler 4 notas
    for(i in 1 ..quantNotas){
        println("Digite o valor $i º(entre 0 e 10): ")
        val nota = readln()?.toDoubleOrNull()

        if(nota != null){
            notas.add(nota) // adiciona o valor á lista
        }
        else{
            println("Entrada inválida. Por favor, digite um número válido")
            return // encerra o programa se a entrada for inválida
        }
    }
    //exibe as notas
    println("\nNotas informadas:")
    notas.forEachIndexed { index, nota ->
        println("valor ${index + 1}: $nota")
    }
    // calcula a média aritmética
    val media = notas.average()
    println("\nA média aitmética das notas é: $media")

}