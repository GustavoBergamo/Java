//cria 15 números aleatórios para Lotofácil
//números até 25 e não repetidos

import java.util.Random;

public class Lotofacil {
    public static void main(String[] args) {
        Random generate = new Random();

        int[] a = new int[15];
        int i = 0;
        a[0] = 0;
//while (true) resulta num looping infinito;
//for(;;) -> também resulta num looping infinito
        while (i < 15) {
                int number = generate.nextInt(26);
                if (number == a[0] || number == a[1] || number == a[2] || number == a[3] || number == a[4] || number == a[5] || number == a[6] || number == a[7] || number == a[8] || number == a[9] || number == a[10] || number == a[11] || number == a[12] || number == a[13] || number == a[14]) {
                   System.out.println(number + "Deu igual");
                    number = generate.nextInt();
                }else{
                a[i] = number;
                i++;}
//a mesma coisa com for
//for(int i = 0; i < 15; i++){}
        }
        for (i = 0; i < 15; i++) {
            System.out.print(a[i] + " - ");
        }
    }
}
