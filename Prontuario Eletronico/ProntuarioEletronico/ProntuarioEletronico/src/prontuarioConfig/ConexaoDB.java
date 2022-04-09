/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prontuarioConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    
    private Connection conexao;

    private final String connectionString = "jdbc:postgresql://localhost:5432/ProntuarioEletronico";
    private final String user = "postgres";
    private final String password = "123";
    
    public Connection conectar() {
        try {
            conexao = DriverManager.getConnection(connectionString, user, password);
            System.out.println("Banco de Dados Conectado");
            return conexao;            
        } catch(SQLException ex) {
            System.out.println("Erro de Conexão: " + ex.getMessage());
            return null;
        }
    }
    
    public void desconectar(){
        try 
        {
            if(!conexao.isClosed()){
                conexao.close();
                System.out.println("Banco de Dados Desconectado");
            }           
        } catch (SQLException ex) {
            System.out.println("Erro de Conexão: " + ex.getMessage());    
        } 
    }
}
