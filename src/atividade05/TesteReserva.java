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
        
        
        
    }
    
}
