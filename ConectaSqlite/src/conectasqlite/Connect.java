package conectasqlite;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import conectasqlite.ConectaSqlite;

public class Connect {
    public static void connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:c:/Users/gustavobergamo/Downloads/Demo.db?foreign_keys=true";
            conn = DriverManager.getConnection(url);
            JOptionPane.showMessageDialog(null, "Conectado");
            conectasqlite.ConectaSqlite.acao();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e.getMessage());
 /*  } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                System.out.println(ex.getMessage());
            }
      */  }
    }
}
