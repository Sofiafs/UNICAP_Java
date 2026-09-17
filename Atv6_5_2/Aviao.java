package Atv6_5_2;

public class Aviao extends Veiculo{
    public boolean voando;
    
    public boolean isVoando() {
        return voando;
    }

    public void setVoando(boolean voando) {
        this.voando = voando;
    }

    public Aviao(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual, double litragemTanque, double velocidadeMax,boolean voando){
        super(marca, estado, tanque, consumo, velocidadeAtual, litragemTanque, velocidadeMax);
        this.voando = voando;
    }

    public void chavear(){
        if(estado == true){
            if(voando == true){
                System.out.println("O avião da marca está ligado");
            }
        } if(estado == false){
            if(voando == true){
                System.out.println("O avião não pode desligar estando em movimento");
            } else{
                System.out.println("Avião desligado");
            }
        }
    }

    public void voar(){
        if(voando == true){
            if(velocidadeAtual >= 200){
                System.out.println("Vai voar! pode ultrapassar a velocidade máxima");
            } else{
                System.out.println("Não pode voar");
            }
        } else{
            System.out.println("Veiculo não levantou voo");
        }
    }
    public void acelerar(){
        if(velocidadeAtual > 200){
            velocidadeAtual = velocidadeAtual + 20;
            System.out.println("A velocidade atual é de " + getVelocidadeAtual() +" km/h");
        } else{
            System.out.println("Limite de velocidade máxima");
        }
    }

    public void frear(){
        if (velocidadeAtual != 0){
            while (velocidadeAtual > 200) {
                velocidadeAtual = velocidadeAtual - 10;
            }
            if(velocidadeAtual == 200){
                System.out.println("Pode continuar voando");
            } if(velocidadeAtual < 200){
                System.out.println("O avião irá pousar");
            }
        }
    }
    public void corrida(int distancia){
        if(voando == true){
            double litragemNecessaria = distancia * getConsumo();

            if (litragemNecessaria > litragemTanque) {
                double kmPossiveis = litragemTanque / getConsumo();
                double kmFaltando = distancia - kmPossiveis;

                velocidadeAtual = 0;
                litragemTanque = 0;

                System.out.println("Combustível insuficiente.");
                System.out.println("O avião realizou um pouso emergencial.");
                System.out.println("Faltaram " + kmFaltando + " km para completar a distância.");
            } else {
                litragemTanque -= litragemNecessaria;

                System.out.println("Voo realizado com sucesso.");
            }
        } else{
            System.out.println("Avião desligado");
        }
    }
}
