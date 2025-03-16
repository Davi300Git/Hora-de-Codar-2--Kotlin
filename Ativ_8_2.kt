fun main() {
    //8. Escreva um programa que calcule a média de quatro números informados pelo usuário,
    // mas somente se esses números forem maiores que 0 e menores que 10.
    // No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste".
    // Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"

    val numValidos = mutableListOf<Double>()

    //solicita ao usuário quatro números
    for (i in 1..4){
        while (true){
            print("Digite o $i° número (entre 0 e 10): ")
            val num = readlnOrNull()?.toDoubleOrNull()

            if(num != null && num > 0 && num < 10){
                numValidos.add(num)
                break
            }else{
                println("Número inválido! Digite um valor entre 0 e 10.")
            }
        }

    }
    var soma = 0.0
    for (numero in numValidos) {
        soma += numero
    }
    val media = soma / numValidos.size

    // Exibe a média
    println("Média calculada: $media")

    // Verifica a média e exibe a mensagem correspondente
    if (media > 5) {
        println("Você passou no teste!")
    } else {
        println("Tente novamente.")
    }

}