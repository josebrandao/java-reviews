public Class EstudanteApp{
	public static void main(String[] args){
		Usuario usuario = new Usuario(
		username:"java-kotlin-mestre",
		password:"ashja89702",
		email:"teste@test"
		
		);
	int idade = 18;
	char inicialDoNome = 'G';
	char inicialDoSobreNome = 'S';
	double media  = 10.0;
	boolean aprovado = true;
	System.out.println(usuario.email);
	System.out.println(usuario.password);
	System.out.println(usuario.username);
	System.out.println(media);

}
}