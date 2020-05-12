package atividade05;
public class Curso {
    
    private final String nome, codigo;
    
    public Curso (String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }
    
    //Saidade de dados
    public String getNome(){
        return this.nome;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
}
