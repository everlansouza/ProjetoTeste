package atividade05;
public class Professor extends Funcionario{
    
    private final String materia;
    private final Curso curso;

    public Professor(String materia, Curso curso, 
            int matricula, int telefone, String nome, 
            String email) {
        super(matricula, telefone, nome, email);
        this.materia = materia;
        this.curso = curso;
    }

    public String getCargo() {
        return materia;
    }
    
}
