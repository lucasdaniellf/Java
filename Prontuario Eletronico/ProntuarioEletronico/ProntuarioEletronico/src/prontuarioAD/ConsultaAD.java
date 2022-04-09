package prontuarioAD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Consulta;
import prontuarioConfig.ConexaoDB;

public class ConsultaAD {
    
    
    public ArrayList<Consulta> BuscarConsultasPorMedico(ConexaoDB conexaoDB, int crm) throws SQLException {
        Connection conexao = conexaoDB.conectar();
        ArrayList<Consulta> listaConsultas = new ArrayList();
        
        String query = "select * from consulta where crm = ?";
        PreparedStatement stmt = conexao.prepareStatement(query);
        
        stmt.setInt(1, crm);        
        ResultSet result = stmt.executeQuery();
        
        if (result.next()) {
            Consulta consulta = new Consulta();
            consulta.setIdConsulta(result.getInt("idConsulta"));
            consulta.setCrmMedico(result.getInt("crm"));
            consulta.setIdPaciente(result.getInt("idPaciente"));
            consulta.setDataConsulta(result.getDate("dataConsulta"));
            consulta.setDescricao(result.getString("descricao"));
            
            listaConsultas.add(consulta);
        }
        conexaoDB.desconectar();
        return listaConsultas;
    }
    
        public ArrayList<Consulta> BuscarConsultasPorPaciente(ConexaoDB conexaoDB, int idPaciente) throws SQLException {
        Connection conexao = conexaoDB.conectar();
        ArrayList<Consulta> listaConsultas = new ArrayList();
        
        String query = "select * from consulta where idpaciente = ?";
        PreparedStatement stmt = conexao.prepareStatement(query);
        
        stmt.setInt(1, idPaciente);        
        ResultSet result = stmt.executeQuery();
        
        if (result.next()) {
            Consulta consulta = new Consulta();
            consulta.setIdConsulta(result.getInt("idConsulta"));
            consulta.setCrmMedico(result.getInt("crm"));
            consulta.setIdPaciente(result.getInt("idPaciente"));
            consulta.setDataConsulta(result.getDate("dataConsulta"));
            consulta.setDescricao(result.getString("descricao"));
            
            listaConsultas.add(consulta);
        }
        conexaoDB.desconectar();
        return listaConsultas;
    }
    
        public Consulta BuscarConsulta(ConexaoDB conexaoDB, int idConsulta) throws SQLException {
        Connection conexao = conexaoDB.conectar();
        
        String query = "select * from consulta where idConsulta = ?";
        PreparedStatement stmt = conexao.prepareStatement(query);
        
        stmt.setInt(1, idConsulta);        
        ResultSet result = stmt.executeQuery();
        Consulta consulta = new Consulta();

        if (result.next()) {
            consulta.setIdConsulta(result.getInt("idConsulta"));
            consulta.setCrmMedico(result.getInt("crm"));
            consulta.setIdPaciente(result.getInt("idPaciente"));
            consulta.setDataConsulta(result.getDate("dataConsulta"));
            consulta.setDescricao(result.getString("descricao"));
        }
        conexaoDB.desconectar();
        return consulta;
    }
        
    public boolean inserirConsulta(ConexaoDB conexaoDB, Consulta consulta) throws SQLException, NullPointerException{
        Connection conexao = conexaoDB.conectar();
        
        String query = "insert into Consulta(crm, idPaciente, dataConsulta, descricao) " +
                       "values (?, ?, ?, ?)";
        
        PreparedStatement stmt = conexao.prepareStatement(query);
        
        stmt.setInt(1, consulta.getCrmMedico());
        stmt.setInt(2, consulta.getIdPaciente());
        stmt.setDate(3, new java.sql.Date(consulta.getDataConsulta().getTime()));
        stmt.setString(4, consulta.getDescricao());
        
        int row = stmt.executeUpdate();
        System.out.println("rows inserted -> " + row);
        conexaoDB.desconectar();
        return row > 0;
    }
    
    public boolean AtualizarConsulta (ConexaoDB conexaoDB, Consulta consulta) throws SQLException, NullPointerException
    {
        Connection conexao = conexaoDB.conectar();
        
        String query = "update consulta set " +
                "crm = ?, idPaciente = ?, dataConsulta = ?, descricao = ? where idconsulta = ?";
        PreparedStatement stmt = conexao.prepareStatement(query);
        
        stmt.setInt(1, consulta.getCrmMedico());
        stmt.setInt(2, consulta.getIdPaciente());
        stmt.setDate(3, new java.sql.Date(consulta.getDataConsulta().getTime()));
        stmt.setString(4, consulta.getDescricao());
         stmt.setInt(5, consulta.getIdConsulta());
        
        int row = stmt.executeUpdate();
        System.out.println("rows updated -> " + row);
        conexaoDB.desconectar();
        return row > 0;
    }
    
        public boolean deleteConsulta(ConexaoDB conexaoDB, int idConsulta) throws SQLException, NullPointerException{
        Connection conexao = conexaoDB.conectar();
        
        String query = "delete from consulta where idConsulta = ?"; 
        PreparedStatement stmt = conexao.prepareStatement(query);
        stmt.setInt(1, idConsulta);
        
        int row = stmt.executeUpdate();
        System.out.println("rows deleted -> " + row);
        conexaoDB.desconectar();
        return row > 0;
    }  
}
