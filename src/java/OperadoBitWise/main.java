public class Main {
    public static void main(String[] args) {
        int x = 32; // 100000 em binário
        int y = x >> 3; // Desloca 3 bits à direita (divide por 8)

        System.out.println("Resultado: " + y); // 4
    }
}
