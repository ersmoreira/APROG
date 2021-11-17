package Mooshak.Modularizacao_Semana1;

import java.util.Scanner;

public class D_CombinacoesPermutacoes {

    public static void main(String[] args) {
        int quantidadeTotalElementos, quantidadeAgrupar;

        Scanner sc = new Scanner(System.in);
        quantidadeTotalElementos = sc.nextInt();
        quantidadeAgrupar = sc.nextInt();

        if (quantidadeTotalElementos >= quantidadeAgrupar) {
            System.out.printf("C(%d,%d)=%d\n", quantidadeTotalElementos, quantidadeAgrupar, combinacoes(quantidadeTotalElementos, quantidadeAgrupar));
            System.out.printf("P(%d,%d)=%d\n", quantidadeTotalElementos, quantidadeAgrupar, permutacoes(quantidadeTotalElementos, quantidadeAgrupar));
        }

    }

    public static int factorial(int numero) {
        int fact = 1;
        for (int i = 1; i <= numero; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int combinacoes(int m, int n) {
        return factorial(m) / (factorial(n) * factorial(m - n));
    }

    public static int permutacoes(int m, int n) {
        return factorial(m) / factorial(m - n);
    }
}
