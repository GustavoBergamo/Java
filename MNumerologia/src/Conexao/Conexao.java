package Conexao;


import java.sql.*;
import javax.swing.JOptionPane;
import org.sqlite.JDBC;
import org.sqlite.SQLiteConfig;


public class Conexao {
    public Connection Conecta() {
        
        Connection conn = null;
        
        try {

            String url = "jdbc:sqlite:/Numerologia.db"; //Drive de conexao + local +user e password
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Atenção: " + e.getMessage());
        }
        return conn;
    }
            Connection conn;

    public ResultSet visualiza(){
        conn = new Conexao().Conecta();
        try {
            String sql = "select * from Numeros";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            JOptionPane.showMessageDialog(null, rs);
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
