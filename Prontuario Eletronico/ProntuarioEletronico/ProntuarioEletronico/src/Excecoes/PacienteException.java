/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecoes;

/**
 *
 * @author lucas
 */
public class PacienteException extends Exception {
    
    private final int codigoErro;
    private final String mensagemErro;
    
    public PacienteException(int codigoErro) {
        this.codigoErro = codigoErro;
        
        switch(this.codigoErro) {
            case -400 -> {
                this.mensagemErro = "Erro de Referência Nula, Informe ao Suporte";
            }
            case -2 ->  {
                this.mensagemErro = "Erro de Banco de Dados, Informe ao Suporte";
            }
            case 3 ->  {
                this.mensagemErro = "Formato de Campo Inválido (Nome)";
            }
            case 0 ->  {
                this.mensagemErro = "Paciente não localizado";
            }
            default -> {
                this.mensagemErro = "Erro desconhecido, reporte o suporte";
            }
        }
    }
    
    public int getCodigoErro() {
        return codigoErro;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }
    
}
