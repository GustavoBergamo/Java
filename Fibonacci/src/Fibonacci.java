public class Fibonacci {
    public Fibonacci(int seq) {
        int a = 0;
        int b = 1;
        int c = 0;
        while(c - 1 < seq){
            System.out.print(c + " - ");
            c = b + a;
            a = b;
            b = c;

        }


    }
}
