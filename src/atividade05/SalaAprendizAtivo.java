package atividade05;
public class SalaAprendizAtivo extends Sala{

    private final int qtMesa, qtCadeira, qtPontoLuz;

    public SalaAprendizAtivo(int qtMesa, int qtCadeira, int qtPontoLuz, int num,
            int qtAluno, float larfura, float profundidade, boolean dataShow, boolean caixaSom) {
        super(num, qtAluno, larfura, profundidade, dataShow, caixaSom);
        this.qtMesa = qtMesa;
        this.qtCadeira = qtCadeira;
        this.qtPontoLuz = qtPontoLuz;
    }

    @Override
    public void calcCapacidade(){
        super.vagas = (this.qtMesa * this.qtCadeira)- super.qtAluno; 
    }
    
    /**
     * @return the qtMesa
     */
    public int getQtMesa() {
        return qtMesa;
    }

    /**
     * @return the qtCadeira
     */
    public int getQtCadeira() {
        return qtCadeira;
    }

    /**
     * @return the qtPontoLuz
     */
    public int getQtPontoLuz() {
        return qtPontoLuz;
    }
}
