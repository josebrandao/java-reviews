public class EstudanteApp {
	
	//public static void main(String[] args){
		
		 // Declarando as variáveis
		int idade = 18;
		char inicialDoNome = 'G';
		char inicialDoSobreNome = 'S';
		double media  = 10.0;
		boolean aprovado = true;
		
		// Criando o objeto Usuario
		Usuario usuario = new Usuario("java-kotlin-mestre","ashja89702","teste@test");
	
	
	System.out.println("email: " + usuario.email);
	System.out.println("Senha: " +usuario.password);
	System.out.println("UserName: " + usuario.username);
	System.out.println("Media: " + media);

}
//} o main.java foi compilado esse foi o motivo de nao funcionar a principio sem o Main indispensavel