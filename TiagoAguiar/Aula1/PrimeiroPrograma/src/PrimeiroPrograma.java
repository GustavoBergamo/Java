public class PrimeiroPrograma {
//O Java procura esse main a seguir para saber onde começar.
    public static void main(String[] args) {

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

//Pode usar também var pra declarar variáveis automaticamente
//o sistema vai saber se é int, double, string.....
        var login = "Samuel";
        var maiorIdade = true;
        var velhoSe = 80;
        var dinheiro = 123.50;
        System.out.println(login + maiorIdade + velhoSe + dinheiro);

//While
        while (enorme > 123456780) {
            System.out.print(enorme);
            enorme = enorme - 1;
        }

//For
        System.out.println("Contando de 0 até 10");
        for (int i = 0; i < 11; i = i + 1) {
            System.out.print("número ");
            System.out.print(i);
        }
        System.out.println("Olá Mundoooo!");
        System.out.println("Bem vindo ao arquivo que tem a primeira instrução");
        int a = 1000;
        imprimir();
        System.out.println(a + " primeiro número");
        int b = 100;
        int c = 10;
        int d = 1;
        imprimir();
        System.out.println(a + b + c + d);
        if (a > b){
            System.out.println(a + " a é maior que " + b);
        }else{
            System.out.println("Não é");
        }
    }

//Aqui foi criado uma instrução que pode ser chamada quando quiser.
    static void imprimir() {
        System.out.println("chamei a instrução");
    }

}
