fun main() {
    //3. Faça um programa para ler 3 valores
    // (considere que não serão informados valores iguais) e escrever o maior deles.

    print("Informe o primeiro número: ")
    val num1 = readln()?.toDoubleOrNull()
    print("Informe o segundo número: ")
    val num2 = readln()?.toDoubleOrNull()
    print("Informe o segundo número: ")
    val num3 = readln()?.toDoubleOrNull()

    // Verifica se os números foram fornecidos corretamente
    if (num1 != null && num2 != null && num3 != null) {
        // Compara os números e exibe o maior
        if(num1 > num2 && num1 > num3){
            println("O primeiro número($num1) é o maior")
        }
        else if(num1 < num2 && num2 > num3){
            println("O segundo número($num2) é o maior")
        }
        else if(num3 > num2 && num3 > num2){
            println("O terceiro número($num3) é o maior")
        }
        else{
            println("Os números são iguais! Tente novamente.")
        }
    } else {
        println("Entrada inválida. Certifique-se de digitar números válidos.")
    }
}
