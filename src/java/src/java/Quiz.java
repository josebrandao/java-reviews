import java.util.Scanner;

public class Quiz{
	
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual é a capital do Brasil?");
        System.out.println("1. São Paulo");
        System.out.println("2. Brasília");
        System.out.println("3. Rio de Janeiro");
        System.out.println("4. Salvador");
		// Lê a resposta do usuário
        System.out.print("Escolha a alternativa (1-4): ");
		int resposta = scanner.nextInt();

		 // Verifica a resposta usando switch case
        switch (resposta) {
            case 1:
                System.out.println("Resposta incorreta. A capital do Brasil não é São Paulo.");
                break;
            case 2:
                System.out.println("Resposta correta! A capital do Brasil é Brasília.");
                break;
            case 3:
                System.out.println("Resposta incorreta. A capital do Brasil não é Rio de Janeiro.");
                break;
            case 4:
                System.out.println("Resposta incorreta. A capital do Brasil não é Salvador.");
                break;
            default:
                System.out.println("Opção inválida! Por favor, escolha um número entre 1 e 4.");
                break;
        }

        // Fecha o scanner
        scanner.close();
    }
}
	