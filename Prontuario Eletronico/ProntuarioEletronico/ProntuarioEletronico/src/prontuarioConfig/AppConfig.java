package prontuarioConfig;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import prontuarioAD.ConsultaAD;
import prontuarioAD.MedicoAD;
import prontuarioAD.PacienteAD;
import prontuarioNG.ConsultaNG;
import prontuarioNG.MedicoNG;
import prontuarioNG.PacienteNG;

public class AppConfig {

    private static AppConfig appConfig;
    private final ConexaoDB conexaoDB;
    
    private MedicoNG medicoNG;
    private MedicoAD medicoAD;
    
    private PacienteNG pacienteNG;
    private PacienteAD pacienteAD;
    
    private ConsultaNG consultaNG;
    private ConsultaAD consultaAD;
    
    private DateFormat dateFormat;
    
    public DateFormat getDateFormat() {
        if(dateFormat == null) {
            this.dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        }
        return dateFormat;
    }

    public SimpleDateFormat getSdf() {
        if(sdf == null) {
            sdf = new SimpleDateFormat("dd/MM/yyyy");
        }
        return sdf;
    }
    private SimpleDateFormat sdf;
    
    private AppConfig() {
        conexaoDB = new ConexaoDB();
    }
    
    public static AppConfig getAppConfig() {
        if(appConfig == null) {
            appConfig = new AppConfig();
        }
        return appConfig;
    }

    public ConexaoDB getConexaoDB() {
        return conexaoDB;
    }
    //=======LOGIN PAGE BEGIN==========//
    public MedicoNG getMedicoNG() {
        if (medicoNG == null) {
            medicoNG = new MedicoNG();        
        }
        return medicoNG;
    }

    public MedicoAD getMedicoAD() {
        if(medicoAD == null) {
            medicoAD = new MedicoAD();
        }
        return medicoAD;
    }
    //=======LOGIN PAGE END==========//

    public PacienteNG getPacienteNG() {
        if (pacienteNG == null) {
            pacienteNG = new PacienteNG();        
        }
        return pacienteNG;
    }
    
    public PacienteAD getPacienteAD() {
        if (pacienteAD == null) {
            pacienteAD = new PacienteAD();        
        }
        return pacienteAD;
    }

    public ConsultaNG getConsultaNG() {
        if(this.consultaNG == null) {
            return new ConsultaNG();
        }
        return this.consultaNG;
    }

    public ConsultaAD getConsultaAD() {
        if(this.consultaAD == null){
            return new ConsultaAD();
        }
        return consultaAD;
    }   
    
}
