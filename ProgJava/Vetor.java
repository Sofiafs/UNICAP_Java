package ProgJava;

public class Vetor {

    public static void imprimeMenor(int[] vetor) {
        int menor = vetor[0]; 

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("O menor valor e: " + menor);
    }

    public static void main(String[] args) {
        int[] numeros = {8, 3, 15, 1, 9, 4};

        imprimeMenor(numeros);
    }
}