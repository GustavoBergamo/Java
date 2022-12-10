public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
//Variáveis 
        int idade = 10;
        double pi = 3.14;
        boolean verdade = true;
        boolean menorIdade = idade < 18;
//Char só guarda uma letra
        char letra;
        letra = 'a';
        System.out.println(letra);
        System.out.println(idade);
        System.out.print(pi);
        System.out.println(verdade);
        System.out.println("Teste de imprimir ");
//Arredondando número quebrado para inteiro
        double d2 = 3.14;
        int d2inteiro = (int) d2;
        System.out.println(d2inteiro);
//Variável para números longos
        long enorme = 123456789;
        System.out.println(enorme);
//While
        while (enorme > 123456780) {
            System.out.println(enorme);
            enorme = enorme - 1;
        }     
//For
        System.out.println("Contando de 0 até 10");
        for (int i = 0; i < 11; i = i + 1) {
            System.out.print("número ");
            System.out.println(i);
        }
    }
}
