package conexaodb;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class ConexaoDerby {
    private final String url;   //url de aonde o banco de dados estar
    private final String usuario; //nome do usuario que tem acesso ao banco
    private final String senha; //senha do usuario para acessar o banco
    private final String driver; // driver de conexao com o banco
    
    /**
     * Iniciar as variaveis url, usuario, senha necessario para abrir uma conexao com o banco
     */
    public ConexaoDerby(){
        this.url = "jdbc:derby:bancodedados/dbMercadinhoOda";
        this.usuario = "dba";
        this.senha = "12345";
        this.driver = "org.apache.derby.jdbc.EmbeddedDriver";
    }
    
    public Connection openConexao(){
        System.out.println("INICIANDO CONEXAO COM O BANCO DE DADOS...");
        try {
            Class.forName(this.driver);
            JOptionPane.showMessageDialog(null, "CONEXAO BEM SUCEDIDA");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "CONEXAO MAL SUCEDIDA\n" + ex.getMessage());
        }
        return null;
    }
}
