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
    private ArrayList<String[]> moradores = new ArrayList<String[]>();
    private final String AUT_SQL = "select * from morador where nome_morador = ?";

    //connMorador, conn= conexão com BD. Classe usada para conectar Morador e consultar no BD
    public ArrayList<String[]> connMorador(Morador mor){
        try {
            //Chamando conexão
            connDAO = new ConexaoDAO();
            conn = connDAO.conectar();

            //Fazendo consulta no BD
            PreparedStatement PState = conn.prepareStatement(AUT_SQL);
            PState.setString(1, mor.getNome());   //Pesquisando/consultando por nome
            
            //Resultado da Consulta no BD
            ResultSet rs = PState.executeQuery();
            
            //Verificando item da tabela do BD, se Existe
            while(rs.next()){
                //Criando Dados morador
                String[] dadosMorador = new String[8];
                
                //Verificando credenciais
                if(mor.getNome().equals(rs.getString("nome_morador"))){

                    //Obtendo valores da tabela do objeto criado;
                    ResultSetMetaData rsMetaData = rs.getMetaData();
                    
                    //Gerando Dados da coluna
                    int contador = rsMetaData.getColumnCount(); //
                    for(int i = 1; i<=contador; i++) {
                        dadosMorador[i-1] = rs.getString(rsMetaData.getColumnName(i));   //Coleta de Dados
                    }
                    
                    moradores.add(dadosMorador);
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
}
