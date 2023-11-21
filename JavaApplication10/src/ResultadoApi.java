import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ResultadoApi {
    static char[] oi = new char[74];
    public static void ResultadoApi(String ovo) throws MalformedURLException, UnsupportedEncodingException, IOException {
    String concurso = ovo;
    URL url = null;
    url = new URL("https://loteriascaixa-api.herokuapp.com/api/lotofacil/" + concurso);
    URLConnection connection = url.openConnection();
    InputStream is  = connection.getInputStream();
    BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
    String result = "";
    StringBuilder jsonresult = new StringBuilder();
    int i = 0;
    String[] linhas = new String[5];
    while ((result = br.readLine()) != null) {
        i = i + 1;
        jsonresult.append(result);
        linhas[i] = result;        
    }
    char[] ch = new char[74];
    try{  
        linhas[1].getChars(125 , 199, ch, 0); 
        oi = ch;
    }catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}  
    Integer j1[] = {2, 3, 4, 5, 7, 9, 10, 11, 12, 13, 15, 16, 18, 21, 25};
    Integer j2[] = {1, 2, 6, 7, 8, 9, 11, 14, 17, 19, 20, 21, 22, 23, 24};
    Integer s[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Integer sorteio[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    List<Integer> l1 = Arrays.asList(j1);
    List<Integer> l2 = Arrays.asList(j2);
    int ini = 126;
    int fim = 128;
    int ac = 0;
    for (int x = 0; x < 15; x++) {
        s[x] = Character.getNumericValue(oi[1+ac]);
        s[x+16] = Character.getNumericValue(oi[2+ac]);
        ac = ac + 5;
    }       
     String um = s[0].toString() + s[16].toString();
     String dois = s[1].toString() + s[17].toString();
     String tres = s[2].toString() + s[18].toString();
     String quatro = s[3].toString() + s[19].toString();
     String cinco = s[4].toString() + s[20].toString();
     String seis = s[5].toString() + s[21].toString();
     String sete = s[6].toString() + s[22].toString();
     String oito = s[7].toString() + s[23].toString();
     String nove = s[8].toString() + s[24].toString();
     String dez = s[9].toString() + s[25].toString();
     String onze = s[10].toString() + s[26].toString();
     String doze = s[11].toString() + s[27].toString();
     String treze = s[12].toString() + s[28].toString();
     String quatorze = s[13].toString() + s[29].toString();
     String quinze = s[14].toString() + s[30].toString();
     sorteio[0] = Integer.parseInt(um);
     sorteio[1] = Integer.parseInt(dois);
     sorteio[2] = Integer.parseInt(tres);
     sorteio[3] = Integer.parseInt(quatro);
     sorteio[4] = Integer.parseInt(cinco);
     sorteio[5] = Integer.parseInt(seis);
     sorteio[6] = Integer.parseInt(sete);
     sorteio[7] = Integer.parseInt(oito);
     sorteio[8] = Integer.parseInt(nove);
     sorteio[9] = Integer.parseInt(dez);
     sorteio[10] = Integer.parseInt(onze);
     sorteio[11] = Integer.parseInt(doze);
     sorteio[12] = Integer.parseInt(treze);
     sorteio[13] = Integer.parseInt(quatorze);
     sorteio[14] = Integer.parseInt(quinze);
     int p1 = 0, p2 = 0; 
        for (int u = 0; u < 15; u++){
            if (l1.contains(sorteio[u])){
                p1++;
            }
            if (l2.contains(sorteio[u])){
                p2++;
            }    
        }
        JOptionPane.showMessageDialog(null, "Jogo 1: " + p1 + " pontos e Jogo 2: "+ p2 + " pontos");
    }   
}

