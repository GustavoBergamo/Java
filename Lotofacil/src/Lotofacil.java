//cria 15 números aleatórios para Lotofácil
//os 4 primeiros jogos são aleatórios
//os 4 últimos fazem espelho dos primeiros e adiciona 5 números aleatórios
//números até 25 e não repetidos

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.IntStream;


public class Lotofacil {
    public static void main(String[] args) {
        Random generate = new Random();
        Random generateB = new Random();
        Random generateC = new Random();
        Random generateD = new Random();

        int[] a = new int[25];
        int[] aa = new int[26];
        int[] b = new int[25];
        int i = 0;
        a[0] = 0;
        int number;

//while (true) resulta num looping infinito;
//for(;;) -> também resulta num looping infinito
        List sorteio1 = new ArrayList();
        List sorteio5 = new ArrayList();
        List sorteio9 = new ArrayList();

        while (i < 15) {
            number = generate.nextInt(26);
            if (number == a[0] || number == a[1] || number == a[2] || number == a[3] || number == a[4] || number == a[5] || number == a[6] || number == a[7] || number == a[8] || number == a[9] || number == a[10] || number == a[11] || number == a[12] || number == a[13] || number == a[14]) {
                number = generate.nextInt(26);
            } else {
                a[i] = number;
                i++;
            }
        }

        //colocando números em ordem.
        Arrays.sort(a);

        //Colocando números em List's
        for (i = 1; i <= 24; ++i) {
            if (a[i] != 0) {
                sorteio1.add(a[i]);
            }
        }

        //criando espelhos
        for (i = 1; i <= 25; i++) {
            if (!sorteio1.contains(i)) {
                sorteio5.add(i);
            }
        }

        // Adicionando 5 números aleatórios que faltam em sorteio5,6,7 e 8
        i = 0;
        while (i < 5) {
            number = generate.nextInt(26);
            while (sorteio5.contains(number) || number == 0) {
                number = generateD.nextInt(26);
            }
            sorteio5.add(number);
            i++;
        }


        i = 1;
        while (i < 25){
            if (sorteio1.contains(i) && sorteio5.contains(i)){
                System.out.print("");
            }else{
                sorteio9.add(i);
            }
            i++;
        }

        i = 1;
        while (i < 5) {
            number = generate.nextInt(26);
            if (!sorteio9.contains(number) && aa[0] == number || aa[1] == number || aa[2] == number || aa[3] == number) {
                number = generate.nextInt(26);
            } else {
                aa[i] = number;
                i++;
            }
        }

// removendo os 4 números sorteados acima do Jogo 3


//Colocando sorteio5,6,7 e 8 em ordem
        Collections.sort(sorteio5);
        Collections.sort(sorteio9);
        //imprimindo sorteio e arrumados

        i = 0;
        System.out.println("Jogo 1: ");
        while (i < 15) {
            if ((int) sorteio1.get(i) < 10) {
                System.out.print(sorteio1.get(i) + "   ");
            } else {
                System.out.print(sorteio1.get(i) + "  ");
            }
            i++;
        }
        System.out.println();
        System.out.println();

        i = 0;
        System.out.println("Jogo 2: ");
        while (i < 15) {
            if ((int) sorteio5.get(i) < 10) {
                System.out.print(sorteio5.get(i) + "   ");
            } else {
                System.out.print(sorteio5.get(i) + "  ");
            }
            i++;
        }
        System.out.println();

        i = 0;
        System.out.println("Jogo 3, " + "remover " + aa[1] + "-" + aa[2] + "-" + aa[3] + "-" + aa[4]);
        while (i < 19) {
            if ((int) sorteio9.get(i) < 10) {
                System.out.print(sorteio9.get(i) + "   ");
            } else {
                System.out.print(sorteio9.get(i) + "  ");
            }
            i++;
        }
        System.out.println();
        System.out.println();
    }
}
//while pode ser substituido por for
//for(int i = 0; i < 15; i++){}


