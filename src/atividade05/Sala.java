package atividade05;
public class Sala {

    private final int num; 
    private int capacidade = 0;
    public int vagas, qtAluno;
    private final float largura, profundidade;
    private final boolean dataShow, caixaSom;

    public Sala(int num, int capacidade, int qtAluno, float larfura, float profundidade, boolean dataShow, boolean caixaSom) {
        this.num = num;
        this.qtAluno = qtAluno;
        this.capacidade = capacidade;
        this.largura = larfura;
        this.profundidade = profundidade;
        this.dataShow = dataShow;
        this.caixaSom = caixaSom;
    }
    
    public Sala(int num,int qtAluno, float larfura, float profundidade, boolean dataShow, boolean caixaSom) {
        this.num = num;
        this.qtAluno = qtAluno;
        this.largura = larfura;
        this.profundidade = profundidade;
        this.dataShow = dataShow;
        this.caixaSom = caixaSom;
    }
    
    public void calcCapacidade(){
        this.vagas = this.capacidade - this.qtAluno;
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

    public float getProfundidade() {
        return profundidade;
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

    /**
     * @return the vagas
     */
    public int getVagas() {
        return vagas;
    }
    
    public int getQtAluno() {
        return qtAluno ;
    }
}
