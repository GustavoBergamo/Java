package RegrasNegocio;

import java.util.Arrays;

public class TabelaPitagorica {
        static int Quantidade;
        static int[] Numeros;
        static char[] Letras;
        static int Soma = 0;

    public static int LetrasEmNumeros (String nome) {
        
        Quantidade = nome.length();
        Numeros = new int[Quantidade];
        Letras = new char[Quantidade];
        //Colocando letras do nome dentro de um Array Letras
        for (int i = 0; i < Quantidade; i++) {
        Letras[i] = nome.charAt(i);
        }
        
        //Colocando valor correspondente de cada letra em um Array Numeros
        //Ao mesmo tempo já somando os números na variável Soma
        for (int i = 0; i < Quantidade; i++) {
            if (Character.toString(Letras[i]).equalsIgnoreCase("a") 
                    || Character.toString(Letras[i]).equalsIgnoreCase("á")
                    || Character.toString(Letras[i]).equalsIgnoreCase("à")
                    || Character.toString(Letras[i]).equalsIgnoreCase("ã")
                    || Character.toString(Letras[i]).equalsIgnoreCase("ä")
                    || Character.toString(Letras[i]).equalsIgnoreCase("â")
                    || Character.toString(Letras[i]).equalsIgnoreCase("j") 
                    || Character.toString(Letras[i]).equalsIgnoreCase("s")) {
                Numeros[i] = 1;
                Soma = Soma + 1;
            } 
            if (Character.toString(Letras[i]).equalsIgnoreCase("b") 
                    || Character.toString(Letras[i]).equalsIgnoreCase("k") 
                    || Character.toString(Letras[i]).equalsIgnoreCase("t")) {
                Numeros[i] = 2;
                Soma = Soma + 2;
            }
            if (Character.toString(Letras[i]).equalsIgnoreCase("c") 
                    || Character.toString(Letras[i]).equalsIgnoreCase("l")
                    || Character.toString(Letras[i]).equalsIgnoreCase("ú")
                    || Character.toString(Letras[i]).equalsIgnoreCase("ù")
                    || Character.toString(Letras[i]).equalsIgnoreCase("ü")
                    || Character.toString(Letras[i]).equalsIgnoreCase("û")
                    || Character.toString(Letras[i]).equalsIgnoreCase("u")) {
                Numeros[i] = 3;
                Soma = Soma + 3;
            }
            if (Character.toString(Letras[i]).equalsIgnoreCase("d") 
                    || Character.toString(Letras[i]).equalsIgnoreCase("m") 
                    || Character.toString(Letras[i]).equalsIgnoreCase("v")) {
                Numeros[i] = 4;
                Soma = Soma + 4;
            }
            if (Character.toString(Letras[i]).equalsIgnoreCase("e") 
                    || Character.toString(Letras[i]).equalsIgnoreCase("é")
                    || Character.toString(Letras[i]).equalsIgnoreCase("è")
                    || Character.toString(Letras[i]).equalsIgnoreCase("ê")
                    || Character.toString(Letras[i]).equalsIgnoreCase("ë")
                    || Character.toString(Letras[i]).equalsIgnoreCase("n") 
                    || Character.toString(Letras[i]).equalsIgnoreCase("w")) {
                Numeros[i] = 5;
                Soma = Soma + 5;
            }
            if (Character.toString(Letras[i]).equalsIgnoreCase("f") 
                    || Character.toString(Letras[i]).equalsIgnoreCase("o")
                    || Character.toString(Letras[i]).equalsIgnoreCase("ô")
                    || Character.toString(Letras[i]).equalsIgnoreCase("ó")
                    || Character.toString(Letras[i]).equalsIgnoreCase("ò")
                    || Character.toString(Letras[i]).equalsIgnoreCase("õ")
                    || Character.toString(Letras[i]).equalsIgnoreCase("ö")
                    || Character.toString(Letras[i]).equalsIgnoreCase("x")) {
                Numeros[i] = 6;
                Soma = Soma + 6;
            }
            if (Character.toString(Letras[i]).equalsIgnoreCase("g") 
                    || Character.toString(Letras[i]).equalsIgnoreCase("p") 
                    || Character.toString(Letras[i]).equalsIgnoreCase("y")) {
                Numeros[i] = 7;
                Soma = Soma + 7;
            }
            if (Character.toString(Letras[i]).equalsIgnoreCase("h") 
                    || Character.toString(Letras[i]).equalsIgnoreCase("q") 
                    || Character.toString(Letras[i]).equalsIgnoreCase("z")) {
                Numeros[i] = 8;
                Soma = Soma + 8;
            }
            if (Character.toString(Letras[i]).equalsIgnoreCase("i") 
                    || Character.toString(Letras[i]).equalsIgnoreCase("í")
                    || Character.toString(Letras[i]).equalsIgnoreCase("ì")
                    || Character.toString(Letras[i]).equalsIgnoreCase("ï")
                    || Character.toString(Letras[i]).equalsIgnoreCase("î")
                    || Character.toString(Letras[i]).equalsIgnoreCase("r")) {
                Numeros[i] = 9;
                Soma = Soma + 9;
            }
        }
        //Redução dos números de Soma para apenas um dígito
        System.out.println(Arrays.toString(Letras));
        System.out.print(Arrays.toString(Numeros));
        System.out.print(" Soma = "+ Soma);
        

        return Soma;
    }
    
    //método para enviar letras do nome
    public static String getLetras(){
        String a = Arrays.toString(Letras);
        return a;
    }
    
    //método para enviar números do nome
    public static String getNumeros(){
        String a = Arrays.toString(Numeros);
        return a;
    }

    
}
