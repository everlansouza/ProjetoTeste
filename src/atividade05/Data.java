package atividade05;
public class Data {
    
    private final int dia, mes, ano;
    private String dataFormatada;
    
    public Data(int dia,int mes,int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void foratarData(){
        this.dataFormatada = this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    public String getDataFormatada(){
        return this.dataFormatada;
    }
}
