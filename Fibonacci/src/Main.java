import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sequência de Fibonacci");
        System.out.println("Você quer ver a sequência até qual número? ");
        new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        int seq = Integer.parseInt(number.next());
        new Fibonacci(seq);
        System.out.println("Fim");
    }
}