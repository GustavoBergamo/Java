
package conectasqlite;
import conectasqlite.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConectaSqlite {

    public static void main(String[] args) throws SQLException {
        System.out.println("iniciando");
        Connect.connect(); 
       
    }
    public static void acao() throws SQLException {
         String sql = "select * from employee;";

                Connection c = null;
                Statement stmt = null;
                ResultSet rs = null;
                
                stmt = c.createStatement();
                rs = stmt.executeQuery(sql);
                while (rs.next() ) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    JOptionPane.showMessageDialog(null, name);

                }


    }
}
