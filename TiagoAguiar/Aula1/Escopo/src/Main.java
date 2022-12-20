public class Main {
    public static void main(String[] args) {
        int y = 20; //Está DECLARADA no main, funciona em tudo
        System.out.println("Escopo de variáveis");
        if (true) {
            int x = 10; //variável DECLARADA local, fora das chaves não existe
        }else {
            //x = 2; não funciona aqui pq foi DECLARADA em outras chaves {}
            y = 2;//funciona pq foi DECLARADA nas chaves main{}, então pega aqui
        }

    }
}