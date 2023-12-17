package teste;

public class Privdo {
	private static String nome;
	private static int idade;
	
	public static void Setnomeidade (String name, int age) {
		System.out.println("Inserindo as variáveis");
		nome = name;
		idade = age;
	}
	
	public static String Getnome() {
		return nome;		
	}
	
	public static int Getidade() {
		return idade;
	}
}
