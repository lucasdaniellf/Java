
package prontuarioAD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Paciente;
import prontuarioConfig.ConexaoDB;

public class PacienteAD {
    public boolean CadastrarPaciente(ConexaoDB conexaoDB, Paciente paciente) throws SQLException, NullPointerException{
        Connection conexao = conexaoDB.conectar();
        
        String query = "insert into Paciente(Nome, Sexo, DataNascimento, Endereco, Telefone, NumCelular, Email) " +
                       "values (?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement stmt = conexao.prepareStatement(query);
        
        stmt.setString(1, paciente.getNome());
        stmt.setString(2, String.valueOf(paciente.getSexo()));
        stmt.setDate(3, new java.sql.Date(paciente.getDataNascimento().getTime()));
        stmt.setString(4, paciente.getEndereco());
        stmt.setString(5, paciente.getTelefone());
        stmt.setString(6, paciente.getNumCelular());
        stmt.setString(7, paciente.getEmail());
        
        int row = stmt.executeUpdate();
        System.out.println("rows inserted -> " + row);
        conexaoDB.desconectar();
        return row > 0;
    }
    
    public boolean AtualizarPaciente (ConexaoDB conexaoDB, Paciente paciente) throws SQLException, NullPointerException
    {
        Connection conexao = conexaoDB.conectar();
        
        String query = "update paciente set " +
                "Nome = ?, Sexo = ?, DataNascimento = ?, Endereco = ?, Telefone = ?, NumCelular = ?, Email = ? where idpaciente = ?";
        System.out.print(query);
        PreparedStatement stmt = conexao.prepareStatement(query);
        
        stmt.setString(1, paciente.getNome());
        stmt.setString(2, String.valueOf(paciente.getSexo()));
        stmt.setDate(3, new java.sql.Date(paciente.getDataNascimento().getTime()));
        stmt.setString(4, paciente.getEndereco());
        stmt.setString(5, paciente.getTelefone());
        stmt.setString(6, paciente.getNumCelular());
        stmt.setString(7, paciente.getEmail());
        stmt.setInt(8, paciente.getIdPaciente());
        
        int row = stmt.executeUpdate();
        System.out.println("rows updated -> " + row);
        conexaoDB.desconectar();
        return row > 0;
    }
    
    public ArrayList<Paciente> buscarPaciente (ConexaoDB conexaoDB, String nome) throws SQLException, NullPointerException{
        Connection conexao = conexaoDB.conectar();
        
        String query = "select * from paciente where nome like ?";
        PreparedStatement stmt = conexao.prepareStatement(query);
        
        stmt.setString(1, "%"+nome+"%");        
        ResultSet result = stmt.executeQuery();
        
        ArrayList<Paciente> listaPaciente = new ArrayList<>();
       
        while (result.next()) {
            Paciente paciente = new Paciente();    
    
            paciente.setIdPaciente(result.getInt("idPaciente"));
            paciente.setNome(result.getString("nome"));
            paciente.setSexo(result.getString("sexo").toCharArray()[0]);
            paciente.setDataNascimento(result.getDate("dataNascimento"));
            paciente.setEmail(result.getString("email"));
            paciente.setNumCelular(result.getString("numCelular"));
            paciente.setTelefone(result.getString("telefone"));
            paciente.setEndereco(result.getString("Endereco"));
            
            listaPaciente.add(paciente);
        }
        conexaoDB.desconectar();
        System.out.println("Here");
        return listaPaciente;
    }
    
        public Paciente buscarPacientePorID (ConexaoDB conexaoDB, int id) throws SQLException, NullPointerException{
        Connection conexao = conexaoDB.conectar();
        
        String query = "select * from paciente where idPaciente = ?";
        PreparedStatement stmt = conexao.prepareStatement(query);
        
        stmt.setInt(1, id);        
        ResultSet result = stmt.executeQuery();
        
        Paciente paciente = new Paciente();         
        
        while (result.next()) {
            paciente.setIdPaciente(result.getInt("idPaciente"));
            paciente.setNome(result.getString("nome"));
            paciente.setSexo(result.getString("sexo").toCharArray()[0]);
            paciente.setDataNascimento(result.getDate("dataNascimento"));
            paciente.setEmail(result.getString("email"));
            paciente.setNumCelular(result.getString("numCelular"));
            paciente.setTelefone(result.getString("telefone"));
            paciente.setEndereco(result.getString("Endereco"));
        }
        conexaoDB.desconectar();
        return paciente;
    }
    
    
    
    public ArrayList<Paciente> buscarTodosPacientes (ConexaoDB conexaoDB) throws SQLException, NullPointerException{
        Connection conexao = conexaoDB.conectar();
        
        String query = "select * from paciente";
        PreparedStatement stmt = conexao.prepareStatement(query);
      
        ResultSet result = stmt.executeQuery();
        
        ArrayList<Paciente> listaPaciente = new ArrayList<>();
       
        while (result.next()) {
            Paciente paciente = new Paciente();    
    
            paciente.setIdPaciente(result.getInt("idPaciente"));
            paciente.setNome(result.getString("nome"));
            paciente.setSexo(result.getString("sexo").toCharArray()[0]);
            paciente.setDataNascimento(result.getDate("dataNascimento"));
            paciente.setEmail(result.getString("email"));
            paciente.setNumCelular(result.getString("numCelular"));
            paciente.setTelefone(result.getString("telefone"));
            paciente.setEndereco(result.getString("Endereco"));
            
            listaPaciente.add(paciente);
        }
        conexaoDB.desconectar();
        return listaPaciente;
    }
    
    public boolean deletePaciente(ConexaoDB conexaoDB, int id) throws SQLException, NullPointerException{
        Connection conexao = conexaoDB.conectar();
        
        String query = "delete from paciente where idPaciente = ?"; 
        PreparedStatement stmt = conexao.prepareStatement(query);
        stmt.setInt(1, id);
        
        int row = stmt.executeUpdate();
        System.out.println("rows deleted -> " + row);
        conexaoDB.desconectar();
        return row > 0;
    }  
}
