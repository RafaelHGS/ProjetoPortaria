//Comunicação com banco de dados, registro, consulta e exclusão, focados no Funcionário

package portaria.dao;

import portaria.model.Funcionario;
import java.sql.*;
import java.util.ArrayList;

public class FuncionarioDAO {

    private ConexaoDAO connDAO;
    private Connection conn;
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private final String AUT_SQL = "select * from funcionario where email_funcionario = ?";
    private final String CONSULTAR_FUNCIONARIO = "select * from funcionario where nome_funcionario like ?";
    private final String CADASTRAR_FUNCIONARIO = "insert into funcionario (nome_funcionario, cpf_funcionario, idade_funcionario, email_funcionario, senha_funcionario, is_adm) values(?, ?, ?, ?, ?, ?)";
    private final String EXCLUIR_FUNCIONARIO = "DELETE FROM funcionario WHERE id_funcionario = ?";

    
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
                        connDAO.close();
                        return 1;
                    } else if (funn.getIsADM() == false) {
                        connDAO.close();
                        return 0;
                    }
                }
            }
            connDAO.close();
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
            
            connDAO.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
        public ArrayList<Funcionario> consultaFuncionario(String nome){
        try {
            //Chamando conexão
            connDAO = new ConexaoDAO();
            conn = connDAO.conectar();

            //Fazendo consulta no BD
            PreparedStatement PState = conn.prepareStatement(CONSULTAR_FUNCIONARIO);
            PState.setString(1, "%"+nome+"%");   //Pesquisando/consultando por nome
            
            //Resultado da Consulta no BD
            ResultSet rs = PState.executeQuery();
            
            //Verificando item da tabela do BD, se Existe
            while(rs.next()){
                if(rs.getString("nome_funcionario").contains(nome)){
                    Funcionario func = new Funcionario();
                    func.setId(rs.getInt("id_funcionario"));
                    func.setNome(rs.getString("nome_funcionario"));
                    func.setCPF(rs.getString("cpf_funcionario"));
                    func.setIdade(rs.getInt("idade_funcionario"));  
                    func.setEmail(rs.getString("email_funcionario"));
                    func.setIsADM(rs.getBoolean("is_adm"));
                    funcionarios.add(func);
                }
            }
            
            connDAO.close();
            if(funcionarios.size() <= 0){
                return null;
            }
            else{
                return funcionarios;
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean excluirFuncionario(int idFuncionario){
        try {
            //Chamando conexão
            connDAO = new ConexaoDAO();
            conn = connDAO.conectar();
        
            PreparedStatement pState = conn.prepareStatement(EXCLUIR_FUNCIONARIO);
            pState.setInt(1, idFuncionario);
            pState.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
