package Atv46;

public class Produto {
    private String nome;
    private boolean disponibilidade;
    private String descricao;
    private double valor;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean getDisponibilidade(){
        return disponibilidade;
    }
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    public Produto(String nome,boolean disponibilidade, String descricao, double valor){
        this.nome = nome;
        this.disponibilidade = disponibilidade;
        this.descricao = descricao;
        this.valor = valor;
    }
}
