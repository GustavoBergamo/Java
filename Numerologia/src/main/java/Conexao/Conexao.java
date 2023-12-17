package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    public Connection Conecta() {
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://BancoDeDados/Numerologia.db?user=&password="; //Drive de conexao + local +user e password
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conn;
    }
}
