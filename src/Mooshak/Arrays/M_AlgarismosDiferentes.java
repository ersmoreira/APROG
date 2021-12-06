package Mooshak.Arrays;

import java.util.Scanner;

public class M_AlgarismosDiferentes {

    final static Scanner sc = new Scanner(System.in);
    final static int NUM_DIGITOS = 10;

    public static void main(String[] args) {

        int numero = lerNumero();
        int quantidadeAlgarismos;

        while (numero >= 0) {
            quantidadeAlgarismos = contaAlgarismosDiferentes(numero);
            mostraResultado(numero, quantidadeAlgarismos);
            numero=lerNumero();
        }
    }

    private static int contaAlgarismosDiferentes(int numero) {
        int[] digitos = new int[NUM_DIGITOS];
        int quantidade = 0, pos;

        if (numero == 0){
            return 1;
        }

        while (numero > 0) {
            pos = numero % 10;
            if (digitos[pos] == 0) {
                digitos[pos]++;
                quantidade++;
            }
            numero /= 10;
        }
        return quantidade;
    }

    public static int lerNumero() {
        return sc.nextInt();
    }

    public static void mostraResultado(int numero, int quantidade) {
        System.out.printf("%d:%d%n", numero, quantidade);
    }
}
