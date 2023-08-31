import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Usuario {
    private int id;
    private String nome;
    private String senha;
    private int casa = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }
    
    public void somaCasa(int casa){
        this.casa += casa;
    }
    
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String toString(){
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", senha=" + senha + '}';
    }
    
    public static void cadastrar(Usuario usuario){
        //método para cadastrar usuário
        String sql = "INSERT INTO tb_jogadores(nome,senha) values (?,?)";
        try(Connection c = ConexaoBD.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! Faça o login agora.");
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar");
        }
    }
    
    public static void atualizarNome(Usuario usuario, String nome){
        //método para atualizar o nome no bd
        String sql = "UPDATE tb_jogadores SET nome = ? WHERE nome = ?";
        try(Connection c = ConexaoBD.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, usuario.getNome());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Nome alterado com sucesso");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void atualizarSenha(Usuario usuario, String senha){
        //método para atualizar a senha no bd
        String sql = "UPDATE tb_jogadores SET senha = ? WHERE nome = ?";
        try(Connection c = ConexaoBD.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, senha);
            ps.setString(2, usuario.getNome());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void guardarPontos(Usuario usuario, int pontos){
        //método para salvar a pontuaçao do usuário após jogar
        String sql_listar = "SELECT pontos FROM tb_jogadores WHERE nome = ?";
        int pontos_atuais = 0;
        try(Connection c = ConexaoBD.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql_listar);
            ps.setString(1,usuario.getNome());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                pontos_atuais = rs.getInt("pontos");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if(pontos > pontos_atuais){
            String sql = "UPDATE tb_jogadores SET pontos = ? WHERE nome = ?";
            try(Connection c = ConexaoBD.obterConexao()){
                PreparedStatement ps = c.prepareStatement(sql);
                ps.setInt(1,pontos);
                ps.setString(2, usuario.getNome());
                ps.execute();
            }
            catch(Exception e){
                e.printStackTrace();
            }  
       }
    }
}
