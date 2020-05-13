package atividade05;
public class Reserva {
    
    private final Data data;
    private final Sala sala;
    private final Curso curso;
    private final Turma turma;
    private final Funcionario funcionatio;
    private final Professor professor;
    private final Hora horarioInicio, horarioFim;

    public Reserva(Data data, Sala sala, Curso curso, Turma turma, Funcionario funcionatio, Professor professor, Hora horarioInicio, Hora horarioFim) {
        this.data = data;
        this.sala = sala;
        this.curso = curso;
        this.turma = turma;
        this.funcionatio = funcionatio;
        this.professor = professor;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }
    
    public String informaçõesReserva(){
        String impressao ;
        impressao = "Data: " + data.getDataFormatada() + 
                "\n" +
                    "Dados de Sala: "  +
                    "\n     Número: " + sala.getNum() +
                    "\n     Largura: " + sala.getLarfura() +
                    "\n     Profundidade: " + sala.getProfundidade() + 
                    "\n     Capacidade: " + sala.getCapacidade() +
                    "\n     Quantidade Aulunos Matriculador: " + sala.getQtAluno()+
                    "\n     Vagas Restantes: " + sala.getVagas() + 
                "\n" + 
                    "Dados de Curso: "  +
                    "\n     Nome do Curso: " + curso.getNome() +
                    "\n     Nome do Código: " + curso.getCodigo() +
                "\n" +
                    "Dados de Turma: "  +
                    "\n     Perildo: " + turma.getPeriudo() +
                    "\n     Turno: " + turma.getTurno() +
                    "\n     Perildo: " + turma.getQtAlunos()+ 
                "\n" +
                    "Funcionario: "  +
                    "\n     Nome: " + funcionatio.getNome()+
                    "\n     Matricula: " + funcionatio.getMatricula()+
                    "\n     Email: " + funcionatio.getEmail()+
                    "\n     telefone: " + funcionatio.getTelefone()+
                "\n" +
                    "Professor: "  +
                    "\n     Nome: " + professor.getNome()+
                    "\n     Matricula: " + professor.getMatricula()+
                    "\n     Cargo: " + professor.getCargo()+
                    "\n     Email: " + professor.getEmail()+
                    "\n     telefone: " + professor.getTelefone()+
                "\n" +
                    "Horario Inicio: "  + horarioInicio.getFormatarHora()+
                "\n" +
                "Horario Inicio: "  + horarioFim.getFormatarHora() ;
        return impressao;
    }
}
