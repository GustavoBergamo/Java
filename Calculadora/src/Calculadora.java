//Programa que quando chamado pela linha de comando deve colocar mais 3 argumentos
//a operação que deseja realizar e os dois números que serão calculados.
public class Calculadora {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        if (args[0].equals("somar")) {
            so(a, b);
        } else if (args[0].equals("subtrair")) {
            su(a, b);
        } else if (args[0].equals("multiplicar")) {
            mu(a, b);
        } else if (args[0].equals("dividir")) {
            di(a, b);
        }else {
            System.out.println("erro");
        }
    }

//-------METODOS-------

    private static void so(int a, int b){
        System.out.println(a + b);
        }

    static void su(int a, int b){
        System.out.println(a - b);
        }

    static void mu(int a, int b){
        System.out.println(a * b);
        }

    static void di(int a, int b){
        System.out.println(a / b);
        }
    }

