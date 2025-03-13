fun main() {
    //6. Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro,
    // o último e o maior de todos eles (considere que todos os números informados serão diferentes)

        var soma : Int
        print("Informe o primeiro número: ")
        val num1 = readln()?.toDoubleOrNull()
        print("Informe o segundo número: ")
        val num2 = readln()?.toDoubleOrNull()
        print("Informe o terceiro número: ")
        val num3 = readln()?.toDoubleOrNull()
        print("Informe o quarto número: ")
        val num4 = readln()?.toDoubleOrNull()

        // Verifica se os números foram fornecidos corretamente
        if (num1 != null && num2 != null && num3 != null && num4 != null) {
            // Compara os números e exibe o maior
            if(num1 > num2 && num1 > num3 && num1 > num4){
                println("O primeiro número é: $num1")
                println("O último número é: $num4")
                println("O número maior é: $num1")

            }
            else if(num2 > num1 && num2 > num3 && num2 > num4){
                    println("O primeiro número é: $num1")
                    println("O último número é: $num4")
                    println("O número maior é: $num2")
            }
            else if(num3 > num1 && num3 > num2 && num3 > num4){
                    println("O primeiro número é: $num1")
                    println("O último número é: $num4")
                    println("O número maior é: $num3")
            }
            else if(num4 > num1 && num4 > num2 && num4 > num3){
                println("O primeiro número é: $num1")
                println("O último número é: $num4")
                println("O número maior é: $num4")
            }
            else{
                println("Os números são iguais! Tente novamente.")
            }
        } else {
            println("Entrada inválida. Certifique-se de digitar números válidos.")
        }
    }