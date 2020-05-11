package atividade05;
public class Reserva {
    
    private final Data data;
    private final Sala sala;
    private final Turma turma;
    private final Funcionario funcionatio;
    private final Professor professor;
    private final Hora horarioInicio, horarioFim;

    public Reserva(Data data, Sala sala, Turma turma, Funcionario funcionatio, Professor professor, Hora horarioInicio, Hora horarioFim) {
        this.data = data;
        this.sala = sala;
        this.turma = turma;
        this.funcionatio = funcionatio;
        this.professor = professor;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }
    
    
}
