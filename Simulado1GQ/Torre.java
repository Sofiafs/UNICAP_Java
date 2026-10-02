package Simulado1GQ;
import java.util.ArrayList;

public class Torre {
    private int codigo;
    private String nome;
    private double danoBase;
    private ArrayList<Inimigo> inimigosAlcancados = new ArrayList<Inimigo>();
    private boolean ativa;

    //GETS E SETS
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(double danoBase) {
        this.danoBase = danoBase;
    }

    public ArrayList<Inimigo> getInimigosAlcancados() {
        return inimigosAlcancados;
    }

    public void setInimigosAlcancados(ArrayList<Inimigo> inimigosAlcancados) {
        this.inimigosAlcancados = inimigosAlcancados;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    //CONSTRUTOR
    public Torre(int codigo, String nome, double danoBase, ArrayList<Inimigo> inimigosAlcancados, boolean ativa){
        this.codigo = codigo;
        this.nome = nome;
        this.danoBase = danoBase;
        this.inimigosAlcancados = inimigosAlcancados;
        this.ativa = ativa;
    }

    public int atacar(){
        int eliminados = 0;
        for(int i = 0; i < inimigosAlcancados.size(); i++){
            Inimigo inimigo = inimigosAlcancados.get(i);
            inimigo.setVida(inimigo.getVida() - danoBase);

            if(inimigo.getVida() > 50){
                inimigo.setSituacao("Resistente");
            } else if(inimigo.getVida() > 0){
                inimigo.setSituacao("Ferido");
            } else{
                inimigo.setSituacao("Eliminado");
                eliminados++;
            }
        }
        return eliminados;
    }
}
