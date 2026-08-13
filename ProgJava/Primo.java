package ProgJava;

public class Primo {

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int numero = 7;

        if (ehPrimo(numero)) {
            System.out.println(numero + " é primo");
        } else {
            System.out.println(numero + " não e primo");
        }
    }
}