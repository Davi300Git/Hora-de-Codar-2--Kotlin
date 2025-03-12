//4. Faça um programa que leia 3 valores informados pelo usuário
// considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

fun main(){
    var soma : Int
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
            println("O primeiro número é $num1")
            if(num2 > num3) {
                println("O segundo número é $num2")
                println("A soma deles é: "+ (num1 + num2))
            }
            else{
                println("O segundo número é $num3")
                println("A soma deles é: "+ (num1 + num3))
            }
        }
        else if(num2 > num1 && num2 > num3){
            println("O segundo número($num2) é o maior")
            if(num1 > num3) {
                println("O segundo número é $num1")
                println("A soma deles é: "+ (num2 + num1))
            }
            else{
                println("O segundo número é $num3")
                println("A soma deles é: "+ (num2 + num3))
            }
        }
        else if(num3 > num1 && num3 > num2){
            println("O terceiro número($num3) é o maior")
            if(num1 > num2) {
                println("O segundo número é $num1")
                println("A soma deles é: "+ (num3 + num1))
            }
            else{
                println("O segundo número é $num2")
                println("A soma deles é: "+ (num3 + num2))
            }
        }
        else{
            println("Os números são iguais! Tente novamente.")
        }
    } else {
        println("Entrada inválida. Certifique-se de digitar números válidos.")
    }
}