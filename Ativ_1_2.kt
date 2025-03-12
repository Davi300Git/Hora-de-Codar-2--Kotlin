fun main() {
    //1. Escreva um programa em que o usuário informe dois números.
    // Então escreva em tela o maior deles.
    print("Informe o primeiro número: ")
    val num1 = readln()?.toDoubleOrNull()
    print("Informe o segundo número: ")
    val num2 = readln()?.toDoubleOrNull()

    // Verifica se os números foram fornecidos corretamente
    if (num1 != null && num2 != null) {
        // Compara os números e exibe o maior
    if(num1 > num2){
        println("O primeiro número($num1) é o maior")
    }
    else if(num1 < num2){
        println("O segundo número($num2) é o maior")
    }
    else{
        println("Os números são iguais! Tente novamente.")
    }
    } else {
        println("Entrada inválida. Certifique-se de digitar números válidos.")
    }
}