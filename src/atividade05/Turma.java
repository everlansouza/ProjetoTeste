package atividade05;
public class Turma {

    private final Curso curso;
    private final String turno, periudo;
    private final int qtAlunos;

    public Turma(Curso curso, String turno, String periudo, int qtAlunos) {
        this.curso = curso;
        this.turno = turno;
        this.periudo = periudo;
        this.qtAlunos = qtAlunos;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @return the periudo
     */
    public String getPeriudo() {
        return periudo;
    }

    /**
     * @return the qtAlunos
     */
    public int getQtAlunos() {
        return qtAlunos;
    }
    
    
}
