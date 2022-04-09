package Escola_Atividade;

public class Disciplina {
    protected int codigo_disciplina;
    protected String nome_disciplina;
    protected int carga_horaria;
    
    public Disciplina(int codigo_disciplina, String nome_disciplina, int carga_horaria) {
        setCodigo_disciplina(codigo_disciplina);
        setNome_disciplina(nome_disciplina);
        setCarga_horaria(carga_horaria);
    }

    public int getCodigo_disciplina() {
        return codigo_disciplina;
    }
    public void setCodigo_disciplina(int codigo_disciplina) {
        this.codigo_disciplina = codigo_disciplina;
    }
    public String getNome_disciplina() {
        return nome_disciplina;
    }
    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }
    public int getCarga_horaria() {
        return carga_horaria;
    }
    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    @Override
    public String toString() {
        return "Nome da Disciplina: " + nome_disciplina + " - Codigo da Disciplina: " + codigo_disciplina + " - Carga Horaria: " + carga_horaria;
    }       
}
