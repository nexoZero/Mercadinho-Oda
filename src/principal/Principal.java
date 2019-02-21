package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = null;
        try {
            //System.out.println("Ola mundo, eu nasce para consquistar-lo");
            System.out.println("CONECTANDO COM BANCO...");
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection("jdbc:derby:bancodedados/dbMercadinhoOda", "dba", "12345");
            JOptionPane.showMessageDialog(null, "CONEXAO BEM SUCEDIDA");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "CONEXAO MAL SUCEDIDA\n" + ex.getMessage());
        }
    }
    
}
