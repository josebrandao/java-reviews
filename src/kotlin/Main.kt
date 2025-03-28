import java.util.Scanner // Importando o Scanner do Java

fun main() {
    // Criando um objeto Scanner para pegar input do usuário
    val scanner = Scanner(System.`in`)

    // Solicitar um valor para o usuário
    println("Digite um número de 1 a 3 para ver a mensagem correspondente:")

    // Lê o número digitado
    val numero = scanner.nextInt()

    // Testando o switch usando `when`
    when (numero) {
        1 -> println("Você escolheu o número 1!")
        2 -> println("Você escolheu o número 2!")
        3 -> println("Você escolheu o número 3!")
        else -> println("Número inválido!") // Caso o número não seja 1, 2 ou 3
    }
}
