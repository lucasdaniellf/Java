package prontuarioNG;

import Excecoes.PacienteException;
import java.util.ArrayList;
import model.Paciente;
import prontuarioAD.PacienteAD;
import prontuarioConfig.ConexaoDB;
import java.sql.SQLException;


public class PacienteNG {
    public ArrayList<Paciente> buscarTodosPacientes(ConexaoDB conexaoDB, PacienteAD pacienteAD) throws PacienteException{
        try {
            return pacienteAD.buscarTodosPacientes(conexaoDB);
        } catch (SQLException ex) {
            System.out.println("Erro de Banco de Dados: " + ex.getMessage());
            throw new PacienteException(-2);
                       
        } catch (NullPointerException ex) {
            throw new PacienteException(-400);
        }
    }
    
    public ArrayList<Paciente> buscarPacientesPorNome(ConexaoDB conexaoDB, PacienteAD pacienteAD, String nome) throws PacienteException{
        try {
            return pacienteAD.buscarPaciente(conexaoDB, nome);
        } catch (SQLException ex) {
            System.out.println("Erro de Banco de Dados: " +  ex.getMessage());
            throw new PacienteException(-2);
                       
        } catch (NullPointerException ex) {
            throw new PacienteException(-400);
        }
    }
    
    public Paciente buscarPacientePorID(ConexaoDB conexaoDB, PacienteAD pacienteAD, int id) throws PacienteException{
        try {
            return pacienteAD.buscarPacientePorID(conexaoDB, id);
        } catch (SQLException ex) {
            System.out.println("Erro de Banco de Dados: " + ex.getMessage());
            throw new PacienteException(-2);
                       
        } catch (NullPointerException ex) {
            throw new PacienteException(-400);
        }
    }
    
    public boolean cadastrarPaciente(ConexaoDB conexaoDB, PacienteAD pacienteAD, Paciente paciente) throws PacienteException{
        try {
            return pacienteAD.CadastrarPaciente(conexaoDB, paciente);
        } catch (SQLException ex){
            throw new PacienteException(-2);
        } catch (NullPointerException ex) {
            throw new PacienteException(400);
        }
    }
    
    public boolean atualizarPaciente(ConexaoDB conexaoDB, PacienteAD pacienteAD, Paciente paciente) throws PacienteException{
        try {
            return pacienteAD.AtualizarPaciente(conexaoDB, paciente);
        } catch (SQLException ex){
            throw new PacienteException(-2);
        } catch (NullPointerException ex) {
            throw new PacienteException(400);
        }
    }
    
    public boolean deletePaciente(ConexaoDB conexaoDB, PacienteAD pacienteAD, int id) throws PacienteException{
        try {
            return pacienteAD.deletePaciente(conexaoDB, id);
        } catch (SQLException ex){
            throw new PacienteException(-2);
        } catch (NullPointerException ex) {
            throw new PacienteException(400);
        }
    }
}
