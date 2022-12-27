package App;

//public
//é a visibilidade de escolpo do projeto
public class Visibilidade {
    //quando não escreve nada, a visibilidade é padrão
    //public (para todos os packages)
    //private (somente a classe atual tem a referência)
    //protected (tem também esse)
    public static int y = 4;
    private int u = 6;
    int o = 7;
    public static void main(String[] args) {
        int x;
        // variável x está visível só aqui no main
        //variável y aqui está visivel
        sum (3, 5);
    }
    public static void sum (int a, int b){
        //variável x aqui não existe
        int result = 0;
        result = a + b;
        System.out.println(result);
    }

}