/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portaria.controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import portaria.dao.FuncionarioDAO;
import portaria.model.Funcionario;
import portaria.view.TelaConsultaFuncionario;
import portaria.view.TelaConsultaMorador;
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
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private TelaConsultaFuncionario telaFuncionario;
    
    
    //Construtores
    public FuncionarioController(){}
    public FuncionarioController(TelaLogin telaL){
        this.telaL = telaL;
    }
    
    public FuncionarioController(TelaConsultaFuncionario telaFuncionario){
        this.telaFuncionario = telaFuncionario;
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
                TelaPrincipalADM telaADM = new TelaPrincipalADM();
                JOptionPane.showMessageDialog(null, "Seja bem vindo Administrador :)");
                telaL.dispose();
                telaADM.setVisible(true);
                            }
            if(resultado == 0){
                TelaConsultaMorador telaFunc = new TelaConsultaMorador();
                JOptionPane.showMessageDialog(null, "Seja bem vindo Atendente :)");
                telaL.dispose();
                telaFunc.setVisible(true);
                
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuário Não Cadastrado no Sistema !!!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
        public boolean cadastrarFuncionario (String nome, int idade, String cpf, String email, String senha, boolean isADM) {
         if (nome != null && nome.length() > 0 && idade > 0 && validarCPF(cpf) && email != null && email.length() > 0 && senha != null && senha.length() > 0) {
             funn = new Funcionario(nome, cpf, idade, email, senha, isADM);
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
    
    public ArrayList<Funcionario> consulFuncionario(String nome) {
        if (nome.length() >= 0 || nome != null || nome != "") {
            try {
                funn = new Funcionario();
                funnDAO = new FuncionarioDAO();

                funcionarios = funnDAO.consultaFuncionario(nome);

                if (funcionarios != null) {
                    return funcionarios;
                } else {
                    return null;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro na Consulta", "Erro", JOptionPane.ERROR_MESSAGE);
                telaFuncionario.limpaCampos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campos Inválidas", "Erro", JOptionPane.ERROR_MESSAGE);
            telaFuncionario.limpaCampos();
        }
        return null;
    }
    
    
    public boolean excluirFuncionario(int idMorador){
        if(idMorador > 0){
            funnDAO = new FuncionarioDAO();
            return funnDAO.excluirFuncionario(idMorador);
        }
        return false;
    }
    
}
