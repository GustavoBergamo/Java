package principal;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inicio {


    public static void main(String[] args) {
    
       Integer j1[] = {2, 3, 4, 5, 7, 9, 10, 11, 12, 13, 15, 16, 18, 21, 25};
       Integer j2[] = {1, 2, 6, 7, 8, 9, 11, 14, 17, 19, 20, 21, 22, 23, 24};
       Integer sorteio[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

       List<Integer> l1 = Arrays.asList(j1);
       List<Integer> l2 = Arrays.asList(j2);
       System.out.println("BILHETES");
       System.out.println(l1);
       System.out.println(l2);
       int p1 = 0, p2 = 0;

        System.out.println("Digite os números sorteados");
        Scanner a = new Scanner(System.in);

        for (int i = 0; i < 15; i++){

            sorteio[i] = a.nextInt();
            if (l1.contains(sorteio[i])){
                p1++;
            }
            if (l2.contains(sorteio[i])){
                p2++;
            }

            System.out.println("jogo 1: " + p1 + " pontos");
            System.out.println("jogo 2: " + p2 + " pontos");

        }
    }
}
    
    
    

