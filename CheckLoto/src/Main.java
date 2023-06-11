import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer j1[] = {2, 3, 4, 5, 7, 9, 10, 11, 12, 13, 15, 16, 18, 21, 25};
        Integer j2[] = {1, 2, 6, 7, 8, 9, 11, 14, 17, 19, 20, 21, 22, 23, 24};
       // Integer j3[] = {1, 4, 5, 8, 10, 12, 13, 14, 15, 16, 17, 19, 20, 23, 24};
       // Integer j4[] = {1, 2, 3, 4, 6, 7, 10, 13, 14, 16, 17, 18, 19, 23, 24};

     //   System.out.println("Digite os 15 números do bilhete surpresinha");
     //   Scanner b = new Scanner(System.in);

     //   for (int i = 0; i < 15; i++){
     //       j4[i] = b.nextInt();
     //1   }
        //Colocar aqui abaixo os numeros sorteados, devem ser 15 para nao gerar erro.
        Integer sorteio[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        List<Integer> l1 = Arrays.asList(j1);
        List<Integer> l2 = Arrays.asList(j2);
       // List<Integer> l3 = Arrays.asList(j3);
     //   List<Integer> l4 = Arrays.asList(j4);

        System.out.println("BILHETES");
        System.out.println(l1);
        System.out.println(l2);
     //   System.out.println(l3);
     //   System.out.println(l4);
        int p1 = 0, p2 = 0; // p3 = 0, p4 = 0;

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
         //   if (l3.contains(sorteio[i])){
         //       p3++;
         //   }
         //   if (l4.contains(sorteio[i])){
         //       p4++;
         //   }
            System.out.println("jogo 1: " + p1 + " pontos");
            System.out.println("jogo 2: " + p2 + " pontos");
         //   System.out.println("jogo 3: " + p3 + " pontos");
         //   System.out.println("jogo 4: " + p4 + " pontos");
        }
    }
}