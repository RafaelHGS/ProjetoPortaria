//Comunicação com banco de dados, registro, consulta e exclusão, focados no Morador

package portaria.dao;

import portaria.model.Morador;
import java.sql.*;
import java.util.ArrayList;

public class MoradorDAO {

    private ConexaoDAO connDAO;
    private Connection conn;
    private ArrayList<Morador> moradores = new ArrayList<Morador>();
    private final String AUT_SQL = "select * from morador where nome_morador like ? ";
    private final String CADASTRAR_MORADOR = "INSERT INTO morador(nome_morador, cpf_morador, idade_morador, num_condominio, num_bloco, vaga_estacionamento, dt_cadastro) VALUES(?, ?, ?, ?, ?, ?, ?)";
    private final String EXCLUIR_MORADOR = "DELETE FROM morador WHERE id_morador = ?";

    //connMorador, conn= conexão com BD. Classe usada para conectar Morador e consultar no BD
    public ArrayList<Morador> consultarMorador(String nome) {
        try {
            //Chamando conexão
            connDAO = new ConexaoDAO();
            conn = connDAO.conectar();

            //Fazendo consulta no BD
            PreparedStatement PState = conn.prepareStatement(AUT_SQL);
            PState.setString(1, "%" + nome + "%");   //Pesquisando/consultando por nome

            //Resultado da Consulta no BD
            ResultSet rs = PState.executeQuery();

            //Verificando item da tabela do BD, se Existe
            while (rs.next()) {
                if (rs.getString("nome_morador").contains(nome)) {
                    Morador mor = new Morador();
                    mor.setId(rs.getInt("id_morador"));
                    mor.setNome(rs.getString("nome_morador"));
                    mor.setCPF(rs.getString("cpf_morador"));
                    mor.setIdade(rs.getInt("idade_morador"));
                    mor.setNumCondominio(rs.getInt("num_condominio"));
                    mor.setNumBloco(rs.getInt("num_bloco"));
                    mor.setVagaEstacionamento(rs.getBoolean("vaga_estacionamento"));
                    mor.setDtCadastro(rs.getTimestamp("dt_cadastro"));

                    moradores.add(mor);
                }
            }

            connDAO.close(); //Encerrar conexão com BD

            if (moradores.size() <= 0) {
                return null;
            } else {
                return moradores;
            }
        } catch (SQLException e) {
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
            pState.setTimestamp(7, new Timestamp(System.currentTimeMillis()));
            pState.executeUpdate();

            connDAO.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean excluirMorador(int idMorador) {
        try {
            //Chamando conexão
            connDAO = new ConexaoDAO();
            conn = connDAO.conectar();

            PreparedStatement pState = conn.prepareStatement(EXCLUIR_MORADOR);
            pState.setInt(1, idMorador);
            pState.executeUpdate();

            connDAO.close();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
