package atividade05;
public class Laboratorio extends Sala{

    private final int qtComputador, qtAlunoPorPC, memRAM, hd; 
    private int teste;
    private final float velocidadeCPU;
    private final String sistemaOperacional;

    public Laboratorio(int qtComputador, int qtAlunoPorPC, int qtAluno, 
            int memRAM, int hd, float velocidadeCPU, String sistemaOperacional, int num, float larfura,
            float profundidade, boolean dataShow, boolean caixaSom) {
        super(num,qtAluno, larfura, profundidade, dataShow, caixaSom);
        this.qtComputador = qtComputador;
        this.qtAlunoPorPC = qtAlunoPorPC;
        this.memRAM = memRAM;
        this.hd = hd;
        this.velocidadeCPU = velocidadeCPU;
        this.sistemaOperacional = sistemaOperacional;
    }
    
    
    @Override
    public void calcCapacidade(){
        super.vagas = (this.qtComputador * this.qtAlunoPorPC)- super.qtAluno; 
    }

    public int getTeste() {
        return this.teste;
    }
    
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
