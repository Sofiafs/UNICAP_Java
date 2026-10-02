package Simulado1GQ;

public class Inimigo{
    private String nome;
    private double vida;
    private String situacao;
    private int recompensa;

    //GETS E SETS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    //CONSTRUTOR
    public Inimigo(String nome, double vida, String situacao, int recompensa) {
        this.nome = nome;
        this.vida = vida;
        this.situacao = situacao;
        this.recompensa = recompensa;
    }
}