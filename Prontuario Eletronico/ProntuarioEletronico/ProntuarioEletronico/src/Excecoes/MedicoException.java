package Excecoes;

public class MedicoException extends Exception{
    private final int codigoErro;
    private final String mensagemErro;
    
    public MedicoException(int codigoErro) {
        this.codigoErro = codigoErro;
        
        switch(this.codigoErro) {
            case -400 -> {
                this.mensagemErro = "Erro de Referência Nula, Informe ao Suporte";
            }
            case -2 ->  {
                this.mensagemErro = "Erro de Banco de Dados, Informe ao Suporte";
            }
            case 1 ->  {
                this.mensagemErro = "Formato de Campo Inválido (Senha)";
            }
            case 3 ->  {
                this.mensagemErro = "Formato de Campo Inválido (Nome)";
            }
            case 4 ->  {
                this.mensagemErro = "Formato de Campo Inválido (CPF)";
            }
            case 0 ->  {
                this.mensagemErro = "Credenciais inválidas (crm e/ou senha incorretos)";
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
