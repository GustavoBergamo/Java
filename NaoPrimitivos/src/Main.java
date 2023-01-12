public class Main {
    public static void main(String[] args){
//Tipos não primitivos, consomem menos memória (variáveis)
        Integer y = 4; //É inteiro também, mas não primitivo
        //Integer começa com letra maiúscula para dizer que é um objeto "vivo"(classe, instância de objeto)
        int x = 2;
        System.out.println(x);
        System.out.println(y);
// Se colocar y. aparece as opções para usar o y. Com x não dá pq é primitivo
        y.byteValue();
        y.doubleValue();

    }
}