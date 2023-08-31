import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Pergunta {
    private int id;
    private String pergunta;
    private String alternativa_a;
    private String alternativa_b;
    private String alternativa_c;
    private String alternativa_d;
    private String resposta;
    private String dificuldade;

    public Pergunta(String pergunta, String alternativa_a, String alternativa_b, String alternativa_c, String alternativa_d, String resposta, String dificuldade) {
        this.pergunta = pergunta;
        this.alternativa_a = alternativa_a;
        this.alternativa_b = alternativa_b;
        this.alternativa_c = alternativa_c;
        this.alternativa_d = alternativa_d;
        this.resposta = resposta;
        this.dificuldade = dificuldade;
    }

    public Pergunta(int id, String pergunta, String alternativa_a, String alternativa_b, String alternativa_c, String alternativa_d, String resposta, String dificuldade) {
        this.id = id;
        this.pergunta = pergunta;
        this.alternativa_a = alternativa_a;
        this.alternativa_b = alternativa_b;
        this.alternativa_c = alternativa_c;
        this.alternativa_d = alternativa_d;
        this.resposta = resposta;
        this.dificuldade = dificuldade;
    }
    public Pergunta(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getAlternativa_a() {
        return alternativa_a;
    }

    public void setAlternativa_a(String alternativa_a) {
        this.alternativa_a = alternativa_a;
    }

    public String getAlternativa_b() {
        return alternativa_b;
    }

    public void setAlternativa_b(String alternativa_b) {
        this.alternativa_b = alternativa_b;
    }

    public String getAlternativa_c() {
        return alternativa_c;
    }

    public void setAlternativa_c(String alternativa_c) {
        this.alternativa_c = alternativa_c;
    }

    public String getAlternativa_d() {
        return alternativa_d;
    }

    public void setAlternativa_d(String alternativa_d) {
        this.alternativa_d = alternativa_d;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }


    
    public void criar(Pergunta pergunta){
        //método para inserir uma pergunta no bd
        String sql = "INSERT INTO tb_perguntas(pergunta, alternativa_a, alternativa_b, alternativa_c, alternativa_d, resposta, dificuldade) values (?,?,?,?,?,?,?)";
        try(Connection c = ConexaoBD.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1,pergunta.getPergunta());
            ps.setString(2, pergunta.getAlternativa_a());
            ps.setString(3, pergunta.getAlternativa_b());
            ps.setString(4, pergunta.getAlternativa_c());
            ps.setString(5, pergunta.getAlternativa_d());
            ps.setString(6, pergunta.getResposta());
            ps.setString(7, pergunta.getDificuldade());
            ps.execute();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void atualizar(Pergunta pergunta){
        //método para atualizar uma pergunta no bd
        String sql = "UPDATE tb_perguntas set pergunta = ?, alternativa_a = ?,alternativa_b = ?,alternativa_c = ?,alternativa_d = ?, resposta = ?, dificuldade = ? where num_pergunta = ?";
        try(Connection c = ConexaoBD.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1,pergunta.getPergunta());
            ps.setString(2, pergunta.getAlternativa_a());
            ps.setString(3, pergunta.getAlternativa_b());
            ps.setString(4, pergunta.getAlternativa_c());
            ps.setString(5, pergunta.getAlternativa_d());
            ps.setString(6, pergunta.getResposta());
            ps.setString(7, pergunta.getDificuldade());
            ps.setInt(8, pergunta.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null,"Pergunta atualizada!");
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar");
        }
    }
    public void deletar(Pergunta pergunta){
        //método para deletar uma pergunta do bd
        String sql = "DELETE FROM tb_perguntas WHERE num_pergunta = ?";
        try(Connection c = ConexaoBD.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, pergunta.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Pergunta deletada!");
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível deletar");
        }
    }
    public void listar(Pergunta pergunta){
        //método para mostrar uma pergunta do bd
        String sql = "SELECT * FROM tb_perguntas WHERE num_pergunta = ?";
        String s = "";
        try(Connection c = ConexaoBD.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1,pergunta.getId());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int num_pergunta = rs.getInt("num_pergunta");
                String texto_pergunta = rs.getString("pergunta");
                String alt_a = rs.getString("alternativa_a");
                String alt_b = rs.getString("alternativa_b");
                String alt_c = rs.getString("alternativa_c");
                String alt_d = rs.getString("alternativa_d");
                String resposta = rs.getString("resposta");
                String dificuldade = rs.getString("dificuldade");
                s += String.format("Codigo: %d \nPergunta: %s \nAlternativa a: %s \nAlternativa b: %s \nAlternativa c: %s \nAlternativa d: %s \nResposta: %s \nDificuldade: %s",num_pergunta,texto_pergunta, alt_a, alt_b, alt_c, alt_d,resposta, dificuldade);
                
            }
            JOptionPane.showMessageDialog(null,s);
        }
        catch(Exception e){
            s += "Fala ao buscar";
            e.printStackTrace();
        }
    }
    
    public static int perguntaJogo(ArrayList<Integer> ja_foram){
        //metodo para mostrar pergunta aleatoria no jogo
        //recebe a lista de perguntas que já foram
        String sql = "SELECT num_pergunta,pergunta, alternativa_a, alternativa_b, alternativa_c, alternativa_d,resposta, dificuldade from tb_perguntas WHERE num_pergunta = ?";
        String s = "";
        
        //criar as alternativas do comboBox e o comboBox
        String[] alternativas = {"a","b","c","d"};
        JComboBox<String> comboBox = new JComboBox<>(alternativas);
        
        //criar um painel pra exibir a combo box com o texto da pergunta
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        // definir um numero aleatorio pra buscar a pergunta, com loop para evitar repetiçao de pergunta em cada execuçao do jogo
        int bonus = 0;
        int id_escolhido = ThreadLocalRandom.current().nextInt(1,31);   //definir um numero aleatorio para o ID da pergunta escolhida
        while(ja_foram.contains(id_escolhido)){         //verificar se a pergunta ja havia sido escolhida e repetir até que seja uma nova
            id_escolhido = ThreadLocalRandom.current().nextInt(1,31);
        }
        ja_foram.add(id_escolhido); //adicionar ao array de IDs escolhidos o ID atual
        
        //efetuar a conexao com bd
        try(Connection c = ConexaoBD.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1,id_escolhido);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("num_pergunta");
                String textopergunta = rs.getString("pergunta");
                String alternativa_a = rs.getString("alternativa_a");
                String alternativa_b = rs.getString("alternativa_b");
                String alternativa_c = rs.getString("alternativa_c");
                String alternativa_d = rs.getString("alternativa_d");
                String certa = rs.getString("resposta");
                String dificuldade = rs.getString("dificuldade");
                
                s += String.format("Dificuldade: %s\n\n%s\n\na)%s\nb)%s\nc)%s\nd)%s\n\n",dificuldade, textopergunta, alternativa_a, alternativa_b, alternativa_c, alternativa_d);
                
                // criar JTextArea para exibir o texto da pergunta
                JTextArea textArea = new JTextArea(s + "Escolha uma alternativa:");
                textArea.setEditable(false);

                // adicionar no panel o texto da pergunta e a comboBox das alternativas
                panel.add(textArea);
                panel.add(Box.createVerticalStrut(10)); // adiciona espaço entre label e comboBox
                panel.add(comboBox);
                
                //definir a variavel de resposta do usuario
                int resultCombo = JOptionPane.showOptionDialog(null, panel, "Pergunta", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
                String respostaUsuario = "";
                
                if(resultCombo == JOptionPane.OK_OPTION){
                    respostaUsuario = (String) comboBox.getSelectedItem();
                }
                
                if(respostaUsuario.equals(certa)){
                    switch(dificuldade){    //escolher a quantidade de casas em caso de acerto de acordo com a dificuldade
                        case "facil":
                            bonus = 1;
                            break;
                        case "media":
                            bonus = 2;
                            break;
                        case "dificil":
                            bonus = 3;
                            break;
                        default:
                            bonus = 0;
                            break;
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Você errou a pergunta, a resposta era a alternativa " + certa);
                    bonus = 0;
                }
            }
        }
        catch(Exception e){
                e.printStackTrace();
                bonus = 0;
        }
        return bonus;
    }
}
