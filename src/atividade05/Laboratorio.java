package atividade05;
public class Laboratorio extends Sala{

    private final int qtComputador, qtAlunoPorPC, memRAM, hd;
    private final float velocidadeCPU;
    private final String sistemaOperacional;

    public Laboratorio(int qtComputador, int qtAlunoPorPC, int memRAM, int hd, float veloxidadeCPU, String sistemaOperacional, int num, int capacidade, float larfura, boolean dataShow, boolean caixaSom) {
        super(num, larfura, dataShow, caixaSom);
        this.qtComputador = qtComputador;
        this.qtAlunoPorPC = qtAlunoPorPC;
        this.memRAM = memRAM;
        this.hd = hd;
        this.velocidadeCPU = veloxidadeCPU;
        this.sistemaOperacional = sistemaOperacional;
    }
    
    //Saida de dados

    /**
     * @return the qtComputador
     */
    public int getQtComputador() {
        return qtComputador;
    }

    /**
     * @return the qtAlunoPorPC
     */
    public int getQtAlunoPorPC() {
        return qtAlunoPorPC;
    }

    /**
     * @return the memRAM
     */
    public int getMemRAM() {
        return memRAM;
    }

    /**
     * @return the hd
     */
    public int getHd() {
        return hd;
    }

    /**
     * @return the veloxidadeCPU
     */
    public float getVeloxidadeCPU() {
        return velocidadeCPU;
    }

    /**
     * @return the sistemaOperacional
     */
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
    
    
}
