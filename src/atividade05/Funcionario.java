package atividade05;
public class Funcionario {
    
    private final int matricula,telefone;
    private final String nome, email;

    public Funcionario(int matricula, int telefone, String nome, String email) {
        this.matricula = matricula;
        this.telefone = telefone;
        this.nome = nome;
        this.email = email;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public int getTelefone(){
        return this.telefone;
    }
    
}
