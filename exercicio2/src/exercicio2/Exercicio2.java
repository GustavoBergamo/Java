//Imprimir todos os múltiplos de 3 entre 1 e 100
package exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {

        for (int i = 3; i <=100; i = i + 1){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
    
}
