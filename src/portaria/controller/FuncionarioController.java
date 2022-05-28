/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portaria.controller;
import javax.swing.JOptionPane;
import portaria.dao.FuncionarioDAO;
import portaria.model.Funcionario;
import portaria.view.TelaLogin;
import portaria.view.TelaPrincipalADM;

/**
 *
 * @author Pichau
 */
public class FuncionarioController {
    private Funcionario funn;
    private FuncionarioDAO funnDAO;
    private TelaLogin telaL;
    
    //Construtores
    public FuncionarioController(){}
    public FuncionarioController(TelaLogin telaL){
        this.telaL = telaL;
    }
    
    //Metodo para autenticar funcionario
    public void autFuncionario(String login, String senha){
        if ((login.length() > 0) && (senha.length() > 0)){
            funn = new Funcionario();
            funnDAO = new FuncionarioDAO();
            
            funn.setEmail(login);
            funn.setSenha(senha);
            
            int resultado = funnDAO.connFuncionario(funn);
            
            ExibirTela(resultado);
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Campos Inválidas", "Erro", JOptionPane.ERROR_MESSAGE);
            telaL.limpaCampos();
        }
    }
    
    //Exibindo Tela conforme tipo de funcionário (ADM ou funcionario simples)
    public void ExibirTela(int resultado){
        if (resultado != -1){
            if(resultado == 1){
                TelaPrincipalADM TelaADM = new TelaPrincipalADM();
                
                JOptionPane.showMessageDialog(null, "Seja bem vindo Administrador :)");
                telaL.dispose();
                TelaADM.setVisible(true);
                            }
            if(resultado == 0){
                JOptionPane.showMessageDialog(null, "Seja bem vindo Atendente :)");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuário Não Cadastrado no Sistema !!!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
        public boolean cadastrarFuncionario (String nome, int idade, String cpf, String email, String senha, boolean isADM) {
         if (nome != null && nome.length() > 0 && idade > 0 && validarCPF(cpf) && email != null && email.length() > 0 && senha != null && senha.length() > 0) {
             funn = new Funcionario(nome, cpf, idade, idade, email, senha, isADM);
             funnDAO = new FuncionarioDAO();
             funnDAO.cadastrarFuncionario(funn);
             return true;
         }
         return false;
    }
    
    public boolean validarCPF(String CPF) {
        for (int i = 0; i < CPF.length(); i++) {
            if (!Character.isDigit(CPF.charAt(i))) {
                if (!(i == 3 || i == 7 || i == 11)) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
