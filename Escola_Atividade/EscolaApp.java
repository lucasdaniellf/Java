package Escola_Atividade;

import java.util.Scanner;

public class EscolaApp {
    
    //Para que o aplicativo gere automaticamente o código do aluno (Da mesma forma que matrículas são geradas automaticamente
    //em sistemas de gerenciamento de matrícula)
    private int codigo_aluno = 0;
    private int codigo_disciplina = 0;

    public Disciplina[] disciplinas_escola = new Disciplina[5];
    public Aluno[] alunos_escola = new Aluno[5];
    public Matricula[] matriculas = new Matricula[15];
    private int proxima_posicao_aluno = 0;
    private int proxima_posicao_disciplina = 0;
    private int proxima_posicao_matricula = 0;

    public void adicionarAluno(String nome_aluno) {
        if (proxima_posicao_aluno < alunos_escola.length) {
            codigo_aluno++;
            alunos_escola[proxima_posicao_aluno] = new Aluno(codigo_aluno, nome_aluno );
            proxima_posicao_aluno++;
            System.out.println("Aluno Adicionado com Sucesso!");
        } else {
            System.out.println("Escola já está com o número máximo de alunos");
        }
    }

    public void mostrarAlunos() {
        for (Aluno aluno: alunos_escola) {
            if (aluno == null) return;
            System.out.println(aluno.toString());
        }
    }

    public void adicionarDisciplina(String nome_disciplina, int carga_horaria) {
        if (proxima_posicao_disciplina < disciplinas_escola.length) {
            codigo_disciplina++;
            disciplinas_escola[proxima_posicao_disciplina] = new Disciplina(codigo_disciplina, nome_disciplina, carga_horaria);
            proxima_posicao_disciplina++;
            System.out.println("Disciplina Adicionada com Sucesso!");
        } else {
            System.out.println("Escola já está com o número máximo de disciplinas");
        }
    }

    public void mostrarDisciplinas() {
        for (Disciplina disciplina: disciplinas_escola) {
            if (disciplina == null) return;
            System.out.println(disciplina.toString());
        }
    }
    
    public void adicionarDisciplinaPratica(String nome_disciplina, int carga_horaria, int carga_horaria_pratica) {
        if (proxima_posicao_disciplina < disciplinas_escola.length) {
            codigo_disciplina++;
            disciplinas_escola[proxima_posicao_disciplina] = new DisciplinaPratica(codigo_disciplina, nome_disciplina, carga_horaria, carga_horaria_pratica);
            proxima_posicao_disciplina++;
            System.out.println("Disciplina Prática Adicionada com Sucesso!");
        } else {
            System.out.println("Escola já está com o número máximo de disciplinas");
        }
    }

    public void matricularAluno(int codigo_aluno, int codigo_disciplina, int serie, int ano_letivo) {
        boolean flag = false;

        Aluno aluno_selecionado = null;
        Disciplina disciplina_selecionada = null;

        for (Aluno aluno: alunos_escola) {
            
            if (aluno == null) {
                System.out.println("Código de aluno inexistente");
                flag = true;
                break;

            } else if (aluno.getCodigo_aluno() == codigo_aluno) {
                aluno_selecionado = aluno;
                for (Disciplina disciplina: disciplinas_escola) {
                    if (disciplina == null) {
                        System.out.println("Código de disciplina inexistente");
                        flag = true;
                        break;
                    } else if (disciplina.codigo_disciplina == codigo_disciplina) {
                        disciplina_selecionada = disciplina;
                        break;
                    }
                }
                break;
            }
        }

        if (!flag) {

            boolean flag_matricula = false;

            for (Matricula matricula: matriculas) {
                if (matricula == null) {
                    matriculas[proxima_posicao_matricula] = new Matricula(aluno_selecionado, ano_letivo, serie, disciplina_selecionada);
                    proxima_posicao_matricula++;
                    System.out.println("Matrícula efetuada com Sucesso!");
                    flag_matricula = true;
                    break;
                }
                if (matricula.getAluno().getCodigo_aluno() == codigo_aluno && matricula.getAno_letivo() == ano_letivo && matricula.getDisciplina().getCodigo_disciplina() == codigo_disciplina) {
                    System.out.println("Aluno já matriculado nesta matéria no ano letivo selecionado");
                    flag_matricula = true;
                    break;
                }
            }
            if (!flag_matricula) {
                System.out.println("Escola já está com o número máximo de matriculas");
            }
        }
    }

    public void lancarNotas(int codigo_aluno, int codigo_disciplina, int ano_letivo, int bimestre, Scanner input) {

        for (Matricula matricula: matriculas) {
            if (matricula == null) {
                System.out.println("Dados incorretos, matrícula inexistente");
                break;
            } else if (matricula.getAno_letivo() == ano_letivo && matricula.getAluno().getCodigo_aluno() == codigo_aluno && matricula.getDisciplina().getCodigo_disciplina() == codigo_disciplina) {
                switch(bimestre) {
                    case 1: {
                        System.out.print("Informe a nota do aluno: ");
                        matricula.setNota1(input.nextFloat());
                        System.out.println("Nota atualizada!");
                        break;
                    }
                    case 2: {
                        System.out.print("Informe a nota do aluno: ");
                        matricula.setNota2(input.nextFloat());
                        System.out.println("Nota atualizada!");
                        break;
                    }
                    case 3: {
                        System.out.print("Informe a nota do aluno: ");
                        matricula.setNota3(input.nextFloat());
                        System.out.println("Nota atualizada!");
                        break;
                    }
                    case 4: {
                        System.out.print("Informe a nota do aluno: ");
                        matricula.setNota4(input.nextFloat());
                        System.out.println("Nota atualizada!");
                        break;
                    }
                    default: {
                        System.out.println("Bimestre inválido");
                        break;
                    }
                }
                break;
            }
        }
    }

    public void mostrarBoletim(int codigo_aluno, int ano_letivo) {
        boolean flag = false;
        Aluno aluno_selecionado = null;
        for (Aluno aluno: alunos_escola){
            if (aluno == null) {
                System.out.println("Código de aluno inexistente");
                break;
            } else if (aluno.getCodigo_aluno() == codigo_aluno) {
                aluno_selecionado = aluno;
                break;
            }
        }

        System.out.println(aluno_selecionado.toString());
        
        if (aluno_selecionado != null) {
            for (Matricula matricula: matriculas) {
                if (matricula == null) {
                    break;
                } else if (matricula.getAluno().getCodigo_aluno() == codigo_aluno && matricula.getAno_letivo() == ano_letivo) {
                    System.out.println(matricula.toString());
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Dados inválidos, aluno não possui matrícula neste ano");
            }
        }
    }


    public static void main(String[] args) {
        EscolaApp escola = new EscolaApp();
        Scanner input = new Scanner(System.in);
        

        System.out.println("---Sistema da Escola---");
        int op = 0;
        do {
            System.out.println("\nEscolha a opção desejada: ");

            System.out.println("1 - Cadastrar Disciplina");
            System.out.println("2 - Cadastrar Disciplina Prática");
            System.out.println("3 - Cadastrar Aluno");
            System.out.println("4 - Matricular Aluno em Disciplina");
            System.out.println("5 - Lançar Nota de Aluno");
            System.out.println("6 - Mostrar Alunos");
            System.out.println("7 - Mostrar Disciplinas");
            System.out.println("8 - Mostrar Boletim de Aluno");
            System.out.println("0 - Sair");
    
            op = input.nextInt();
            input.nextLine();
            switch (op) {
                case 1: {
                    System.out.print("Digite o nome da disciplina: ");
                    String nome_disciplina = input.nextLine();
                    System.out.print("Digite a carga horária da disciplina: ");
                    int carga_horaria = input.nextInt();
                    input.nextLine();
                    escola.adicionarDisciplina(nome_disciplina, carga_horaria);
                    break;
                }

                case 2: {
                    System.out.print("Digite o nome da disciplina: ");
                    String nome_disciplina = input.nextLine();
                    System.out.print("Digite a carga horária da disciplina: ");
                    int carga_horaria = input.nextInt();
                    input.nextLine();
                    System.out.print("Digite a carga horária de aulas práticas da disciplina: ");
                    int carga_horaria_pratica = input.nextInt();
                    input.nextLine();
                    escola.adicionarDisciplinaPratica(nome_disciplina, carga_horaria, carga_horaria_pratica);
                    break;
                }
                case 3: {
                    System.out.print("Digite o nome do aluno: ");
                    String nome_aluno = input.nextLine();
                    escola.adicionarAluno(nome_aluno);
                    break;
                }
                case 4: {
                    System.out.print("Digite o código do aluno: ");
                    int codigo_aluno = input.nextInt();
                    input.nextLine();
                    System.out.print("Digite o código da disciplina: ");
                    int codigo_disciplina = input.nextInt();
                    input.nextLine();
                    System.out.print("Informe o ano letivo: ");
                    int ano_letivo = input.nextInt();
                    input.nextLine();
                    System.out.print("Informe a série do aluno: ");
                    int serie = input.nextInt();
                    input.nextLine();
                    escola.matricularAluno(codigo_aluno, codigo_disciplina, serie, ano_letivo);
                    break;
                }
                case 5: {
                    System.out.print("Digite o código do aluno: ");
                    int codigo_aluno = input.nextInt();
                    input.nextLine();
                    System.out.print("Digite o código da disciplina: ");
                    int codigo_disciplina = input.nextInt();
                    input.nextLine();
                    System.out.print("Informe o ano letivo: ");
                    int ano_letivo = input.nextInt();
                    input.nextLine();
                    System.out.print("Informe o bimestre: ");
                    int bimestre = input.nextInt();
                    input.nextLine();
                    escola.lancarNotas(codigo_aluno, codigo_disciplina, ano_letivo, bimestre, input);
                    break;
                }
                case 6: {
                    escola.mostrarAlunos();
                    break;
                }
                case 7: {
                    escola.mostrarDisciplinas();
                    break;
                }
                case 8: {
                    System.out.print("Digite o código do aluno: ");
                    int codigo_aluno = input.nextInt();
                    input.nextLine();
                    System.out.print("Informe o ano letivo: ");
                    int ano_letivo = input.nextInt();
                    input.nextLine();
                    escola.mostrarBoletim(codigo_aluno, ano_letivo);
                    break;
                }
                case 0: {
                    System.out.println("Saindo...");
                    break;
                }
                
                default: {
                    System.out.println("Opção inválida, tente novamente");
                    break;
                }
            }

        } while (op != 0);
        input.close();
    }
}
