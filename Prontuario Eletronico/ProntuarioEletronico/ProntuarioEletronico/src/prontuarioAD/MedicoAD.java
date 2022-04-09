package prontuarioAD;

import model.Medico;
import prontuarioConfig.ConexaoDB;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MedicoAD {

    public Medico fazerLogin(ConexaoDB conexaoDB, int crm, String senha) throws SQLException, NullPointerException{
        Connection conexao = conexaoDB.conectar();
        
        String query = "select * from medico where crm = ? and senha = ?";
        PreparedStatement stmt = conexao.prepareStatement(query);
        
        stmt.setInt(1, crm);
        stmt.setString(2, senha);
        
        ResultSet result = stmt.executeQuery();
        Medico medico = new Medico();
        
        if (result.next()) {
            
            medico.setCrm(result.getInt("crm"));
            medico.setNome(result.getString("nome"));
            medico.setCpf(result.getString("cpf"));
            medico.setEmail(result.getString("email"));
            medico.setNumCelular(result.getString("numCelular"));
            //medico.setSenha(result.getString("senha"));
            medico.setDataNascimento(result.getDate("dataNascimento"));    
        }
        conexaoDB.desconectar();
        return medico;
    }
    
    public ArrayList<Medico> buscarTodosMedicos(ConexaoDB conexaoDB) throws SQLException, NullPointerException{
        Connection conexao = conexaoDB.conectar();
        
        String query = "select * from medico";
        PreparedStatement stmt = conexao.prepareStatement(query);
        
        ResultSet result = stmt.executeQuery();
        
        ArrayList<Medico> listaMedicos = new ArrayList<>();
       
        while (result.next()) {
            Medico medico = new Medico();    
    
            medico.setCrm(result.getInt("crm"));
            medico.setNome(result.getString("nome"));
            medico.setCpf(result.getString("cpf"));
            medico.setEmail(result.getString("email"));
            medico.setNumCelular(result.getString("numCelular"));
            //medico.setSenha(result.getString("senha"));
            medico.setDataNascimento(result.getDate("dataNascimento"));    
            listaMedicos.add(medico);
        }
        conexaoDB.desconectar();
        return listaMedicos;
    }

    public boolean deleteMedico(ConexaoDB conexaoDB, int crm) throws SQLException, NullPointerException{
        Connection conexao = conexaoDB.conectar();
        
        String query = "delete from medico where crm = ?"; 
        PreparedStatement stmt = conexao.prepareStatement(query);
        stmt.setInt(1, crm);
        
        int row = stmt.executeUpdate();
        System.out.println("rows deleted -> " + row);
        conexaoDB.desconectar();
        return row > 0;
    }    
    
        public boolean CadastrarMedico(ConexaoDB conexaoDB, Medico medico) throws SQLException, NullPointerException{
        Connection conexao = conexaoDB.conectar();
        
        String query = "insert into medico(crm, nome, cpf, email, numCelular, senha, dataNascimento) values" +
                "(?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement stmt = conexao.prepareStatement(query);
        
        stmt.setInt(1, medico.getCrm());
        stmt.setString(2, medico.getNome());
        stmt.setString(3, medico.getCpf());
        stmt.setString(4, medico.getEmail());
        stmt.setString(5, medico.getNumCelular());
        stmt.setString(6, medico.getSenha());
        stmt.setDate(7, new java.sql.Date(medico.getDataNascimento().getTime()));
        
        
        int row = stmt.executeUpdate();
        System.out.println("rows inserted -> " + row);
        conexaoDB.desconectar();
        return row > 0;
    }
    
    public boolean AtualizarMedico(ConexaoDB conexaoDB, Medico medico, int crm) throws SQLException, NullPointerException
    {
        Connection conexao = conexaoDB.conectar();
        
        String query = "update medico set " +
                "nome = ?, cpf = ?, email = ?, numCelular = ?, senha = ?, dataNascimento = ? where crm = ?";
        
        PreparedStatement stmt = conexao.prepareStatement(query);
        
        stmt.setString(1, medico.getNome());
        stmt.setString(2, medico.getCpf());
        stmt.setString(3, medico.getEmail());
        stmt.setString(4, medico.getNumCelular());
        stmt.setString(5, medico.getSenha());
        stmt.setDate(6, new java.sql.Date(medico.getDataNascimento().getTime()));
        stmt.setInt(7, crm);
        
        int row = stmt.executeUpdate();
        System.out.println("rows updated -> " + row);
        conexaoDB.desconectar();
        return row > 0;
    }
    
    public ArrayList<Medico> buscarMedico (ConexaoDB conexaoDB, String nome, int crm) throws SQLException, NullPointerException{
        Connection conexao = conexaoDB.conectar();
        
        String query = "select * from medico where (nome like %?% or nome = '') and (crm = ? or ? = 0)";
        PreparedStatement stmt = conexao.prepareStatement(query);
        
        stmt.setString(1, nome);
        stmt.setInt(2, crm);
        stmt.setInt(3, crm);
        
        ResultSet result = stmt.executeQuery();
        
        ArrayList<Medico> listaMedicos = new ArrayList<>();
       
        while (result.next()) {
            Medico medico = new Medico();    
    
            medico.setCrm(result.getInt("crm"));
            medico.setNome(result.getString("nome"));
            medico.setCpf(result.getString("cpf"));
            medico.setEmail(result.getString("email"));
            medico.setNumCelular(result.getString("numCelular"));
            //medico.setSenha(result.getString("senha"));
            medico.setDataNascimento(result.getDate("dataNascimento"));    
            listaMedicos.add(medico);
        }
        conexaoDB.desconectar();
        return listaMedicos;
    }
}
