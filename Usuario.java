public class Usuario {
    // Atributos do usuário
    public String username;
    public String password;
    public String email;
    public boolean ativo;

    // Construtor
    public Usuario(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.ativo = true;  // Definindo como ativo por padrão
    }

    // Método para verificar se o usuário está ativo
    public boolean isActive() {
        return ativo;
    }

    // Método para exibir as informações do usuário
    public void exibirInformacoes() {
        System.out.println("Usuário Criado:");
        System.out.println("Nome de usuário: " + username);
        System.out.println("E-mail: " + email);
        System.out.println("Ativo: " + isActive());
    }

    
        // Criando um novo usuário com dados simulados
        Usuario usuario = new Usuario("josebrandao", "senha123", "jose@example.com");

        // Exibindo os dados do usuário no console
        usuario.exibirInformacoes();
  
}
