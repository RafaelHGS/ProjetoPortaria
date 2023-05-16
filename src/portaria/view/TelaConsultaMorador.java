/*
    TelaConsultaMorador
        Responsável pelas funcionalidades de consulta de morador.
        Entre eles, a busca de todos os moradores, a busca de moradores por um filtro de caracteres
 */ 
package portaria.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import portaria.controller.MoradorController;
import portaria.model.Morador;

public class TelaConsultaMorador extends javax.swing.JFrame {   //Criação de Tela

    private MoradorController morController;
    private TelaPrincipalADM telaADM;
    private boolean isADM;

    private static final SimpleDateFormat dateFormatBR = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    //Construtores
    public TelaConsultaMorador() {
        initComponents();
    }

    public TelaConsultaMorador(TelaPrincipalADM telaADM, boolean isADM) {
        this.isADM = isADM;
        this.telaADM = telaADM;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConsulta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsulta = new javax.swing.JTable();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de morador");

        jPanelConsulta.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Consulta de morador");

        jLabelNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelNome.setText("Nome:");
        jLabelNome.setToolTipText("Insira o nome do morador");

        jNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNomeKeyPressed(evt);
            }
        });

        jButtonConsultar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarMorador(evt);
            }
        });

        jTableConsulta.setAutoCreateRowSorter(true);
        jTableConsulta.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Idade", "NºCondomínio", "NºBloco", "Estacionamento ?", "D.Entrada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsulta);
        if (jTableConsulta.getColumnModel().getColumnCount() > 0) {
            jTableConsulta.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTableConsulta.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableConsulta.getColumnModel().getColumn(3).setPreferredWidth(25);
            jTableConsulta.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        javax.swing.GroupLayout jPanelConsultaLayout = new javax.swing.GroupLayout(jPanelConsulta);
        jPanelConsulta.setLayout(jPanelConsultaLayout);
        jPanelConsultaLayout.setHorizontalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLayout.createSequentialGroup()
                .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultaLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelConsultaLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelConsultaLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanelConsultaLayout.setVerticalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelConsultaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelNome))
                    .addComponent(jButtonConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonSair.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonSair.setText("Cancelar e Voltar/Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairMorador(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jButtonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSair)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void consultarMorador(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarMorador
        //Consulta de Morador
        morController = new MoradorController(this);

        //Realizando escrita de resultados na tabela da aplicação
        try {
            //Recebendo Dados para consulta
            ArrayList<Morador> listaTabela = morController.consultarMorador(jNome.getText().toUpperCase());

            //Definindo a tabela e zerando tabela anterior
            DefaultTableModel dadosTabela = (DefaultTableModel) jTableConsulta.getModel();   //Obtendo Tabela
            dadosTabela.setRowCount(0);

            //Escrevendo Dados na tabela
            if (listaTabela != null) {
                for (Morador mor : listaTabela) {       //Recebendo Objetos para escrita na tabela
                    //Reescrevendo valores do Objeto
                    String vagaEst;
                    if (mor.isVagaEstacionamento()) {
                        vagaEst = "Sim";
                    } else {
                        vagaEst = "Não";
                    }

                    dadosTabela.addRow(new Object[]{ //Escrevendo dados na tabela
                        mor.getId(),
                        mor.getNome(),
                        mor.getCPF(),
                        mor.getIdade(),
                        mor.getNumCondominio(),
                        mor.getNumBloco(),
                        vagaEst,
                        dateFormatBR.format(mor.getDtCadastro())});
                }
            } else {
                JOptionPane.showMessageDialog(null, "Morador não encontrado :)");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Impossível realizar consulta!", "Erro", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_consultarMorador

    //Saindo da Aplicação, ou, voltando para tela anterior
    private void jButtonSairMorador(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairMorador
        //Se Administrador, ele volta para a tela principal, Senão Ele pergunta ao funcionário se ele deseja encerrar a aplicação
        if (this.isADM == true) {
            this.dispose();
            telaADM.setVisible(true);
        } else {
            Object[] opcoes = {"Sim", "Não"};
            int opcao = JOptionPane.showOptionDialog(null, "Deseja Sair do Sistema ?", "Sair", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[1]);

            if (opcao == 0) {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_jButtonSairMorador

    //Exclusão de morador, Funciona apenas para Adm's
    private void jTableConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaMouseClicked
        if (this.isADM == true) {
            if (evt.getClickCount() == 2) {
                //Recebendo morador da tabela
                int idMorador = (int) jTableConsulta.getModel().getValueAt(jTableConsulta.getSelectedRow(), 0);

                boolean sucesso;

                try {
                    //Confirmação para exclusão de morador
                    Object[] opcoes = {"Sim", "Não"};
                    int opcao = JOptionPane.showOptionDialog(null, "Deseja Excluir o morador ?", "Exclusão", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[1]);

                    //Se a opção for "Sim", o morador selecionado na tabela será excluído
                    if (opcao == 0) {
                        morController = new MoradorController();
                        sucesso = morController.excluirMorador(idMorador);

                        if (sucesso) {
                            JOptionPane.showMessageDialog(null, "Morador Exluído com Sucesso");
                            DefaultTableModel dadosTabela = (DefaultTableModel) jTableConsulta.getModel();   //Obtendo Tabela
                            dadosTabela.setRowCount(0);
                        } else {
                            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a Exclusão!", "Erro", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao Deletar Morador!", "Erro", JOptionPane.ERROR_MESSAGE);

                }
            }
        }
    }//GEN-LAST:event_jTableConsultaMouseClicked

    private void jNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNomeKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            jButtonConsultar.doClick();
        }
    }//GEN-LAST:event_jNomeKeyPressed

    //Limpa campos de escrita
    public void limpaCampos() {
        jNome.setText("");
        jNome.grabFocus();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaMorador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JTextField jNome;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsulta;
    // End of variables declaration//GEN-END:variables
}
