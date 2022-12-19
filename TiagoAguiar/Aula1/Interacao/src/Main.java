import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Iniciando o scanner para ler dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do usuário: ");
//Criando a variável tipo string com nome user = lendo a entrada de dados que envia para user
        String user = scanner.nextLine();
        System.out.println("Digite 2 números");
//Criando duas variáveis int
        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
//Apresentando resultado
        System.out.println();
        System.out.println("Usuário: " + user);
        System.out.println(one + " + " + two + " = " + (one + two));

    }
}