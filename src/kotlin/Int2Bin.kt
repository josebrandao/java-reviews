import java.util.Scanner // Importando o Scanner para pegar o input do usuário

fun main() {
    // Criando um objeto Scanner para pegar input do usuário
    val scanner = Scanner(System.`in`)

    // Solicitar um valor para o usuário
    println("Digite um número inteiro:")

    // Lê o número digitado
    val numero = scanner.nextInt()

    // Converte o número inteiro para binário e imprime
    val binario = Int2Bin(numero)
    println("O número $numero em binário é: $binario")
}

// Função para converter um número inteiro para binário
fun Int2Bin(numero: Int): String {
    var num = numero
    var binario = ""

    // Caso o número seja 0
    if (num == 0) {
        return "0"
    }

    // Loop para converter o número em binário
    while (num > 0) {
        binario = (num % 2).toString() + binario
        num /= 2
    }

    return binario
}
