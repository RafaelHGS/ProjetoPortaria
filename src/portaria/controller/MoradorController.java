/*
        Controlador principal para tarefas relacionadas com o morador, responsável por pegar dados da
    View (Onde o Funcionário interage) com o Banco de Dados (camada DAO)
 */package portaria.controller;

import javax.swing.JOptionPane;
import portaria.dao.MoradorDAO;
import portaria.model.Morador;
import portaria.view.TelaConsultaMorador;
import java.util.ArrayList;

public class MoradorController {

    private Morador mor;
    private ArrayList<Morador> listaMorador = new ArrayList<Morador>();
    private MoradorDAO morDAO;
    private TelaConsultaMorador telaL;

    //Construtores
    public MoradorController() {
    }

    public MoradorController(TelaConsultaMorador telaL) {
        this.telaL = telaL;
    }

    //Consulta de moradores
    public ArrayList<Morador> consultarMorador(String nome) {
        if (nome.length() >= 0 || nome != null || nome != "") {
            try {
                mor = new Morador();
                morDAO = new MoradorDAO();

                listaMorador = morDAO.consultarMorador(nome);    //Conexão com Banco de dados para listagem de moradores

                //Resultado da consulta no BD
                if (listaMorador != null) {
                    return listaMorador;
                } else {
                    return null;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro na Consulta", "Erro", JOptionPane.ERROR_MESSAGE);
                telaL.limpaCampos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campos Inválidas", "Erro", JOptionPane.ERROR_MESSAGE);
            telaL.limpaCampos();
        }
        return null;
    }

    //Cadastro de moradores
    public boolean cadastrarMorador(String nome, String CPF, int idade, int numCondominio, int numBloco, boolean vagaEstacionamento) {
        if (nome != null && nome.length() > 0 && idade > 0 && numCondominio > 0 && numBloco > 0) {
            //Criação de morador
            mor = new Morador(nome, CPF, idade, numCondominio, numBloco, vagaEstacionamento);
            morDAO = new MoradorDAO();
            morDAO.cadastrarMorador(mor);   //Cadastro de morador no BD
            return true;
        }
        return false;
    }

    //Exclusão de morador
    public boolean excluirMorador(int idMorador) {
        if (idMorador > 0) {
            morDAO = new MoradorDAO();
            return morDAO.excluirMorador(idMorador);
        }
        return false;
    }

    //Veridicação de caracteres no CPF, na qual só é aceito digitos
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
