package Atv6_5_2;

public class Carro extends Veiculo{
    private String placa;


    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public Carro(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual, double litragemTanque, double velocidadeMax,String placa){
        super(marca, estado, tanque, consumo, velocidadeAtual, litragemTanque, velocidadeMax);
        this.placa = placa;
    }

    public void chavear(){
        if(estado == true){
            System.out.println("O carro da marca " + marca + " está ligado");
        }if(estado == false){
            System.out.println("O carro da marca " + marca + " está desligado");
            if(velocidadeAtual > 0){
                System.out.println("O carro está desligado porém com a velocidade acima de zero, zerando: ");
                while(velocidadeAtual != 0){
                    frear();
                }
            }
        }
        
    }

    public void acelerar(){
        if(velocidadeAtual < 60){
            velocidadeAtual = velocidadeAtual + 10;
            System.out.println("A velocidade atual é de " + getVelocidadeAtual() +" km/h");
        } else{
            System.out.println("Limite de velocidade máxima");
        }
    }

    public void frear(){
        if (velocidadeAtual != 0){
            velocidadeAtual = velocidadeAtual - 5;
            System.out.println("Velocidade atual: " + getVelocidadeAtual());
        } else{
            System.out.println("Carro parado");
        }
    }

    public void corrida(int distancia){
        double litragemNecessaria = distancia * getConsumo();

        if(litragemNecessaria > litragemTanque){
            double kmPossiveis = litragemTanque / getConsumo();
            double kmFaltando = distancia - kmPossiveis;

            velocidadeAtual = 0;
            litragemTanque = 0;

            System.out.println("A litragem necessária (" + litragemNecessaria + ") ultrapassa a disponível (" + getLitragemTanque() + " antes de zerar).");
            System.out.println("Faltam " + kmFaltando + " km para completar a corrida.");
        } else {
            litragemTanque = litragemTanque - litragemNecessaria;
        }
    }
}
