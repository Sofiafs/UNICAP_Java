package Simulado1GQ;
import java.util.ArrayList;

public class TorreElite extends Torre{
    private double danoCritico;

    //GET E SET
    public double getDanoCritico() {
        return danoCritico;
    }
    public void setDanoCritico(double danoCritico) {
        this.danoCritico = danoCritico;
    }
    //CONSTRUTOR
    public TorreElite(double danoCritico, int codigo, String nome, double danoBase, ArrayList<Inimigo> inimigosAlcancados, boolean ativa) {
        super(codigo, nome, danoBase, inimigosAlcancados, ativa);
        this.danoCritico = danoCritico;
    }

    public int atacar(){
        int eliminados = 0;
        for(int i = 0; i < getInimigosAlcancados().size(); i++){
            Inimigo inimigo = getInimigosAlcancados().get(i);

            if(inimigo.getSituacao().equals("Resistente")){
                inimigo.setVida(inimigo.getVida() - getDanoBase());

            } else if(inimigo.getSituacao().equals("Ferido")){
                inimigo.setVida(inimigo.getVida() - getDanoCritico());
            } else{
                continue;
            }

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

    public int atacar(ArrayList<Boolean> buffs){
        int eliminados = 0;

        for(int i = 0; i < getInimigosAlcancados().size(); i++){
            Inimigo inimigo = getInimigosAlcancados().get(i);

            double dano;

            if(inimigo.getSituacao().equals("Resistente")){
                dano = getDanoBase();
            } else{
                dano = getDanoCritico();
            }

            if(buffs.get(i) == true){
                dano += 10;
            }

            if(inimigo.getSituacao().equals("Eliminado")){
                continue;
            }

            inimigo.setVida(inimigo.getVida() - dano);

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
