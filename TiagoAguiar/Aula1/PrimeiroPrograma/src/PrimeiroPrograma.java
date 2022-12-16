public class PrimeiroPrograma {
    public static void main(String[] args) {
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
