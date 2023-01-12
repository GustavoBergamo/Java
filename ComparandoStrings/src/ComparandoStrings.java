import java.util.Scanner;

public class ComparandoStrings {
    public static void main(String[] args) {
        String password = "123456";
        System.out.println("Digite a senha: ");
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
//Operador == não serve pra Strings, usar equals porque == compara endereço de memória nesse caso
        System.out.println(password.equals(pass));
        if (password.equals(pass)){
            System.out.println("Senha Correta");
        }else{
            System.out.println("Senha incorreta");
        }
    }
}