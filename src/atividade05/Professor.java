package atividade05;
public class Professor extends Funcionario{
    
    private final String cargo;
    private final Curso curso;

    public Professor(String cargo, Curso curso, int matricula, int telefone, String nome, String email) {
        super(matricula, telefone, nome, email);
        this.cargo = cargo;
        this.curso = curso;
    }

    public String getCargo() {
        return cargo;
    }
}
