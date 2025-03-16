fun main() {
    //9. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem
// que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

    fun main() {
        // Obtém o ano atual
        val anoAtual = java.time.Year.now().value

        // Solicita o ano de nascimento do usuário
        print("Digite o ano de nascimento: ")
        val anoNascimento = readlnOrNull()?.toIntOrNull()

        // Verifica se o ano de nascimento é válido
        if (anoNascimento != null && anoNascimento <= anoAtual) {
            // Calcula a idade da pessoa
            val idade = anoAtual - anoNascimento

            // Verifica se a pessoa pode votar
            if (idade >= 16) {
                println("Você pode votar este ano!")
            } else {
                println("Você não pode votar este ano.")
            }
        } else {
            println("Ano de nascimento inválido.")
        }
    }
}