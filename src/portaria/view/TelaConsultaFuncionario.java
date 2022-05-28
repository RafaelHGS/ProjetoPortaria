
package portaria.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import portaria.controller.FuncionarioController;
import portaria.model.Funcionario;


public class TelaConsultaFuncionario extends javax.swing.JFrame {

    private TelaCadastroFuncionario telaCadastroFuncionario;
    
    private FuncionarioController funcController;
    
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private TelaPrincipalADM telaADM;
    public TelaConsultaFuncionario() {
        initComponents();
    }
    
    public TelaConsultaFuncionario(TelaPrincipalADM telaADM){
        this.telaADM = telaADM;
        initComponents();
    }
    public TelaConsultaFuncionario(TelaCadastroFuncionario telaCadastroFuncionario){
        this.telaCadastroFuncionario = telaCadastroFuncionario;
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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/porteiro.png"))); // NOI18N
        jLabel1.setText("Consulta de funcionário");

        jLabelNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelNome.setText("Nome:");
        jLabelNome.setToolTipText("Insira o nome ");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jButtonConsultar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarFuncionario(evt);
            }
        });

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
        jScrollPane1.setViewportView(jTableConsulta);
        if (jTableConsulta.getColumnModel().getColumnCount() > 0) {
            jTableConsulta.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTableConsulta.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableConsulta.getColumnModel().getColumn(3).setPreferredWidth(25);
        }

        jButtonSair.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonSair.setText("Cancelar e Sair");
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
                        .addComponent(jLabel1)))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSair)
                .addGap(316, 316, 316))
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
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void consultarFuncionario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarFuncionario
          funcController = new FuncionarioController(this);

        //Realizando escrita na tabela de consulta
        try {
            //Recebendo Dados
            ArrayList<Funcionario> listaTabela = funcController.consulFuncionario(jTextFieldNome.getText());

            //Obtendo tabela e zerando
            DefaultTableModel dadosTabela = (DefaultTableModel) jTableConsulta.getModel();   //Obtendo Tabela
            dadosTabela.setRowCount(0);

            //Escrevendo Dados na tabela
            if (listaTabela != null) {
                for (Funcionario func : listaTabela) {
                    dadosTabela.addRow(new Object[] {
                    func.getId(),
                    func.getNome(),
                    func.getCPF(),
                    func.getIdade(),  
                    func.getEmail(),
                    func.getIsADM()});
                }
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado :)");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Impossível realizar consulta!", "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_consultarFuncionario

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonSairconsultarFuncionario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairconsultarFuncionario
        this.dispose();
        telaADM.setVisible(true);
        
    }//GEN-LAST:event_jButtonSairconsultarFuncionario

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
