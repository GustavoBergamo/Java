package App;

public class User {
    public static void print() {
        System.out.println("oi");
        System.out.println(Visibilidade.y);
        System.out.println(Visibilidade.o);//não vê porque falta static
        System.out.println(Visibilidade.u);//não vê porque tá private

    }

}
