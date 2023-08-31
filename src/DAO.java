import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class DAO {
    public static boolean existeUsuario(Usuario usuario) throws Exception{
        //método pra verificar se existe o usuario no bd
        String sql = "SELECT * FROM tb_jogadores WHERE nome = ? AND senha = ?";
        try(Connection c = ConexaoBD.obterConexao(); PreparedStatement ps = c.prepareStatement(sql)){
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
    public static void ranking(){
        //método para mostrar os 5 jogadores com maior pontuaçao
        String sql = "SELECT nome, pontos FROM tb_jogadores WHERE nome <> 'adm' AND pontos > 0 order by pontos desc limit 5";
        String s = "Nome\t\t\t\tHighscore\n";
        try(Connection c = ConexaoBD.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String nome = rs.getString("nome");
                int pontos = rs.getInt("pontos");
                s += String.format("%s\t\t\t\t%d\n",nome,pontos);
            }
           
            //criar um JTextArea para exibir o rankin pulando linhas
            JTextArea textArea = new JTextArea(s);
            textArea.setEditable(false);
            
            JOptionPane.showMessageDialog(null,textArea);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
