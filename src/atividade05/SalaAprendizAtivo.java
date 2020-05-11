package atividade05;
public class SalaAprendizAtivo extends Sala{

    private final int qtMesa, qtCadeira, qtPontoLuz;

    public SalaAprendizAtivo(int qtMesa, int qtCadeira, int qtPontoLuz, int num, int capacidade, float larfura, boolean dataShow, boolean caixaSom) {
        super(num, capacidade, larfura, dataShow, caixaSom);
        this.qtMesa = qtMesa;
        this.qtCadeira = qtCadeira;
        this.qtPontoLuz = qtPontoLuz;
    }
    
    
}
