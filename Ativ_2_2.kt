// 2. Faça um programa que leia um valor informado pelo usuário e
// diga se o valor informado é positivo, negativo ou zero.
fun main() {
    print("Informe um número: ")
    val num = readln()?.toDoubleOrNull()

    if (num != null ) {
        if (num > 0) {
            println("O número é positivo")
        }
        else if(num < 0){
            println("O número é negativo")
        }
        else{
            println("O número é igual a zero")
        }
    }
}