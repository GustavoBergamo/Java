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
        int[] b = new int[25];
        int[] c = new int[25];
        int[] d = new int[25];
        int[] aa = new int[30];
        int i = 0;
        a[0] = 0;
        b[0] = 0;
        c[0] = 0;
        d[0] = 0;
        int number;

//while (true) resulta num looping infinito;
//for(;;) -> também resulta num looping infinito
        List sorteio1 = new ArrayList();
        List sorteio2 = new ArrayList();
        List sorteio3 = new ArrayList();
        List sorteio4 = new ArrayList();
        List sorteio5 = new ArrayList();
        List sorteio6 = new ArrayList();
        List sorteio7 = new ArrayList();
        List sorteio8 = new ArrayList();


        while (i < 15) {
            number = generate.nextInt(26);
            if (number == a[0] || number == a[1] || number == a[2] || number == a[3] || number == a[4] || number == a[5] || number == a[6] || number == a[7] || number == a[8] || number == a[9] || number == a[10] || number == a[11] || number == a[12] || number == a[13] || number == a[14]) {
                number = generate.nextInt(26);
            } else {
                a[i] = number;
                i++;
            }
        }

        System.out.println();
        i = 0;

        while (i < 15) {
            number = generate.nextInt(26);
            if (number == b[0] || number == b[1] || number == b[2] || number == b[3] || number == b[4] || number == b[5] || number == b[6] || number == b[7] || number == b[8] || number == b[9] || number == b[10] || number == b[11] || number == b[12] || number == b[13] || number == b[14]) {
                number = generateB.nextInt(26);
            } else {
                b[i] = number;
                i++;
            }
        }

        System.out.println();
        i = 0;

        while (i < 15) {
            number = generate.nextInt(26);
            if (number == c[0] || number == c[1] || number == c[2] || number == c[3] || number == c[4] || number == c[5] || number == c[6] || number == c[7] || number == c[8] || number == c[9] || number == c[10] || number == c[11] || number == c[12] || number == c[13] || number == c[14]) {
                number = generateC.nextInt(26);
            } else {
                c[i] = number;
                i++;
            }
        }

        System.out.println();
        i = 0;

        while (i < 15) {
            number = generate.nextInt(26);
            if (number == d[0] || number == d[1] || number == d[2] || number == d[3] || number == d[4] || number == d[5] || number == d[6] || number == d[7] || number == d[8] || number == d[9] || number == d[10] || number == d[11] || number == d[12] || number == d[13] || number == d[14]) {
                number = generateD.nextInt(26);
            } else {
                d[i] = number;
                i++;
            }
        }

        //colocando números em ordem.
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        Arrays.sort(d);

        //Colocando números em List's
        for(i = 1; i <= 24; ++i) {
            if (a[i] != 0){
                sorteio1.add(a[i]);
            }
        }

        for(i = 1; i <= 24; ++i) {
            if (b[i] != 0){
                sorteio2.add(b[i]);
            }
        }

        for(i = 1; i <= 24; ++i) {
            if (c[i] != 0){
                sorteio3.add(c[i]);
            }
        }

        for(i = 1; i <= 24; ++i) {
            if (d[i] != 0){
                sorteio4.add(d[i]);
            }
        }


        //criando espelhos
        for (i = 1; i <= 25; i++){
            if (!sorteio1.contains(i)){
                sorteio5.add(i);
            }
        }

        for (i = 1; i <= 25; i++){
            if (!sorteio2.contains(i)){
                sorteio6.add(i);
            }
        }

        for (i = 1; i <= 25; i++){
            if (!sorteio3.contains(i)){
                sorteio7.add(i);
            }
        }

        for (i = 1; i <= 25; i++){
            if (!sorteio4.contains(i)){
                sorteio8.add(i);
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

        i = 0;
        while (i < 5) {
            number = generate.nextInt(26);
            while (sorteio6.contains(number) || number == 0) {
                number = generateD.nextInt(26);
            }
            sorteio6.add(number);
            i++;
        }

        i = 0;
        while (i < 5) {
            number = generate.nextInt(26);
            while (sorteio7.contains(number) || number == 0) {
                number = generateD.nextInt(26);
            }
            sorteio7.add(number);
            i++;
        }

        i = 0;
        while (i < 5) {
            number = generate.nextInt(26);
            while (sorteio8.contains(number) || number == 0) {
                number = generateD.nextInt(26);
            }
                sorteio8.add(number);
                i++;
            }
//Colocando sorteio5,6,7 e 8 em ordem
        Collections.sort(sorteio5);
        Collections.sort(sorteio6);
        Collections.sort(sorteio7);
        Collections.sort(sorteio8);

        //imprimindo sorteior e arrumados
        i = 0;
        while (i < 15){
            System.out.print(sorteio1.get(i) + "    ");
            i++;
        }
        System.out.println();

        System.out.println(sorteio2);
        System.out.println(sorteio3);
        System.out.println(sorteio4);
        System.out.println(sorteio5);
        System.out.println(sorteio6);
        System.out.println(sorteio7);
        System.out.println(sorteio8);


    }
    }

//a mesma coisa com for
//for(int i = 0; i < 15; i++){}


