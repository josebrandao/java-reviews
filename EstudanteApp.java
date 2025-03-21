public class EstudanteApp {
	
	public static void main(String[] args){
		
		 // Declarando as variáveis
		int idade = 18;
		char inicialDoNome = 'G';
		char inicialDoSobreNome = 'S';
		double media  = 10.0;
		boolean aprovado = true;
		
		// Criando o objeto Usuario
		Usuario usuario = new Usuario(username:"java-kotlin-mestre",password:"ashja89702",email:"teste@test");
	
	
	System.out.println("email: " + usuario.email);
	System.out.println("Senha: " +usuario.password);
	System.out.println("UserName: " + usuario.username);
	System.out.println("Media: " + media);

}
}