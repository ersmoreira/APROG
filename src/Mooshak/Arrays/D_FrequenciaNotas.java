//package Mooshak.Arrays;

import java.util.Scanner;

public class D_FrequenciaNotas {

    static final Scanner sc = new Scanner(System.in);
    static final int NOTA_MINIMA = 0;
    static final int NOTA_MAXIMA = 20;
    static final int NUMERO_NOTAS = 21;


    public static void main(String[] args) {
        int quantidadeAlunos = sc.nextInt();
        int[] notas = new int[quantidadeAlunos];
        lerNotas(notas);
        int[] frequenciaNotas = determinaFrequenciasNotas(notas);
        imprimeEscala(frequenciaNotas);

    }

    public static void lerNotas(int[] notas) {
        int valor;
        for (int i = 0; i < notas.length; i++) {
            do {
                valor = sc.nextInt();
            } while (valor < NOTA_MINIMA || valor > NOTA_MAXIMA);
            notas[i] = valor;
        }
    }

    public static int[] determinaFrequenciasNotas(int[] notas) {
        int[] frequenciaNotas = new int[NUMERO_NOTAS];
        int nota;

        for (int i = 0; i < notas.length; i++) {
            nota= notas[i];
            frequenciaNotas[nota]++;
        }
        return frequenciaNotas;
    }

    public static void imprimeEscala(int[] notas) {
        for (int i = 0; i <= 20; i++) {
            System.out.printf("%d %d\n", i, notas[i]);
        }
    }
}




