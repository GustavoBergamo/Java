//Imprimir fatoriais de 10
package exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
        int soma = 1;
        for (int i = 1; i < 11; i = i + 1) {
            soma = soma * i;
            System.out.println(soma);  
        }    
    }   
}
