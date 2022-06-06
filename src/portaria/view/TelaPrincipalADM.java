/*
    TelaPrincipalADM
        É responsável pela gestão de todas as funcionalidades que o Administrador tem.
        Entre eles o cadastro de funcionário/morador, consulta e exclusão do mesmo.
*/

package portaria.view;

public class TelaPrincipalADM extends javax.swing.JFrame {
    private TelaCadastroFuncionario telaFunc;
    private TelaCadastroMorador telaMor;
    private TelaConsultaFuncionario telaCFun;
    private TelaConsultaMorador telaCMor;

    public TelaPrincipalADM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jButtonCadFuncionario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonConsMorador = new javax.swing.JButton();
        jLabelConsultas = new javax.swing.JLabel();
        jButtonConsFunc = new javax.swing.JButton();
        jButtonCadMorador1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/porteiro.png"))); // NOI18N
        jLabel1.setText("Sistema da Portaria");

        jButtonSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonCadFuncionario.setText("Funcionario");
        jButtonCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadFuncionarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Cadastros");

        jButtonConsMorador.setText("Morador");
        jButtonConsMorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsMoradorActionPerformed(evt);
            }
        });

        jLabelConsultas.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelConsultas.setText("Consultas");

        jButtonConsFunc.setText("Funcionario");
        jButtonConsFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsFuncActionPerformed(evt);
            }
        });

        jButtonCadMorador1.setText("Morador");
        jButtonCadMorador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadMorador1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel3)))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCadMorador1)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCadFuncionario))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonConsMorador)
                                .addGap(20, 20, 20)
                                .addComponent(jButtonConsFunc))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabelConsultas))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadMorador1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabelConsultas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsMorador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsMoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsMoradorActionPerformed
        this.dispose();
        telaCMor = new TelaConsultaMorador(this, true);     //Chamando tela de consulta de morador
        telaCMor.setVisible(true);
    }//GEN-LAST:event_jButtonConsMoradorActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadFuncionarioActionPerformed
        this.dispose();
        telaFunc = new TelaCadastroFuncionario(this);       //Chamando tela de Cadastro de Funcionário
        telaFunc.setVisible(true);

    }//GEN-LAST:event_jButtonCadFuncionarioActionPerformed

    private void jButtonCadMorador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadMorador1ActionPerformed
        this.dispose();
        telaMor = new TelaCadastroMorador(this);            //Chamando tela de Cadastro de morador
        telaMor.setVisible(true);
    }//GEN-LAST:event_jButtonCadMorador1ActionPerformed

    private void jButtonConsFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsFuncActionPerformed
        this.dispose();
        telaCFun = new TelaConsultaFuncionario(this);       //Chamando tela de Consulta de Funcionário
        telaCFun.setVisible(true);
    }//GEN-LAST:event_jButtonConsFuncActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadFuncionario;
    private javax.swing.JButton jButtonCadMorador1;
    private javax.swing.JButton jButtonConsFunc;
    private javax.swing.JButton jButtonConsMorador;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelConsultas;
    // End of variables declaration//GEN-END:variables
}
