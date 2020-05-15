package atividade05;
public class Data {
    
    //private final int dia, mes, ano;
    private final String dataFormatada;
    
    public Data(int dia,int mes,int ano){
        this.dataFormatada = dia + "/" + mes + "/" + ano;
    }
    
    public String getDataFormatada(){
        return this.dataFormatada;
    }
}
