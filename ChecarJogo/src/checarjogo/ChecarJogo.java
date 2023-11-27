package checarjogo;

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.lang.System;
import java.util.Properties;
/**
 *
 * @author gustavobergamo
 */
public class ChecarJogo {

    /**
     * @param args the command line arguments
     */
    
public static void sugaHTML(String urlSt) throws MalformedURLException, IOException {

        URL url = new URL(urlSt);
          BufferedReader in =
                new BufferedReader(new InputStreamReader(url.openStream()));


        String inputLine;

        while ((inputLine = in.readLine()) != null) {
		
            // Imprime página no console
            System.out.println(inputLine);}
    }
    
    public static void main(String[] args) throws MalformedURLException, IOException {
        sugaHTML("https://servicebus2.caixa.gov.br/portaldeloterias/api/lotofacil/2959");
    }
}
    

