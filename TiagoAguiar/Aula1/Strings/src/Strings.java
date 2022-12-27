//Manipulando Strings
public class Strings {
    public static void main(String[] args) {

        String x = "     Olá Mundo! Esse é um novo Mundo     ";
        //Ver quantidade de caracteres
        System.out.println(x.length());
        //Concatenar
        System.out.println(x + " Concatenada");
        //Se frase contem palavra ou caracter
        System.out.println(x.contains("Mundo"));
        //Onde começa a palavra
        System.out.println(x.indexOf("Mundo"));
        //Onde aconteceu a última
        System.out.println(x.lastIndexOf("Mundo"));
        //Manipulando Caixa Alta e baixa
        System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());
        System.out.println(x.toUpperCase());
        //Removendo espaços desnecessários
        System.out.println(x.trim());
        //Encontrar a partir da posição do caracter 9 por exemplo.
        System.out.println(x.substring(9));
        //Verificar se é igual ==
        System.out.println(x.equals("Olá"));
    }
}