//Conexão principal com o Banco de Dados

package portaria.dao;
import java.sql.*;


public class ConexaoDAO {
    //Conexão com o banco de dados de exmplo/teste, lolcalhost
    
    private final String url = "jdbc:mysql://localhost:3306/portaria";
    private final String senha = "root";
    private final String usuario = "root";
    private Connection conn;
    
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
            System.out.println("Conexão encerrada");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
}
