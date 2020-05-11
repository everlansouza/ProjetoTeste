package atividade05;
public class Sala {

    private final int num; 
    private int capacidade = 0;
    private final float largura;
    private final boolean dataShow, caixaSom;

    public Sala(int num, int capacidade, float larfura, boolean dataShow, boolean caixaSom) {
        this.num = num;
        this.capacidade = capacidade;
        this.largura = larfura;
        this.dataShow = dataShow;
        this.caixaSom = caixaSom;
    }
    
    public Sala(int num, float larfura, boolean dataShow, boolean caixaSom) {
        this.num = num;
        this.largura = larfura;
        this.dataShow = dataShow;
        this.caixaSom = caixaSom;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @return the capacidade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @return the larfura
     */
    public float getLarfura() {
        return largura;
    }

    /**
     * @return the dataShow
     */
    public boolean isDataShow() {
        return dataShow;
    }

    /**
     * @return the caixaSom
     */
    public boolean isCaixaSom() {
        return caixaSom;
    }
}
