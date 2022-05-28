package portaria.dao;

import portaria.model.Funcionario;
import javax.swing.JOptionPane;
import java.sql.*;
import portaria.view.TelaPrincipalADM;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Pichau
 */
public class FuncionarioDAO {

    private ConexaoDAO connDAO;
    private Connection conn;
    private final String AUT_SQL = "select * from funcionario where email_funcionario = ?";
    private final String CADASTRAR_FUNCIONARIO = "insert into funcionario (nome_funcionario, cpf_funcionario, idade_funcionario, email_funcionario, senha_funcionario, is_adm) values(?, ?, ?, ?, ?, ?)";

    //connFuncionario, conn= conexão com BD. Classe usada para conectar funcionario e validar no BD
    public int connFuncionario(Funcionario funn) {

        //Conexão com BD
        try {
            //Chamando conexão
            connDAO = new ConexaoDAO();
            conn = connDAO.conectar();

            //Fazendo consulta no BD
            PreparedStatement PState = conn.prepareStatement(AUT_SQL);
            PState.setString(1, funn.getEmail());   //Pesquisando/consultando por email

            //Resultado da Consulta no BD
            ResultSet rs = PState.executeQuery();

            //Verificando item da tabela do BD, se é ADM
            if (rs.next()) {
                //Verificando autenticidade/paridade de crendenciais
                if (funn.getSenha().equals(rs.getString("senha_funcionario"))) {
                    //Verificando se é ADM
                    funn.setIsADM(rs.getBoolean("is_adm"));
                    if (funn.getIsADM() == true) {
                        return 1;
                    } else if (funn.getIsADM() == false) {
                        return 0;
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
        // Método de cadastro de funcionário
    public void cadastrarFuncionario(Funcionario funn) {
        try {
            //Chamando conexão
            connDAO = new ConexaoDAO();
            conn = connDAO.conectar();
            
            PreparedStatement pState = conn.prepareStatement(CADASTRAR_FUNCIONARIO);
            pState.setString(1, funn.getNome());
            pState.setString(2, funn.getCPF());
            pState.setInt(3, funn.getIdade());
            pState.setString(4, funn.getEmail());
            pState.setString(5, funn.getSenha());
            pState.setBoolean(6, funn.getIsADM());
            pState.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
