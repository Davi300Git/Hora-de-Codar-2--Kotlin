fun main(){
    //11. Uma micro calculadora
    //Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações
    // a serem executadas (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
    //O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos.
    //
    //Observação: Considere que só serão lidos os valores 1, 2, 3 ou 4 para as operações

    print("Digite o primeiro valor inteiro: ")
    val valor1 = readlnOrNull()?.toIntOrNull()

    print("Digite o segundo valor inteiro: ")
    val valor2 = readlnOrNull()?.toIntOrNull()

    // Solicita a operação a ser realizada
    println("Escolha a operação:")
    println("1. Adição")
    println("2. Subtração")
    println("3. Divisão")
    println("4. Multiplicação")
    print("Digite o número da operação (1, 2, 3 ou 4): ")
    val operacao = readlnOrNull()?.toIntOrNull()

    // Verifica se os valores e a operação são válidos
    if (valor1 != null && valor2 != null && operacao != null && operacao in 1..4) {
        // Realiza a operação selecionada
        val resultado = when (operacao) {
            1 -> valor1 + valor2
            2 -> valor1 - valor2
            3 -> valor1 / valor2.toDouble() // Usa Double para divisão
            4 -> valor1 * valor2
            else -> null // Nunca será alcançado devido à validação anterior
        }

        // Exibe o resultado
        if (resultado != null) {
            println("Resultado: $resultado")
        }
    } else {
        println("Entrada inválida. Certifique-se de que os valores são inteiros e a operação é 1, 2, 3 ou 4.")
    }
}
