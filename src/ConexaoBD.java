import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "db_pi";
    private static String usuario = "root";
    private static String senha = "123456";
    
    public static Connection obterConexao() throws Exception{
        String url = String.format(
                "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",
                host, 
                porta,
                db
        );
        return DriverManager.getConnection(url, usuario, senha);
    }
}
