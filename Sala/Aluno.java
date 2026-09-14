package Sala;

public class Aluno {
    private String nome;
    private int idade;
    public int quantidadeDisciplinas;
    public double valorDisciplina;
    
    //CONSTRUTOR
    public Aluno(String nome, int idade, int quantidadeDisciplinas, double valorDisciplina){
        this.nome = nome;
        this.idade = idade;
        this.quantidadeDisciplinas = quantidadeDisciplinas;
        this.valorDisciplina = valorDisciplina;
    }

    //GETS E SETS
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
    public int getQuantidadeDisciplinas(){
        return quantidadeDisciplinas;
    }
    public void setQuantidadeDisciplinas(int quantidadeDisciplinas){
        this.quantidadeDisciplinas = quantidadeDisciplinas;
    }
    public double getValorDisciplina(){
        return valorDisciplina;
    }
    public void setValorDisciplina(double valorDisciplina){
        this.valorDisciplina = valorDisciplina;
    }

    //METODOS
    public double mensalidade(){
        double valorFinal = quantidadeDisciplinas * valorDisciplina;
        System.out.println("O aluno " + nome + " irá pagar: " + valorFinal 
        + " por " + quantidadeDisciplinas + " disciplinas custando " 
        + valorDisciplina + " por disciplina.");
        return valorFinal;
    }
}