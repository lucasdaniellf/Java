package Escola_Atividade;

public class Aluno {
    private int codigo_aluno;
    private String nome_aluno;


    public Aluno(int codigo_aluno, String nome_aluno) {
        setCodigo_aluno(codigo_aluno);
        setNome_aluno(nome_aluno);
    }

    public int getCodigo_aluno() {
        return codigo_aluno;
    }
    public void setCodigo_aluno(int codigo_aluno) {
        this.codigo_aluno = codigo_aluno;
    }
    public String getNome_aluno() {
        return nome_aluno;
    }
    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    @Override
    public String toString() {
        return "Codigo Aluno: " + codigo_aluno + " - Nome do Aluno: " + nome_aluno;
    }

}
