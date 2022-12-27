import java.util.Scanner;

public class Primitivos {
    public static void main(String[] args) {

        System.out.println("Aprendendo mais sobre tipos primitivos");
        //booleanos
        boolean isLogged = true;
        //byte armazena um conjunto de 8 bits
        byte b = 127; //127 é o número máximo
        //usa byte pra fazer cálculo muito específico, manipular imagens...
        char letter = 'c'; //único caracter
        String cjto = "word"; //conjunto de caracteres, não é primitivo
        short curto = -12; //igual int só que com menos espaços
        int intero = 1234;
        long imenso = 1023984710982347L; //Sempre colocar L no final pra especificar que é longo
        float flutua = 12.98f; //menos que double, tem que colocar f no final 32bits
        double duplo = 19.19; //64bits

        System.out.println(isLogged);
        System.out.println(b);
        System.out.println(letter);
        System.out.println(cjto);
        System.out.println(curto);
        System.out.println(intero);
        System.out.println(imenso);
        System.out.println(flutua);
        System.out.println(duplo);

        //COMO CONVERTER OS TIPOS?
        //se chama Casting

        double dd = 10.10;
        short ss = 32;
        System.out.println(dd / ss);
        //pra converter double em float p.e.:
        float ff = (float) dd / ss; //só colocar entre parênteses antes
        System.out.println(ff);
        int ii = (int) dd / ss;
        System.out.println(ii);
        Scanner scanner = new Scanner(System.in);
        int z = (int) scanner.nextDouble();//pode entrar qualquer número que armazena inteiro
        System.out.println(z);





    }
}