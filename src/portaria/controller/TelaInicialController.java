
package portaria.controller;

import javax.swing.JOptionPane;
import portaria.view.TelaInicial;
import portaria.view.TelaLogin;
import portaria.view.TelaPrincipalCliente;

public class TelaInicialController {
    private TelaInicial telaInicial;
    
    public TelaInicialController(){
        
    }
    
    public TelaInicialController(TelaInicial telaInicial) {
        this.telaInicial = telaInicial;
    }
    
    public void AbrirTelaLogin() {
        telaInicial.setVisible(false);
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
    }
    
    public void AbrirTelaSemLogin() {
        telaInicial.setVisible(false);
        TelaPrincipalCliente telaPrincipalCliente = new TelaPrincipalCliente();
        telaPrincipalCliente.setVisible(true);
    }
}
