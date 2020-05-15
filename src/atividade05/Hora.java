package atividade05;
public class Hora {

    private final String formatarHora;
    
    public Hora(int hr, int min) {
        this.formatarHora = hr + ":" + min;
    }
    
    public String getFormatarHora(){
        return this.formatarHora;
    }
}
