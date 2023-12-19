
package marcosnumerologia;
//@author gustavobergamo

import Views.Inicial;
import RegrasNegocio.TabelaPitagorica;
import java.util.Arrays;

public class MarcosNumerologia {

    public static void main(String[] args) {
        Views.Inicial inicial = new Inicial();
        inicial.setVisible(true);
        TabelaPitagorica tabelapitagorica = new TabelaPitagorica();
        System.out.println("Chamando TabelaPitagorica");
        tabelapitagorica.LetrasEmNumeros("Luiz Gustavo Bergamo");
    }
    
}
