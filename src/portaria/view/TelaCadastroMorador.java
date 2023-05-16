/*
    TelaCadastroMorador
        Recebe dados para o cadastro de um novo morador para o Banco de dados
 */
package portaria.view;

import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import portaria.controller.MoradorController;

public class TelaCadastroMorador extends javax.swing.JFrame {

    private TelaPrincipalADM telaADM;
    private MoradorController morController;

    //Construtores
    public TelaCadastroMorador() {
        initComponents();
    }

    public TelaCadastroMorador(TelaPrincipalADM telaADM) {
        this.telaADM = telaADM;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelCPF = new javax.swing.JLabel();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabelIdade = new javax.swing.JLabel();
        jSpinnerIdade = new javax.swing.JSpinner();
        jLabelNumCond = new javax.swing.JLabel();
        jSpinnerNumCond = new javax.swing.JSpinner();
        jLabelNumBloco = new javax.swing.JLabel();
        jSpinnerNumBloco = new javax.swing.JSpinner();
        jLabelEstacionamento = new javax.swing.JLabel();
        jComboEstacionamento = new javax.swing.JComboBox<>();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar1 = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Cadastrar de Morador");

        jLabelNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelNome.setText("Nome");

        jLabelCPF.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelCPF.setText("CPF");

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelIdade.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelIdade.setText("Idade");

        jSpinnerIdade.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jSpinnerIdade.setModel(new javax.swing.SpinnerNumberModel(16, 16, 90, 1));

        jLabelNumCond.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelNumCond.setText("Número Condomínio");

        jSpinnerNumCond.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jSpinnerNumCond.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));

        jLabelNumBloco.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelNumBloco.setText("Número do Bloco");

        jSpinnerNumBloco.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jSpinnerNumBloco.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jLabelEstacionamento.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelEstacionamento.setText("Estacionamento");

        jComboEstacionamento.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jComboEstacionamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));

        jButtonSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonCancelar1.setText("Cancelar");
        jButtonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar1ActionPerformed(evt);
            }
        });

        jButtonConsultar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaConsultaMorador(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboEstacionamento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButtonCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSpinnerIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIdade)
                            .addComponent(jLabelNumBloco)
                            .addComponent(jSpinnerNumBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEstacionamento)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNome)
                                    .addComponent(jLabelCPF)
                                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinnerNumCond, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNumCond))))
                        .addContainerGap(145, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdade)
                    .addComponent(jLabelNumCond))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNumCond, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelNumBloco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerNumBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEstacionamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboEstacionamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        //Recebendo valores para cadastro
        String nome = jTextFieldNome.getText().toUpperCase();
        String cpf = jFormattedTextFieldCPF.getText();
        int idade = Integer.parseInt(jSpinnerIdade.getValue().toString());
        int numCondominio = Integer.parseInt(jSpinnerNumCond.getValue().toString());
        int numBloco = Integer.parseInt(jSpinnerNumBloco.getValue().toString());
        boolean usaEst = verificaEst(jComboEstacionamento.getSelectedItem().toString());

        boolean sucesso;

        //Criação de morador
        try {
            morController = new MoradorController();
            sucesso = morController.cadastrarMorador(nome, cpf, idade, numCondominio, numBloco, usaEst);

            if (sucesso) {
                JOptionPane.showMessageDialog(null, "Morador Cadastrado Com Sucesso!!");
                this.jButtonLimparActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(null, "Campos preenchidos incorretamente!", "Erro", JOptionPane.ERROR_MESSAGE);
                this.jButtonLimparActionPerformed(evt);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro encontrado, tente novamente " + e);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        //Limpa todas as informações escritas
        jTextFieldNome.setText("");
        jFormattedTextFieldCPF.setText("");
        jSpinnerIdade.setModel(new SpinnerNumberModel(16, 16, 90, 1));
        jSpinnerNumBloco.setModel(new SpinnerNumberModel(1, 1, 12, 1));
        jSpinnerNumCond.setModel(new SpinnerNumberModel(1, 1, 4, 1));
        jComboEstacionamento.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar1ActionPerformed
        jButtonLimparActionPerformed(evt);
        this.dispose();
        telaADM.setVisible(true);
    }//GEN-LAST:event_jButtonCancelar1ActionPerformed

    private void abrir_telaConsultaMorador(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaConsultaMorador
        TelaConsultaMorador telaConsultaMorador = new TelaConsultaMorador(telaADM, true);
        telaConsultaMorador.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_abrir_telaConsultaMorador

    private boolean verificaEst(String usaEst) {
        return usaEst.equals("Sim");
    }

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
            java.util.logging.Logger.getLogger(TelaCadastroMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroMorador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar1;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboEstacionamento;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelEstacionamento;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumBloco;
    private javax.swing.JLabel jLabelNumCond;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerIdade;
    private javax.swing.JSpinner jSpinnerNumBloco;
    private javax.swing.JSpinner jSpinnerNumCond;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
