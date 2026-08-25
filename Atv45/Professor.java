package Atv45;

public class Professor {
    private String nome;
    private int idade;
    private int matricula;
    private Sala sala;
 
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
 
    public Sala getSala() {
        return sala;
    }
 
    public void setSala(Sala sala) {
        this.sala = sala;
    }
 
    public Professor(String nome, int idade, int matricula, Sala sala) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.sala = sala;
    }
 
    public void iniciarAula() {
        if (this.sala.isOcupada() == false) {
            System.out.println("Aula acontecendo com o professor " + this.nome + ", matricula " + this.matricula);
            this.sala.alternar();
        } else {
            System.out.println("A sala está ocupada");
        }
    }
 
    public void chamada(boolean[] presencas) {
        Aluno[] turma = this.sala.getTurma();
        int dia = this.sala.getDiaDeAula();
        for (int i = 0; i < turma.length; i++) {
            if (turma[i] != null) {
                turma[i].getPresenca()[dia] = presencas[i];
            }
        }
    }
 
    public void terminarAula() {
        if (this.sala.isOcupada() == false) {
            System.out.println("Não existe aula nesta sala");
        } else {
            System.out.println("Aula finalizada pelo professor " + this.nome + ", matricula " + this.matricula);
            this.sala.setDiaDeAula(this.sala.getDiaDeAula() + 1);
            this.sala.alternar();
        }
    }
}
