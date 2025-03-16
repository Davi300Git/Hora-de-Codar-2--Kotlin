fun main(){
    //10. Tendo como entrada a altura e o gênero designado ao nascer
// (codificado da seguinte forma: 1: feminino - 2: masculino - )
// de uma pessoa, construa um programa que calcule e imprima seu peso ideal,
// utilizando as seguintes fórmulas.

    print("Digite a altura (em metros): ")
    val altura = readlnOrNull()?.toDoubleOrNull()

    // Solicita o gênero designado ao nascer
    print("Digite o gênero (1 para feminino, 2 para masculino): ")
    val genero = readlnOrNull()?.toIntOrNull()

    // Verifica se os dados de entrada são válidos
    if (altura != null && altura > 0 && genero != null && (genero == 1 || genero == 2)) {
        // Calcula o peso ideal com base no gênero
        val pesoIdeal = when (genero) {
            1 -> (62.1 * altura) - 44.7 // Fórmula para feminino
            2 -> (72.7 * altura) - 58   // Fórmula para masculino
            else -> 0.0 // Nunca será alcançado devido à validação anterior
        }

        // Exibe o peso ideal
        println("Seu peso ideal é: ${"%.2f".format(pesoIdeal)} kg")
    } else {
        println("Dados de entrada inválidos. Certifique-se de que a altura é um número positivo e o gênero é 1 ou 2.")
    }

}