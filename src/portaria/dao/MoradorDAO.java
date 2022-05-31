/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portaria.dao;

import portaria.model.Morador;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import portaria.view.TelaConsultaMorador;

/**
 *
 * @author Pichau
 */
public class MoradorDAO {
    private ConexaoDAO connDAO;
    private Connection conn;
    private ArrayList<Morador> moradores = new ArrayList<Morador>();
    private final String AUT_SQL = "select * from morador where nome_morador = ?";
    private final String CADASTRAR_MORADOR = "INSERT INTO morador(nome_morador, cpf_morador, idade_morador, num_condominio, num_bloco, vaga_estacionamento) VALUES(?, ?, ?, ?, ?, ?)";

    //connMorador, conn= conexão com BD. Classe usada para conectar Morador e consultar no BD
    public ArrayList<Morador> connMorador(String nome){
        try {
            //Chamando conexão
            connDAO = new ConexaoDAO();
            conn = connDAO.conectar();

            //Fazendo consulta no BD
            PreparedStatement PState = conn.prepareStatement(AUT_SQL);
            PState.setString(1, nome);   //Pesquisando/consultando por nome
            
            //Resultado da Consulta no BD
            ResultSet rs = PState.executeQuery();
            
            //Verificando item da tabela do BD, se Existe
            while(rs.next()){
                if(nome.equals(rs.getString("nome_morador"))){
                    Morador mor = new Morador();
                    mor.setId(rs.getInt("id_morador"));
                    mor.setNome(rs.getString("nome_morador"));
                    mor.setCPF(rs.getString("cpf_morador"));
                    mor.setIdade(rs.getInt("idade_morador"));
                    mor.setNumCondominio(rs.getInt("num_condominio"));
                    mor.setNumBloco(rs.getInt("num_bloco"));
                    mor.setVagaEstacionamento(rs.getBoolean("vaga_estacionamento"));
                    mor.setDtCadastro(rs.getString("dt_cadastro"));
                    
                    moradores.add(mor);
                }
            }
            
            if(moradores.size() <= 0){
                return null;
            }
            else{
                return moradores;
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    public void cadastrarMorador(Morador mor) {
        try {
            //Chamando conexão
            connDAO = new ConexaoDAO();
            conn = connDAO.conectar();
            
            //nome, CPF, idade, numCondominio, numBloco, vagaEstacionamento
            
            PreparedStatement pState = conn.prepareStatement(CADASTRAR_MORADOR);
            pState.setString(1, mor.getNome());
            pState.setString(2, mor.getCPF());
            pState.setInt(3, mor.getIdade());
            pState.setInt(4, mor.getNumCondominio());
            pState.setInt(5, mor.getNumBloco());
            pState.setBoolean(6, mor.isVagaEstacionamento());
            
            pState.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
