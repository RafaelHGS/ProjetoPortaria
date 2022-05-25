package portaria.dao;
//import FuncionarioCliente.Funcionario;
//import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;


public class ConexaoDAO {
    private final String url = "jdbc:mysql://localhost:3306/portaria";
    private final String senha = "root";
    private final String usuario = "root";
    private Connection conn;
    
//    private PreparedStatement st;
//    private ResultSet rs;
    
    public Connection conectar(){
        try {
            conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado com sucesso");
            return conn;
            }
        catch (SQLException e) {
            System.out.println("Falha ao conectar " + e);
            return null;
            }
        }
    
    public void close() throws SQLException{
        try{
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    
//Exemplo do Professor
//    public List<Funcionario> listar() {;
//        List<Funcionario> lista = new ArrayList<>();
//        String sql = "SELECT * FROM `funcionarios`";
//        
//        try{
//            st = conn.prepareStatement(sql);
//            rs = st.executeQuery();
//            
//            Funcionario f;
//            
//            while (rs.next()){
//                f = new Funcionario();
//                f.setNome(rs.getString("nome"));
////                f.setCargo(rs.getString("cargo"));
////                f.setSalario(rs.getDouble("salario"));
//                lista.add(f);
//        
//            }
//        }
//        catch (SQLException e){
//            System.out.println("Erro ao listar " + e);
//        }
//        return lista;
//    }
    
}
