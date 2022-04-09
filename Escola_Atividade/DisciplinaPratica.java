package Escola_Atividade;

public class DisciplinaPratica extends Disciplina {

    private int carga_horaria_pratica;

    public DisciplinaPratica(int codigo_disciplina, String nome_disciplina, int carga_horaria, int carga_horaria_pratica) {
        super(codigo_disciplina, nome_disciplina, carga_horaria);
        setCarga_horaria_pratica(carga_horaria_pratica);
    }

    public int getCarga_horaria_pratica() {
        return carga_horaria_pratica;
    }

    public void setCarga_horaria_pratica(int carga_horaria_pratica) {
        this.carga_horaria_pratica = carga_horaria_pratica;
    }

    @Override
    public String toString() {
        return "Nome da Disciplina: " + nome_disciplina + " - Codigo da Disciplina: " + codigo_disciplina + " - Carga Horaria: " + carga_horaria + " - Carga Horaria Pratica: " + carga_horaria_pratica ;
    }
}
