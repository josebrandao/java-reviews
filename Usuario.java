public class Usuario {
<<<<<<< HEAD

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
}
=======
	
	public String username;
	public String password;
	public String email;
	public boolean ativo;
	public boolean isActive(){
		return ativo;
		
		
	}
	
}
>>>>>>> 0f3ce5a4077e98f82977e183df6759f23f575332
