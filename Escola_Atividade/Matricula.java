package Escola_Atividade;

public class Matricula {
    
    private int ano_letivo;
    private int serie;
    private Aluno aluno;
    private Disciplina disciplina;
    private float nota1 = 0;
    private float nota2 = 0;
    private float nota3 = 0;
    private float nota4 = 0;
    
    public Matricula(Aluno aluno, int ano_letivo, int serie, Disciplina disciplina) {
        setAluno(aluno);
        setAno_letivo(ano_letivo);
        setSerie(serie);
        setDisciplina(disciplina);
    }
    
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public int getAno_letivo() {
        return ano_letivo;
    }
    public void setAno_letivo(int ano_letivo) {
        this.ano_letivo = ano_letivo;
    }

    public int getSerie() {
        return serie;
    }
    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }
    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }
    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    public float media() {
        if (disciplina instanceof DisciplinaPratica) {
            return (getNota1()+getNota2()*2+getNota3()+getNota4()*2)/(1+2+1+2);
        }
        return (getNota1()+getNota2()+getNota3()+getNota4())/4;
    }

    @Override
    public String toString() {        
        return disciplina.toString() + " - Nota 1: "+ getNota1() + " - Nota 2: "+getNota2() + 
                            " - Nota 3: "+getNota3() + " - Nota 4: " + getNota4() + " - Media: "+media();
    }

    
}
