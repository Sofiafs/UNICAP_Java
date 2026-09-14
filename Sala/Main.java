package Sala;


public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 22, 6, 160.35);
        a1.mensalidade();
        Monitor m1 = new Monitor("Flavia", 25, 6, 160.35, 0.1);
        m1.mensalidade();
        m1.mensalidade(0.3);
    }
}
