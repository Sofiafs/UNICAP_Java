package Sala;

public class Monitor extends Aluno{
    private double desconto;

    //GETS E SETS
    public double getDesconto(){
        return desconto;
    }

    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

    //CONSTRUTOR
    public Monitor(String nome, int idade, int quantidadeDisciplinas, double valorDisciplina, double desconto){
        super(nome, idade, quantidadeDisciplinas, valorDisciplina);
        this.desconto = desconto;
    }

    //METODOS
    public double mensalidade(){
        double valorFinal = quantidadeDisciplinas * valorDisciplina * (1 - desconto);
        System.out.println("O monitor " + getNome() + " irá pagar: " + valorFinal 
        + " por " + getQuantidadeDisciplinas() + " disciplinas custando " 
        + (getValorDisciplina() * (1 - desconto)) + " por disciplina.");
        return valorFinal;
    }

    public double mensalidade(double novoDesconto){
        double valorFinal = quantidadeDisciplinas * valorDisciplina * (1 - novoDesconto);
        System.out.println("O monitor " + getNome() + " irá pagar: " + valorFinal 
        + " por " + getQuantidadeDisciplinas() + " disciplinas custando " 
        + (getValorDisciplina() * (1 - novoDesconto)) + " por disciplina em um mês com o desconto especial.");
        return valorFinal;
    }

}

