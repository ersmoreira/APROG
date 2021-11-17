package Mooshak.Modularizacao_Semana1;

import java.util.Scanner;

public class A_MediaNumeros {

    public static int quantidadeNumeros = 0, somaNumeros = 0;
    public static int n;

    public static void main(String[] args) {

        int numero;
        final int K = 5;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        numero = sc.nextInt();


        while (checkNumeroValido(numero) && quantidadeNumeros < K) {
            numero = sc.nextInt();;
        }

        double media = (double) somaNumeros / quantidadeNumeros;
        System.out.printf("%.2f\n", media);
    }

    public static boolean checkNumeroValido(int numero){
        if (numeroDigitos(numero) < n){
            somaNumeros += numero;
            quantidadeNumeros++;
            return true;
        }
        else{
            return false;
        }
    }

    public static int numeroDigitos(int numero) {
        int numDigitos = 0;
        while (numero > 9) {
            numDigitos += 1;
            numero = numero / 10;
        }
        numDigitos++;
        return numDigitos;
    }
}
