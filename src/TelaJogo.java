import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class TelaJogo extends javax.swing.JFrame {
    private Usuario usuario;
    ArrayList<Integer> ja_foram = new ArrayList<>();    //array com o id das perguntas que ja foram
    //se excluir pergunta no bd adicionar o id da pergunta excluida nessa array
    int tempo = 300;    //tempo da partida
    boolean contando = false;
    int quant_perguntas;
    int acertos;
    
    public void manterUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    
    /**
     * Creates new form TelaJogo
     */
    public TelaJogo() {
        initComponents();
        contando = true;
        
        // criar uma thread separada para o cronometro continuar rodando sem interrupçõs
        Thread cronometroThread = new Thread(()->{
           try{
               while(contando && tempo > 0){
                   tempo = Cronometro.contagem(tempo);
                   //trocar o texto do label Timer
                   timerLabel.setText(Integer.toString(tempo) + "s");
                   
                   //verificar se acabou o tempo
                   if(tempo <= 0){
                       encerrarJogo();
                   }
               }
           } 
           catch(Exception e){
               e.printStackTrace();
           }
        });
        cronometroThread.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        casa1Panel5 = new javax.swing.JPanel();
        casa1Panel4 = new javax.swing.JPanel();
        casa1Panel6 = new javax.swing.JPanel();
        casa1Panel7 = new javax.swing.JPanel();
        casa1Panel21 = new javax.swing.JPanel();
        casa1Panel20 = new javax.swing.JPanel();
        fundoPanel = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        peaoLabel = new javax.swing.JLabel();
        Panel9 = new javax.swing.JPanel();
        Panel11 = new javax.swing.JPanel();
        Panel10 = new javax.swing.JPanel();
        Panel12 = new javax.swing.JPanel();
        Panel13 = new javax.swing.JPanel();
        Panel14 = new javax.swing.JPanel();
        Panel16 = new javax.swing.JPanel();
        Panel15 = new javax.swing.JPanel();
        Panel18 = new javax.swing.JPanel();
        Panel17 = new javax.swing.JPanel();
        Panel19 = new javax.swing.JPanel();
        Panel20 = new javax.swing.JPanel();
        Panel21 = new javax.swing.JPanel();
        Panel22 = new javax.swing.JPanel();
        Panel23 = new javax.swing.JPanel();
        Panel25 = new javax.swing.JPanel();
        Panel24 = new javax.swing.JPanel();
        Panel27 = new javax.swing.JPanel();
        Panel28 = new javax.swing.JPanel();
        Panel26 = new javax.swing.JPanel();
        Panel29 = new javax.swing.JPanel();
        Panel30 = new javax.swing.JPanel();
        Panel31 = new javax.swing.JPanel();
        Panel32 = new javax.swing.JPanel();
        Panel33 = new javax.swing.JPanel();
        Panel34 = new javax.swing.JPanel();
        Panel37 = new javax.swing.JPanel();
        Panel36 = new javax.swing.JPanel();
        Panel35 = new javax.swing.JPanel();
        Panel38 = new javax.swing.JPanel();
        jogarRodadaButton = new javax.swing.JButton();
        sairJogoButton = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        Panel3 = new javax.swing.JPanel();
        Panel4 = new javax.swing.JPanel();
        Panel5 = new javax.swing.JPanel();
        Panel6 = new javax.swing.JPanel();
        Panel7 = new javax.swing.JPanel();
        Panel8 = new javax.swing.JPanel();
        timerLabel = new javax.swing.JLabel();
        reiniciarButton = new javax.swing.JButton();
        opcoesJogoButton = new javax.swing.JButton();

        casa1Panel5.setBackground(new java.awt.Color(221, 221, 221));
        casa1Panel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout casa1Panel5Layout = new javax.swing.GroupLayout(casa1Panel5);
        casa1Panel5.setLayout(casa1Panel5Layout);
        casa1Panel5Layout.setHorizontalGroup(
            casa1Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        casa1Panel5Layout.setVerticalGroup(
            casa1Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        casa1Panel4.setBackground(new java.awt.Color(221, 221, 221));
        casa1Panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout casa1Panel4Layout = new javax.swing.GroupLayout(casa1Panel4);
        casa1Panel4.setLayout(casa1Panel4Layout);
        casa1Panel4Layout.setHorizontalGroup(
            casa1Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        casa1Panel4Layout.setVerticalGroup(
            casa1Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        casa1Panel6.setBackground(new java.awt.Color(221, 221, 221));
        casa1Panel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout casa1Panel6Layout = new javax.swing.GroupLayout(casa1Panel6);
        casa1Panel6.setLayout(casa1Panel6Layout);
        casa1Panel6Layout.setHorizontalGroup(
            casa1Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        casa1Panel6Layout.setVerticalGroup(
            casa1Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        casa1Panel7.setBackground(new java.awt.Color(221, 221, 221));
        casa1Panel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout casa1Panel7Layout = new javax.swing.GroupLayout(casa1Panel7);
        casa1Panel7.setLayout(casa1Panel7Layout);
        casa1Panel7Layout.setHorizontalGroup(
            casa1Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        casa1Panel7Layout.setVerticalGroup(
            casa1Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        casa1Panel21.setBackground(new java.awt.Color(221, 221, 221));
        casa1Panel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout casa1Panel21Layout = new javax.swing.GroupLayout(casa1Panel21);
        casa1Panel21.setLayout(casa1Panel21Layout);
        casa1Panel21Layout.setHorizontalGroup(
            casa1Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        casa1Panel21Layout.setVerticalGroup(
            casa1Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        casa1Panel20.setBackground(new java.awt.Color(221, 221, 221));
        casa1Panel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout casa1Panel20Layout = new javax.swing.GroupLayout(casa1Panel20);
        casa1Panel20.setLayout(casa1Panel20Layout);
        casa1Panel20Layout.setHorizontalGroup(
            casa1Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        casa1Panel20Layout.setVerticalGroup(
            casa1Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Code Quest: o Desafio das Linguagens");

        fundoPanel.setBackground(new java.awt.Color(204, 255, 255));
        fundoPanel.setForeground(new java.awt.Color(0, 0, 0));

        Panel1.setBackground(new java.awt.Color(174, 221, 43));
        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                Panel1ComponentAdded(evt);
            }
        });

        peaoLabel.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        peaoLabel.setForeground(new java.awt.Color(0, 0, 0));
        peaoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OtherSources/moedamaua.png"))); // NOI18N
        peaoLabel.setOpaque(true);
        peaoLabel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                peaoLabelPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(peaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(peaoLabel)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Panel9.setBackground(new java.awt.Color(0, 157, 221));
        Panel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel9Layout = new javax.swing.GroupLayout(Panel9);
        Panel9.setLayout(Panel9Layout);
        Panel9Layout.setHorizontalGroup(
            Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel9Layout.setVerticalGroup(
            Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel11.setBackground(new java.awt.Color(0, 157, 221));
        Panel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel11Layout = new javax.swing.GroupLayout(Panel11);
        Panel11.setLayout(Panel11Layout);
        Panel11Layout.setHorizontalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel11Layout.setVerticalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel10.setBackground(new java.awt.Color(0, 157, 221));
        Panel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel10Layout = new javax.swing.GroupLayout(Panel10);
        Panel10.setLayout(Panel10Layout);
        Panel10Layout.setHorizontalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel10Layout.setVerticalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel12.setBackground(new java.awt.Color(0, 157, 221));
        Panel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel12Layout = new javax.swing.GroupLayout(Panel12);
        Panel12.setLayout(Panel12Layout);
        Panel12Layout.setHorizontalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel12Layout.setVerticalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel13.setBackground(new java.awt.Color(0, 157, 221));
        Panel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel13Layout = new javax.swing.GroupLayout(Panel13);
        Panel13.setLayout(Panel13Layout);
        Panel13Layout.setHorizontalGroup(
            Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel13Layout.setVerticalGroup(
            Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel14.setBackground(new java.awt.Color(0, 157, 221));
        Panel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel14Layout = new javax.swing.GroupLayout(Panel14);
        Panel14.setLayout(Panel14Layout);
        Panel14Layout.setHorizontalGroup(
            Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel14Layout.setVerticalGroup(
            Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel16.setBackground(new java.awt.Color(0, 157, 221));
        Panel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel16Layout = new javax.swing.GroupLayout(Panel16);
        Panel16.setLayout(Panel16Layout);
        Panel16Layout.setHorizontalGroup(
            Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel16Layout.setVerticalGroup(
            Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel15.setBackground(new java.awt.Color(0, 157, 221));
        Panel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel15Layout = new javax.swing.GroupLayout(Panel15);
        Panel15.setLayout(Panel15Layout);
        Panel15Layout.setHorizontalGroup(
            Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel15Layout.setVerticalGroup(
            Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel18.setBackground(new java.awt.Color(0, 157, 221));
        Panel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel18Layout = new javax.swing.GroupLayout(Panel18);
        Panel18.setLayout(Panel18Layout);
        Panel18Layout.setHorizontalGroup(
            Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel18Layout.setVerticalGroup(
            Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel17.setBackground(new java.awt.Color(0, 157, 221));
        Panel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel17Layout = new javax.swing.GroupLayout(Panel17);
        Panel17.setLayout(Panel17Layout);
        Panel17Layout.setHorizontalGroup(
            Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel17Layout.setVerticalGroup(
            Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel19.setBackground(new java.awt.Color(0, 157, 221));
        Panel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel19Layout = new javax.swing.GroupLayout(Panel19);
        Panel19.setLayout(Panel19Layout);
        Panel19Layout.setHorizontalGroup(
            Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel19Layout.setVerticalGroup(
            Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel20.setBackground(new java.awt.Color(0, 157, 221));
        Panel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel20Layout = new javax.swing.GroupLayout(Panel20);
        Panel20.setLayout(Panel20Layout);
        Panel20Layout.setHorizontalGroup(
            Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel20Layout.setVerticalGroup(
            Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel21.setBackground(new java.awt.Color(0, 157, 221));
        Panel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel21Layout = new javax.swing.GroupLayout(Panel21);
        Panel21.setLayout(Panel21Layout);
        Panel21Layout.setHorizontalGroup(
            Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel21Layout.setVerticalGroup(
            Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel22.setBackground(new java.awt.Color(0, 157, 221));
        Panel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel22Layout = new javax.swing.GroupLayout(Panel22);
        Panel22.setLayout(Panel22Layout);
        Panel22Layout.setHorizontalGroup(
            Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel22Layout.setVerticalGroup(
            Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel23.setBackground(new java.awt.Color(0, 157, 221));
        Panel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel23Layout = new javax.swing.GroupLayout(Panel23);
        Panel23.setLayout(Panel23Layout);
        Panel23Layout.setHorizontalGroup(
            Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel23Layout.setVerticalGroup(
            Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel25.setBackground(new java.awt.Color(0, 157, 221));
        Panel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel25Layout = new javax.swing.GroupLayout(Panel25);
        Panel25.setLayout(Panel25Layout);
        Panel25Layout.setHorizontalGroup(
            Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel25Layout.setVerticalGroup(
            Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel24.setBackground(new java.awt.Color(0, 157, 221));
        Panel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel24Layout = new javax.swing.GroupLayout(Panel24);
        Panel24.setLayout(Panel24Layout);
        Panel24Layout.setHorizontalGroup(
            Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel24Layout.setVerticalGroup(
            Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel27.setBackground(new java.awt.Color(0, 157, 221));
        Panel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel27Layout = new javax.swing.GroupLayout(Panel27);
        Panel27.setLayout(Panel27Layout);
        Panel27Layout.setHorizontalGroup(
            Panel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel27Layout.setVerticalGroup(
            Panel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel28.setBackground(new java.awt.Color(0, 157, 221));
        Panel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel28Layout = new javax.swing.GroupLayout(Panel28);
        Panel28.setLayout(Panel28Layout);
        Panel28Layout.setHorizontalGroup(
            Panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel28Layout.setVerticalGroup(
            Panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel26.setBackground(new java.awt.Color(0, 157, 221));
        Panel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel26Layout = new javax.swing.GroupLayout(Panel26);
        Panel26.setLayout(Panel26Layout);
        Panel26Layout.setHorizontalGroup(
            Panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel26Layout.setVerticalGroup(
            Panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel29.setBackground(new java.awt.Color(0, 157, 221));
        Panel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel29Layout = new javax.swing.GroupLayout(Panel29);
        Panel29.setLayout(Panel29Layout);
        Panel29Layout.setHorizontalGroup(
            Panel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel29Layout.setVerticalGroup(
            Panel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel30.setBackground(new java.awt.Color(0, 157, 221));
        Panel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel30Layout = new javax.swing.GroupLayout(Panel30);
        Panel30.setLayout(Panel30Layout);
        Panel30Layout.setHorizontalGroup(
            Panel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel30Layout.setVerticalGroup(
            Panel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel31.setBackground(new java.awt.Color(0, 157, 221));
        Panel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel31Layout = new javax.swing.GroupLayout(Panel31);
        Panel31.setLayout(Panel31Layout);
        Panel31Layout.setHorizontalGroup(
            Panel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel31Layout.setVerticalGroup(
            Panel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel32.setBackground(new java.awt.Color(0, 157, 221));
        Panel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel32Layout = new javax.swing.GroupLayout(Panel32);
        Panel32.setLayout(Panel32Layout);
        Panel32Layout.setHorizontalGroup(
            Panel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel32Layout.setVerticalGroup(
            Panel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel33.setBackground(new java.awt.Color(0, 157, 221));
        Panel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel33Layout = new javax.swing.GroupLayout(Panel33);
        Panel33.setLayout(Panel33Layout);
        Panel33Layout.setHorizontalGroup(
            Panel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel33Layout.setVerticalGroup(
            Panel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel34.setBackground(new java.awt.Color(0, 157, 221));
        Panel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel34Layout = new javax.swing.GroupLayout(Panel34);
        Panel34.setLayout(Panel34Layout);
        Panel34Layout.setHorizontalGroup(
            Panel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel34Layout.setVerticalGroup(
            Panel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel37.setBackground(new java.awt.Color(0, 157, 221));
        Panel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel37Layout = new javax.swing.GroupLayout(Panel37);
        Panel37.setLayout(Panel37Layout);
        Panel37Layout.setHorizontalGroup(
            Panel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel37Layout.setVerticalGroup(
            Panel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel36.setBackground(new java.awt.Color(0, 157, 221));
        Panel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel36Layout = new javax.swing.GroupLayout(Panel36);
        Panel36.setLayout(Panel36Layout);
        Panel36Layout.setHorizontalGroup(
            Panel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel36Layout.setVerticalGroup(
            Panel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel35.setBackground(new java.awt.Color(0, 157, 221));
        Panel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel35Layout = new javax.swing.GroupLayout(Panel35);
        Panel35.setLayout(Panel35Layout);
        Panel35Layout.setHorizontalGroup(
            Panel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel35Layout.setVerticalGroup(
            Panel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel38.setBackground(new java.awt.Color(255, 127, 80));
        Panel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel38Layout = new javax.swing.GroupLayout(Panel38);
        Panel38.setLayout(Panel38Layout);
        Panel38Layout.setHorizontalGroup(
            Panel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel38Layout.setVerticalGroup(
            Panel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jogarRodadaButton.setBackground(new java.awt.Color(51, 204, 255));
        jogarRodadaButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jogarRodadaButton.setForeground(new java.awt.Color(0, 0, 0));
        jogarRodadaButton.setText("Jogar");
        jogarRodadaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarRodadaButtonActionPerformed(evt);
            }
        });

        sairJogoButton.setBackground(new java.awt.Color(51, 204, 255));
        sairJogoButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sairJogoButton.setForeground(new java.awt.Color(0, 0, 0));
        sairJogoButton.setText("Sair");
        sairJogoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairJogoButtonActionPerformed(evt);
            }
        });

        Panel2.setBackground(new java.awt.Color(0, 157, 221));
        Panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel3.setBackground(new java.awt.Color(0, 157, 221));
        Panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel4.setBackground(new java.awt.Color(0, 157, 221));
        Panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel5.setBackground(new java.awt.Color(0, 157, 221));
        Panel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel6.setBackground(new java.awt.Color(0, 157, 221));
        Panel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel6Layout = new javax.swing.GroupLayout(Panel6);
        Panel6.setLayout(Panel6Layout);
        Panel6Layout.setHorizontalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel6Layout.setVerticalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel7.setBackground(new java.awt.Color(0, 157, 221));
        Panel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel7Layout = new javax.swing.GroupLayout(Panel7);
        Panel7.setLayout(Panel7Layout);
        Panel7Layout.setHorizontalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel7Layout.setVerticalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Panel8.setBackground(new java.awt.Color(0, 157, 221));
        Panel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Panel8Layout = new javax.swing.GroupLayout(Panel8);
        Panel8.setLayout(Panel8Layout);
        Panel8Layout.setHorizontalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Panel8Layout.setVerticalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        timerLabel.setBackground(new java.awt.Color(0, 51, 255));
        timerLabel.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        timerLabel.setForeground(new java.awt.Color(0, 51, 255));
        timerLabel.setText("300s");

        reiniciarButton.setBackground(new java.awt.Color(51, 204, 255));
        reiniciarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reiniciarButton.setForeground(new java.awt.Color(0, 0, 0));
        reiniciarButton.setText("Reiniciar");
        reiniciarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarButtonActionPerformed(evt);
            }
        });

        opcoesJogoButton.setBackground(new java.awt.Color(51, 204, 255));
        opcoesJogoButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        opcoesJogoButton.setForeground(new java.awt.Color(0, 0, 0));
        opcoesJogoButton.setText("Opcoes");
        opcoesJogoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcoesJogoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundoPanelLayout = new javax.swing.GroupLayout(fundoPanel);
        fundoPanel.setLayout(fundoPanelLayout);
        fundoPanelLayout.setHorizontalGroup(
            fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
            .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fundoPanelLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(timerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fundoPanelLayout.createSequentialGroup()
                            .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fundoPanelLayout.createSequentialGroup()
                                    .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoPanelLayout.createSequentialGroup()
                                            .addComponent(Panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(Panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoPanelLayout.createSequentialGroup()
                                            .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(52, 52, 52))
                                        .addGroup(fundoPanelLayout.createSequentialGroup()
                                            .addComponent(Panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(Panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(Panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(364, 364, 364))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fundoPanelLayout.createSequentialGroup()
                                    .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fundoPanelLayout.createSequentialGroup()
                                            .addComponent(Panel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(Panel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(opcoesJogoButton))
                                    .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fundoPanelLayout.createSequentialGroup()
                                            .addComponent(Panel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(Panel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(reiniciarButton))
                                    .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoPanelLayout.createSequentialGroup()
                                            .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(fundoPanelLayout.createSequentialGroup()
                                                    .addComponent(Panel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, 0)
                                                    .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Panel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Panel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(104, 104, 104))
                                                .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoPanelLayout.createSequentialGroup()
                                                        .addComponent(sairJogoButton)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jogarRodadaButton))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoPanelLayout.createSequentialGroup()
                                                        .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoPanelLayout.createSequentialGroup()
                                                                .addComponent(Panel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(Panel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(fundoPanelLayout.createSequentialGroup()
                                                                .addComponent(Panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(52, 52, 52)))
                                                        .addComponent(Panel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(Panel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(Panel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(Panel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Panel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Panel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Panel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Panel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Panel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Panel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(fundoPanelLayout.createSequentialGroup()
                                            .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(fundoPanelLayout.createSequentialGroup()
                                                    .addComponent(Panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, 0)
                                                    .addComponent(Panel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(52, 52, 52)
                                            .addComponent(Panel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(Panel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(Panel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(Panel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(4, 4, 4)))
                    .addGap(64, 64, 64)))
        );
        fundoPanelLayout.setVerticalGroup(
            fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fundoPanelLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fundoPanelLayout.createSequentialGroup()
                            .addComponent(timerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(fundoPanelLayout.createSequentialGroup()
                                    .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(0, 0, 0)
                                    .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(Panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(Panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(Panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(Panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(Panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoPanelLayout.createSequentialGroup()
                            .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Panel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Panel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Panel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Panel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(fundoPanelLayout.createSequentialGroup()
                                    .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(fundoPanelLayout.createSequentialGroup()
                                            .addComponent(Panel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(Panel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Panel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Panel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, 0)
                                    .addComponent(Panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(fundoPanelLayout.createSequentialGroup()
                                    .addComponent(Panel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(Panel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(Panel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(Panel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(fundoPanelLayout.createSequentialGroup()
                            .addComponent(Panel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(Panel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Panel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Panel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Panel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Panel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Panel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Panel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Panel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Panel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Panel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Panel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(47, 47, 47)
                    .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jogarRodadaButton)
                        .addComponent(sairJogoButton)
                        .addComponent(reiniciarButton)
                        .addComponent(opcoesJogoButton))
                    .addGap(12, 12, 12)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(fundoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public int rodarDado(){
        //método que gera um numero aleatorio de 1 a 6, simulando um dado
        int dado = ThreadLocalRandom.current().nextInt(1,7);
        return dado;
    }
    
    private void andarCasas(){
        //método para mover o peão para a casa certa
        switch(usuario.getCasa()){
            case 1:
                peaoLabel.setLocation(Panel1.getX()+24, Panel1.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 2:
                peaoLabel.setLocation(Panel2.getX()+24, Panel2.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 3:
                peaoLabel.setLocation(Panel3.getX()+24, Panel3.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 4:
                peaoLabel.setLocation(Panel4.getX()+24, Panel4.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 5:
                peaoLabel.setLocation(Panel5.getX()+24, Panel5.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 6:
                peaoLabel.setLocation(Panel6.getX()+24, Panel6.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 7:
                peaoLabel.setLocation(Panel7.getX()+24, Panel7.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 8:
                peaoLabel.setLocation(Panel8.getX()+24, Panel8.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 9:
                peaoLabel.setLocation(Panel9.getX()+24, Panel9.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 10:
                peaoLabel.setLocation(Panel10.getX()+24, Panel10.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 11:
                peaoLabel.setLocation(Panel11.getX()+24, Panel11.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 12:
                peaoLabel.setLocation(Panel12.getX()+24, Panel12.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 13:
                peaoLabel.setLocation(Panel13.getX()+24, Panel13.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 14:
                peaoLabel.setLocation(Panel14.getX()+24, Panel14.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 15:
                peaoLabel.setLocation(Panel15.getX()+24, Panel15.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 16:
                peaoLabel.setLocation(Panel16.getX()+24, Panel16.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 17:
                peaoLabel.setLocation(Panel17.getX()+24, Panel17.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 18:
                peaoLabel.setLocation(Panel18.getX()+24, Panel18.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 19:
                peaoLabel.setLocation(Panel19.getX()+24, Panel19.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 20:
                peaoLabel.setLocation(Panel20.getX()+24, Panel20.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 21:
                peaoLabel.setLocation(Panel21.getX()+24, Panel21.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 22:
                peaoLabel.setLocation(Panel22.getX()+24, Panel22.getY()+48);
                setComponentZOrder(peaoLabel,0);
                peaoLabel.repaint();
                break;
            case 23:
               peaoLabel.setLocation(Panel22.getX()+24, Panel22.getY()+48);
               setComponentZOrder(peaoLabel,0);
               peaoLabel.repaint();
               break;
            case 24:
               peaoLabel.setLocation(Panel24.getX()+24, Panel24.getY()+48);
               setComponentZOrder(peaoLabel,0);
               peaoLabel.repaint();
               break;
            case 25:
               peaoLabel.setLocation(Panel25.getX()+24, Panel25.getY()+48);
               setComponentZOrder(peaoLabel,0);
               peaoLabel.repaint();
               break;
            case 26:
               peaoLabel.setLocation(Panel26.getX()+24, Panel26.getY()+48);
               setComponentZOrder(peaoLabel,0);
               peaoLabel.repaint();
               break;
            case 27:
               peaoLabel.setLocation(Panel27.getX()+24, Panel27.getY()+48);
               setComponentZOrder(peaoLabel,0);
               peaoLabel.repaint();
               break;
            case 28:
               peaoLabel.setLocation(Panel28.getX()+24, Panel28.getY()+48);
               setComponentZOrder(peaoLabel,0);
               peaoLabel.repaint();
               break;
            case 29:
               peaoLabel.setLocation(Panel29.getX()+24, Panel29.getY()+48);
               setComponentZOrder(peaoLabel,0);
               peaoLabel.repaint();
               break;
            case 30:
               peaoLabel.setLocation(Panel30.getX()+24, Panel30.getY()+48);
               setComponentZOrder(peaoLabel,0);
               peaoLabel.repaint();
               break;
            case 31:
               peaoLabel.setLocation(Panel31.getX()+24, Panel31.getY()+48);
               setComponentZOrder(peaoLabel,0);
               peaoLabel.repaint();
               break;
            case 32:
               peaoLabel.setLocation(Panel32.getX()+24, Panel32.getY()+48);
               setComponentZOrder(peaoLabel,0);
               peaoLabel.repaint();
               break;
            case 33:
               peaoLabel.setLocation(Panel33.getX()+24, Panel33.getY()+48);
               setComponentZOrder(peaoLabel,0);
               peaoLabel.repaint();
               break;
            case 34:
               peaoLabel.setLocation(Panel34.getX()+24, Panel34.getY()+48);
               setComponentZOrder(peaoLabel,0);
               peaoLabel.repaint();
               break;
            case 35:
               peaoLabel.setLocation(Panel35.getX()+24, Panel35.getY()+48);
               setComponentZOrder(peaoLabel,0);
               peaoLabel.repaint();
               break;
            case 36:
               peaoLabel.setLocation(Panel36.getX()+24, Panel36.getY()+48);
               setComponentZOrder(peaoLabel,0);
               peaoLabel.repaint();
               break;
            case 37:
               peaoLabel.setLocation(Panel37.getX()+24, Panel37.getY()+48);
               setComponentZOrder(peaoLabel,0);
               peaoLabel.repaint();
               break;
            default:
                if(usuario.getCasa() >= 38){
                    peaoLabel.setLocation(Panel38.getX()+24, Panel38.getY()+48);
                    setComponentZOrder(peaoLabel,0);
                    peaoLabel.repaint();
                    encerrarJogo();
                }
                else{
                    peaoLabel.setLocation(Panel1.getX()+24, Panel1.getY()+48);
                    setComponentZOrder(peaoLabel,0);
                    peaoLabel.repaint();
                }
                break;
        }
    }
    
    private void encerrarJogo(){
        //método para encerrar quando o jogador chega na ultima casa e abrir novamente o menu principal
        contando = false;
        int pontos = tempo*2 + acertos * 50;
        JOptionPane.showMessageDialog(null, "Parabéns! Você terminou o jogo fazendo " + pontos + " pontos\n" + quant_perguntas + " perguntas\n" + acertos + " acertos");
        usuario.guardarPontos(usuario, pontos);
        DAO.ranking();
        
        TelaMenuPrincipal menu = new TelaMenuPrincipal();
        menu.manterUsuario(usuario);
        usuario.setCasa(1); // volta o valor da casa do usuario para 1 para jogar novamente
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.dispose();
    }
    
    private void jogar(){
        //sequencia do que ocorre quando clica em jogar (1 rodada)
        int dado = rodarDado();
        JOptionPane.showMessageDialog(null, "Você tirou " + dado + " no dado");
        int casas_bonus = Pergunta.perguntaJogo(ja_foram);
        quant_perguntas++;
        if(casas_bonus > 0){    //verificar se acertou pergunta (se casa_bonus for 0 errou)
            JOptionPane.showMessageDialog(null, "Você acertou a pergunta e vai andar " + (dado + casas_bonus) + " casas!");
            acertos++;
        }
        usuario.somaCasa(casas_bonus + dado);
        andarCasas();
    }
    private void Panel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_Panel1ComponentAdded

    }//GEN-LAST:event_Panel1ComponentAdded

    private void jogarRodadaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarRodadaButtonActionPerformed
        jogar();
    }//GEN-LAST:event_jogarRodadaButtonActionPerformed

    private void sairJogoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairJogoButtonActionPerformed
        contando = false;
        TelaMenuPrincipal menu = new TelaMenuPrincipal();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        usuario.setCasa(1);
        menu.manterUsuario(usuario);
        this.dispose();
    }//GEN-LAST:event_sairJogoButtonActionPerformed

    private void peaoLabelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_peaoLabelPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_peaoLabelPropertyChange

    private void reiniciarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarButtonActionPerformed
        contando = false;
        TelaJogo tj = new TelaJogo();
        tj.manterUsuario(usuario);
        usuario.setCasa(1);
        acertos = 0;
        quant_perguntas = 0;
        tj.setLocationRelativeTo(null);
        tj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reiniciarButtonActionPerformed

    private void opcoesJogoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoesJogoButtonActionPerformed
        Opcoes mo = new Opcoes();
        mo.setLocationRelativeTo(null);
        mo.setVisible(true);
        mo.manterUsuario(usuario);
    }//GEN-LAST:event_opcoesJogoButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
        

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel10;
    private javax.swing.JPanel Panel11;
    private javax.swing.JPanel Panel12;
    private javax.swing.JPanel Panel13;
    private javax.swing.JPanel Panel14;
    private javax.swing.JPanel Panel15;
    private javax.swing.JPanel Panel16;
    private javax.swing.JPanel Panel17;
    private javax.swing.JPanel Panel18;
    private javax.swing.JPanel Panel19;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel20;
    private javax.swing.JPanel Panel21;
    private javax.swing.JPanel Panel22;
    private javax.swing.JPanel Panel23;
    private javax.swing.JPanel Panel24;
    private javax.swing.JPanel Panel25;
    private javax.swing.JPanel Panel26;
    private javax.swing.JPanel Panel27;
    private javax.swing.JPanel Panel28;
    private javax.swing.JPanel Panel29;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel30;
    private javax.swing.JPanel Panel31;
    private javax.swing.JPanel Panel32;
    private javax.swing.JPanel Panel33;
    private javax.swing.JPanel Panel34;
    private javax.swing.JPanel Panel35;
    private javax.swing.JPanel Panel36;
    private javax.swing.JPanel Panel37;
    private javax.swing.JPanel Panel38;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel Panel7;
    private javax.swing.JPanel Panel8;
    private javax.swing.JPanel Panel9;
    private javax.swing.JPanel casa1Panel20;
    private javax.swing.JPanel casa1Panel21;
    private javax.swing.JPanel casa1Panel4;
    private javax.swing.JPanel casa1Panel5;
    private javax.swing.JPanel casa1Panel6;
    private javax.swing.JPanel casa1Panel7;
    private javax.swing.JPanel fundoPanel;
    private javax.swing.JButton jogarRodadaButton;
    private javax.swing.JButton opcoesJogoButton;
    private javax.swing.JLabel peaoLabel;
    private javax.swing.JButton reiniciarButton;
    private javax.swing.JButton sairJogoButton;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables
}
