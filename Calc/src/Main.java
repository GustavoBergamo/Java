import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" --- Calculadora --- ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("|   Qual operação?  |");
        String option = scanner.nextLine();
        System.out.println("Digite 2 números para " + option);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (Objects.equals(option, "somar")){Somar.main(a, b );}
        else if (Objects.equals(option, "subtrair")){Subtrair.main(a, b);}
        else if (Objects.equals(option, "multiplicar")){Multiplicar.main(a, b);}
        else if (Objects.equals(option, "dividir")){Dividir.main(a, b);}


    }

}