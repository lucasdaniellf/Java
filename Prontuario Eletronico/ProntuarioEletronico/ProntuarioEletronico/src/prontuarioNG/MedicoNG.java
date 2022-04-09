package prontuarioNG;

import Excecoes.MedicoException;
import prontuarioAD.MedicoAD;
import prontuarioConfig.ConexaoDB;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Medico;

public class MedicoNG {

    public Medico fazerLogin(ConexaoDB conexaoDB, MedicoAD loginAD, int crm, String senha) throws MedicoException {
        Medico medico;
        try 
        {
            medico = loginAD.fazerLogin(conexaoDB, crm, senha);
            if(medico.getCrm() == 0) {
                throw new MedicoException(0);
            }
        } 
        catch(NumberFormatException ex) 
        {
            throw new MedicoException(-1);
        } 
        catch (SQLException ex)
        {
            System.out.println("Erro de Banco de Dados: " + ex.getMessage());
            throw new MedicoException(-2);
        }
        catch (NullPointerException ex)
        {
            throw new MedicoException(-400);
        }
        return medico;    
    }
    
    public ArrayList<Medico> buscarMedicos(ConexaoDB conexaoDB, MedicoAD medicoAD) throws MedicoException{
        try {
            return medicoAD.buscarTodosMedicos(conexaoDB);
        } catch (SQLException ex) {

            System.out.println("Erro de Banco de Dados: " + ex.getMessage());
            throw new MedicoException(-2);
                       
        } catch (NullPointerException ex) {
            throw new MedicoException(-400);
        }
    }
    
    public boolean cadastrarMedico(ConexaoDB conexaoDB, MedicoAD medicoAD, Medico medico) throws MedicoException{
        try {
            return medicoAD.CadastrarMedico(conexaoDB, medico);
        } catch (SQLException ex){
            System.out.println("Erro de Banco de Dados: " + ex.getMessage());
            throw new MedicoException(-2);
        } catch (NullPointerException ex) {
            throw new MedicoException(400);
        }
    }
    
    public boolean atualizarMedico(ConexaoDB conexaoDB, MedicoAD medicoAD, Medico medico, int crm) throws MedicoException{
        try {
            return medicoAD.AtualizarMedico(conexaoDB, medico, crm);
        } catch (SQLException ex){
            throw new MedicoException(-2);
        } catch (NullPointerException ex) {
            throw new MedicoException(400);
        }
    }
    
    public boolean deleteMedico(ConexaoDB conexaoDB, MedicoAD medicoAD, int CRM) throws MedicoException{
        try {
            return medicoAD.deleteMedico(conexaoDB, CRM);
        } catch (SQLException ex){
            throw new MedicoException(-2);
        } catch (NullPointerException ex) {
            throw new MedicoException(400);
        }
    }
}