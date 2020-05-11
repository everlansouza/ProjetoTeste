package atividade05;
public class Laboratorio extends Sala{

    private final int qtComputador, qtAlunoPorPC, memRAM, hd;
    private final float veloxidadeCPU;
    private final String sistemaOperacional;

    public Laboratorio(int qtComputador, int qtAlunoPorPC, int memRAM, int hd, float veloxidadeCPU, String sistemaOperacional, int num, int capacidade, float larfura, boolean dataShow, boolean caixaSom) {
        super(num, capacidade, larfura, dataShow, caixaSom);
        this.qtComputador = qtComputador;
        this.qtAlunoPorPC = qtAlunoPorPC;
        this.memRAM = memRAM;
        this.hd = hd;
        this.veloxidadeCPU = veloxidadeCPU;
        this.sistemaOperacional = sistemaOperacional;
    }
    
    
}
