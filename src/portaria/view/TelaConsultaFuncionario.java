/*
    TelaConsultaFuncionário
        Responsável pelas funcionalidades de consulta de funcionário.
        Entre eles, a busca de todos os funcionários, a busca de funcionario por um filtro de caracteres
 */
package portaria.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import portaria.controller.FuncionarioController;
import portaria.model.Funcionario;

public class TelaConsultaFuncionario extends javax.swing.JFrame {
    private FuncionarioController funcController;
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private TelaPrincipalADM telaADM;

    //Construtores
    public TelaConsultaFuncionario() {
        initComponents();
    }

    public TelaConsultaFuncionario(TelaPrincipalADM telaADM) {
        this.telaADM = telaADM;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsulta = new javax.swing.JTable();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de funcionario");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Consulta de funcionário");

        jLabelNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelNome.setText("Nome:");
        jLabelNome.setToolTipText("Insira o nome ");

        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyPressed(evt);
            }
        });

        jButtonConsultar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarFuncionario(evt);
            }
        });

        jTableConsulta.setAutoCreateRowSorter(true);
        jTableConsulta.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Idade", "E-mail", "Administrador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsulta.setAlignmentX(0.0F);
        jTableConsulta.setAlignmentY(0.0F);
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
        }

        jButtonSair.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonSair.setText("Cancelar e Voltar");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairconsultarFuncionario(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabelNome)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jButtonSair)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSair)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void consultarFuncionario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarFuncionario
        //Consulta de Funcionário
        funcController = new FuncionarioController(this);

        //Realizando escrita de resultados na tabela da aplicação
        try {
            //Recebendo Dados para consulta
            ArrayList<Funcionario> listaTabela = funcController.consulFuncionario(jTextFieldNome.getText().toUpperCase());

            //Definindo a tabela e zerando tabela anterior
            DefaultTableModel dadosTabela = (DefaultTableModel) jTableConsulta.getModel();   //Obtendo Tabela
            dadosTabela.setRowCount(0);

            //Escrevendo Dados na tabela
            if (listaTabela != null) {
                for (Funcionario func : listaTabela) {      //Recebendo Objetos para escrita na tabela
                    //Reescrevendo valores do Objeto
                    String isADM;
                    if (func.getIsADM()) {
                        isADM = "Sim";
                    } else {
                        isADM = "Não";
                    }
                    
                    //Escrevendo dados na tabela
                    dadosTabela.addRow(new Object[]{
                        func.getId(),
                        func.getNome(),
                        func.getCPF(),
                        func.getIdade(),
                        func.getEmail(),
                        isADM});
                }
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado :)");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Impossível realizar consulta!", "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_consultarFuncionario

    private void jButtonSairconsultarFuncionario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairconsultarFuncionario
        //Voltando par a a tela principal da aplicação
        this.dispose();
        telaADM.setVisible(true);
    }//GEN-LAST:event_jButtonSairconsultarFuncionario

    //Exclusão de funcionário, Funciona apenas para Adm's
    private void jTableConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaMouseClicked
        if (evt.getClickCount() == 2) {
            //Recebendo morador da tabela
            
            //Verificando se funcionário é ADM, se for, não é possível excluí-lo
            String isADM = (String) jTableConsulta.getModel().getValueAt(jTableConsulta.getSelectedRow(), 5);
            
            //Se não é adm, a exclusão toma continuidade
            if(isADM != "Sim"){
                int idFuncionario = (int) jTableConsulta.getModel().getValueAt(jTableConsulta.getSelectedRow(), 0);

                boolean sucesso;

                try {
                    //Confirmação para exclusão de funcionário
                    Object[] opcoes = {"Sim", "Não"};
                    int opcao = JOptionPane.showOptionDialog(null, "Deseja Excluir o Funcionário ?", "Exclusão", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[1]);

                    //Se a opção for "Sim", o funcionário selecionado na tabela será excluído
                    if (opcao == 0) {
                        funcController = new FuncionarioController();
                        sucesso = funcController.excluirFuncionario(idFuncionario);

                        if (sucesso) {
                            JOptionPane.showMessageDialog(null, "Funcionário Exluído com Sucesso");
                            DefaultTableModel dadosTabela = (DefaultTableModel) jTableConsulta.getModel();   //Obtendo Tabela
                            dadosTabela.setRowCount(0);
                        } else {
                            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a Exclusão!", "Erro", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao Deletar Funcionário!", "Erro", JOptionPane.ERROR_MESSAGE);

                }
            }
        }
    }//GEN-LAST:event_jTableConsultaMouseClicked

    private void jTextFieldNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            jButtonConsultar.doClick();
        }
    }//GEN-LAST:event_jTextFieldNomeKeyPressed

public void limpaCampos() {
        jTextFieldNome.setText("");
        jTextFieldNome.grabFocus();
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaFuncionario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsulta;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
