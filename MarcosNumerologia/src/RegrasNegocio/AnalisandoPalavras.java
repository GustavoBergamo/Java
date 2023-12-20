package RegrasNegocio;

public class AnalisandoPalavras {
    static int numwords;
  //  static int[] Numbers;
  //  static int[] Words;
    static String[] PalavrasSeparadas;
    static int Soma = 0;
    
    public static void AnalisandoPalavras (String nome) {
        String[] words = nome.split(" ");
        numwords = words.length;
        System.out.println(numwords);
  //      Numbers = new int[QtdPalavras];
  //      Words = new int[QtdPalavras];
        
         //Colocando letras do nome dentro de um Array Letras
        for (int i = 0; i < numwords; i++) {
            System.out.println(words[i]);
        }
    }
}
