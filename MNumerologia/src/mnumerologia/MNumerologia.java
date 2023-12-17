package mnumerologia;


import Conexao.Conexao;
import Views.TelaInicial;

/**
 *
 * @author gustavobergamo
 */
public class MNumerologia {

    public static void main(String[] args) {
        Views.TelaInicial telainicial = new TelaInicial();
        telainicial.setVisible(true);
        Conexao conecta = new Conexao();
        conecta.Conecta();
        conecta.visualiza();
    }
}
