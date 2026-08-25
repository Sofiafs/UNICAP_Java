package Atv45;

public class Sala {
    private String nome;
    private boolean ocupada;
    private Aluno[] turma = new Aluno[10];
    private int diaDeAula;
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public boolean isOcupada() {
        return ocupada;
    }
 
    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
 
    public Aluno[] getTurma() {
        return turma;
    }
 
    public void setTurma(Aluno[] turma) {
        this.turma = turma;
    }
 
    public int getDiaDeAula() {
        return diaDeAula;
    }
 
    public void setDiaDeAula(int diaDeAula) {
        this.diaDeAula = diaDeAula;
    }
 
    public Sala(String nome, Aluno[] turma) {
        this.nome = nome;
        this.turma = turma;
        this.ocupada = false;
        this.diaDeAula = 0;
    }
 
    public void alternar() {
        if (this.ocupada == false) {
            this.ocupada = true;
        } else {
            this.ocupada = false;
        }
    }
}