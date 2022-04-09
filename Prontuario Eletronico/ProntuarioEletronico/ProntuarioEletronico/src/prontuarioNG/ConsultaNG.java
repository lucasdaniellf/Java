/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prontuarioNG;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Consulta;
import prontuarioAD.ConsultaAD;
import prontuarioConfig.ConexaoDB;

public class ConsultaNG {
    public ArrayList<Consulta> BuscarConsultasPorMedico(ConexaoDB conexaoDB, ConsultaAD consultaAD, int crm){
        try {
            return consultaAD.BuscarConsultasPorMedico(conexaoDB, crm);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaNG.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }
    
    public ArrayList<Consulta> BuscarConsultasPorPaciente(ConexaoDB conexaoDB, ConsultaAD consultaAD, int id){
        try {
            return consultaAD.BuscarConsultasPorPaciente(conexaoDB, id);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaNG.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }
    
    public Consulta BuscarConsulta(ConexaoDB conexaoDB, ConsultaAD consultaAD, int idConsulta){
        try {
            return consultaAD.BuscarConsulta(conexaoDB, idConsulta);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaNG.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public boolean inserirConsulta(ConexaoDB conexaoDB, ConsultaAD consultaAD, Consulta consulta){
        try {
            return consultaAD.inserirConsulta(conexaoDB, consulta);
        } catch (SQLException | NullPointerException ex) {
            Logger.getLogger(ConsultaNG.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean atualizarConsulta(ConexaoDB conexaoDB, ConsultaAD consultaAD, Consulta consulta){
        try {
            return consultaAD.AtualizarConsulta(conexaoDB, consulta);
        } catch (SQLException | NullPointerException ex) {
            Logger.getLogger(ConsultaNG.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean deleteConsulta(ConexaoDB conexaoDB, ConsultaAD consultaAD, int id){
        try {
            return consultaAD.deleteConsulta(conexaoDB, id);
        } catch (SQLException | NullPointerException ex) {
            Logger.getLogger(ConsultaNG.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
