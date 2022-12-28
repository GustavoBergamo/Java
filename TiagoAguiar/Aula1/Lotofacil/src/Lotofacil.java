//cria 15 números aleatórios para Lotofácil
//números até 25 e não repetidos

import java.util.Random;

public class Lotofacil {
    public static void main(String[] args) {
        Random generate = new Random();
        Random generateB = new Random();
        Random generateC = new Random();
        Random generateD = new Random();

        int[] a = new int[15];
        int[] b = new int[15];
        int[] c = new int[15];
        int[] d = new int[15];
        int i = 0;
        a[0] = 0;
        b[0] = 0;
        c[0] = 0;
        d[0] = 0;
        int number;

//while (true) resulta num looping infinito;
//for(;;) -> também resulta num looping infinito
        while (i < 15) {
                number = generate.nextInt(26);
                if (number == a[0] || number == a[1] || number == a[2] || number == a[3] || number == a[4] || number == a[5] || number == a[6] || number == a[7] || number == a[8] || number == a[9] || number == a[10] || number == a[11] || number == a[12] || number == a[13] || number == a[14]) {
                    System.out.println(number + "Deu igual");
                    number = generate.nextInt(26);}
                else{
                    a[i] = number;
                    i++;}}

        System.out.println();
        i = 0;

        while (i < 15) {
            number = generate.nextInt(26);
            if (number == b[0] || number == b[1] || number == b[2] || number == b[3] || number == b[4] || number == b[5] || number == b[6] || number == b[7] || number == b[8] || number == b[9] || number == b[10] || number == b[11] || number == b[12] || number == b[13] || number == b[14]) {
                System.out.println(number + "Deu igual");
                number = generateB.nextInt(26);}
            else{
                b[i] = number;
                i++;}}

        System.out.println();
        i = 0;

        while (i < 15) {
            number = generate.nextInt(26);
            if (number == c[0] || number == c[1] || number == c[2] || number == c[3] || number == c[4] || number == c[5] || number == c[6] || number == c[7] || number == c[8] || number == c[9] || number == c[10] || number == c[11] || number == c[12] || number == c[13] || number == c[14]) {
                System.out.println(number + "Deu igual");
                number = generateC.nextInt(26);}
            else{
                c[i] = number;
                i++;}}

        System.out.println();
        i = 0;

        while (i < 15) {
            number = generate.nextInt(26);
            if (number == d[0] || number == d[1] || number == d[2] || number == d[3] || number == d[4] || number == d[5] || number == d[6] || number == d[7] || number == d[8] || number == d[9] || number == d[10] || number == d[11] || number == d[12] || number == d[13] || number == d[14]) {
                System.out.println(number + "Deu igual");
                number = generateD.nextInt(26);}
            else{
                d[i] = number;
                i++;}}
        for (i = 0; i < 15; i++) {
            System.out.print(" - " + a[i]);}
        System.out.println(" -");
        for (i = 0; i < 15; i++) {
            System.out.print(" - " + b[i]);}
        System.out.println(" -");
        for (i = 0; i < 15; i++) {
            System.out.print(" - " + c[i]);}
        System.out.println(" -");
        for (i = 0; i < 15; i++) {
            System.out.print(" - " + d[i]);
        }
        System.out.println(" -");
    }
}

//a mesma coisa com for
//for(int i = 0; i < 15; i++){}
