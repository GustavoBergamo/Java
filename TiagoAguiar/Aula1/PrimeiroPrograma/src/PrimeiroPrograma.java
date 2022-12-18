public class PrimeiroPrograma {
//O Java procura esse main a seguir para saber onde começar.
//Os parâmetros do main são String e args
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

//Reutilizando o método sum criado lá bem baixo, os parâmetros estão entre parênteses
        sum(3, 4);
        sum(90, 89);
        sum(1234, 4321);
        sum(0, 1);
        System.out.println ("---------- Criando um espaço ----------");
        calc(5, 5);
// 5 e 5 são os argumentos da função calc da linha de cima.

//com [] colchetes é o bloco de coleção, igual linguagem C


    }

//Aqui foi criado uma instrução que pode ser chamada quando quiser.
//static void é a declaração padrão
//imprimir é o nome da função, pode ser qualquer coisa, geralmente usa verbo (o que a função faz)
// () parênteses usamos para definir o que chegará naquela função, tem que chegar algo. Sempre tipo e nome da variável
// em seguida colocar as chaves para o bloco de código{}
    static void imprimir() {
        System.out.println("chamei a instrução");
    }

//Programas dinâmicos
//Criando instrução de soma por exemplo
//Quando digitar sum vai chamar isso aqui em baixo
//O parênteses depois do sum é o que quer passar de variável
//Resumindo, quando dizer sum vai esperar (duas variáveis inteiras) e vai somá-las
    static void sum(int primeiroNumero, int segundoNumero) {
        System.out.println(primeiroNumero + segundoNumero);
    }

//criando uma instrução PADRÃO que faz as 4 operações com 2 números
    static void calc(double a, double b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
