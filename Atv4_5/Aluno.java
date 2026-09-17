package Atv4_5;

public class Aluno {
    private String nome;
    private int idade;
    private int matricula;
    private Boolean[] presenca = new Boolean[10];
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public int getIdade() {
        return idade;
    }
 
    public void setIdade(int idade) {
        this.idade = idade;
    }
 
    public int getMatricula() {
        return matricula;
    }
 
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
 
    public Boolean[] getPresenca() {
        return presenca;
    }
 
    public void setPresenca(Boolean[] presenca) {
        this.presenca = presenca;
    }
 
    public Aluno(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
}