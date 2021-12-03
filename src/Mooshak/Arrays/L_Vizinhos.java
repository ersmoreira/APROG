package Mooshak.Arrays;

import java.util.Scanner;

public class L_Vizinhos {

    final static int MAXIMO_NUMEROS = 30;
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = new int[MAXIMO_NUMEROS];
        int quantidade = lerNumeros(numeros);

        verificaVizinhosMaiores(numeros, quantidade);

    }

    private static int lerNumeros(int[] numeros) {
        int quantidade = 0, valor = 0;

        while (quantidade < MAXIMO_NUMEROS && valor >= 0) {
            valor = sc.nextInt();
            if (valor >= 0) {
                numeros[quantidade] = valor;
                quantidade++;
            }
        }

        return quantidade;
    }

    private static void verificaVizinhosMaiores(int[] numeros, int quantidade) {
        for (int i = 1; i < (quantidade -1); i++) {
            if (numeros[i] > numeros[i-1] && numeros[i] > numeros[i+1]){
                System.out.println(numeros[i]);
            }

        }
    }
}
