package atividade05;
public class TesteReserva {
    public static void main(String[] args) {

        //Teste1
        Sala s1 = new Sala(12, 60, 45, 10.0f, 11.10f, true, true);
        s1.calcCapacidade();
        System.out.println("Vagas na Sala 12: " + s1.getVagas());
        
        //Teste2
        Sala s2 = new Sala(16, 60, 61, 10.0f, 11.10f, true, true);
        s2.calcCapacidade();
        System.out.println("Vagas na Sala 16: " + s2.getVagas());
        
        //Teste3
        Laboratorio L1 = new Laboratorio(30, 1, 45, 4, 500, 2.5f, "Windows 10", 12, 10.0f, 11.10f, true, true);
        L1.calcCapacidade();
        System.out.println("Vagas Laboratorio: " + L1.getVagas());
        
        //Teste4
        Laboratorio L2 = new Laboratorio(30, 2, 58, 4, 500, 2.5f, "Windows 10", 12, 10.0f, 11.10f, true, true);
        L2.calcCapacidade();
        System.out.println("Vagas Laboratorio: " + L2.getVagas());
        
        //Teste5
        SalaAprendizAtivo saa = new SalaAprendizAtivo(10, 6, 15, 37, 45, 10.0f, 11.10f, true, true);
        saa.calcCapacidade();
        System.out.println("Vagas Sala Aprendiz Ativo: " + saa.getVagas());
        System.out.println("\n\n");
        
        //instanciar as outras casses
        Data d = new Data(14,05,2020);
        d.foratarData();
        
        Curso c = new Curso("ADS","ADS04B");
        
        Turma t = new Turma(c, "Noturno", "4°", 45);
        
        Funcionario f = new Funcionario(3131, 934478521, "José", "jose@gmail");
        
        Professor p = new Professor("POO", c, 1313, 988883333, "Vinicius", "vinicius@gmail");
        
        Hora inicio = new Hora(20, 50);
        inicio.formatarHora();

        Hora fim = new Hora(22, 20);
        fim.formatarHora();
        
        Reserva r = new Reserva(d, s1, c, t, f, p, inicio, fim);
        //Informações da Reserva
        System.out.println(r.informaçõesReserva());
        
    }
    
}
