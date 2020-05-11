package atividade05;
public class Hora {

    private final int hr, min;
    private String formatarHora;
    
    public Hora(int hr, int min) {
        this.hr = hr;
        this.min = min;
    }
    
    public String formatarHora(){
        this.formatarHora = this.hr + ":" + this.min;
        return this.formatarHora;
    }
    
    public String getFormatarHora(){
        return this.formatarHora;
    }
}
