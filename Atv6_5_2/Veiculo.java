package Atv6_5_2;

public class Veiculo {
    public String marca;
    public boolean estado;
    private double tanque;
    private double consumo;
    public double velocidadeAtual;
    public double litragemTanque;
    public double velocidadeMax;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getLitragemTanque() {
        return litragemTanque;
    }

    public void setLitragemTanque(double litragemTanque) {
        this.litragemTanque = litragemTanque;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public Veiculo(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual, double litragemTanque, double velocidadeMax){
        this.marca = marca;
        this.estado = estado;
        this.tanque = tanque;
        this.consumo = consumo;
        this.velocidadeAtual = velocidadeAtual;
        this.litragemTanque = litragemTanque;
        this.velocidadeMax = velocidadeMax;
    }

    public void chavear(){
        if(estado == true){
            System.out.println("O Veiculo da marca " + marca + " está ligado");
        } else{
            System.out.println("O Veiculo da marca " + marca + " está desligado");
        }
    }

    public void acelerar(){
        if(velocidadeAtual < 60){
            velocidadeAtual = velocidadeAtual + 1;
            System.out.println("A velocidade atual é de " + velocidadeAtual +" km/h");
        } else{
            System.out.println("Limite de velocidade máxima");
        }
    }

    public void frear(){
        if (velocidadeAtual != 0){
            velocidadeAtual = velocidadeAtual - 1;
            System.out.println("Velocidade atual: " + velocidadeAtual);
        } else{
            System.out.println("veiculo parado");
        }
    }

    public void corrida(int distancia, double gasolinaEspecial){

        if(litragemTanque + gasolinaEspecial > tanque){
            System.out.println("Erro: a quantidade de gasolina ultrapassa a capacidade do tanque");
            return;
        }

        double consumoEspecial = consumo * 0.5;
        double gasolinaEspecialNecessaria = distancia * consumoEspecial;

        if(gasolinaEspecial >= gasolinaEspecialNecessaria){

            gasolinaEspecial -= gasolinaEspecialNecessaria;

            System.out.println("Corrida realizada utilizando gasolina especial");

        } else {

            double kmComEspecial = gasolinaEspecial / consumoEspecial;
            double distanciaRestante = distancia - kmComEspecial;

            gasolinaEspecial = 0;

            double gasolinaNormalNecessaria = distanciaRestante * consumo;

            if(gasolinaNormalNecessaria > litragemTanque){

                double kmPossiveis = litragemTanque / consumo;
                double kmFaltando = distanciaRestante - kmPossiveis;

                velocidadeAtual = 0;
                litragemTanque = 0;

                System.out.println("Gasolina insuficiente");
                System.out.println("Faltam " + kmFaltando + " km para completar a corrida");

            } else {

                litragemTanque -= gasolinaNormalNecessaria;

                System.out.println("Corrida realizada com sucesso");
            }
        }
    }
}