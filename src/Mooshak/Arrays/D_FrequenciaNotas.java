package Mooshak.Arrays;

import java.util.Scanner;

public class D_FrequenciaNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeAlunos = sc.nextInt();
        int[] notas = lerNotas(sc, quantidadeAlunos);
        imprimeEscala(notas);

    }

    public static int[] lerNotas(Scanner sc, int quantidadeAlunos) {
        int[] notas = new int[21];
        int valor = 0;

        for (int i = 1; i <= quantidadeAlunos; i++) {
            do {
                valor = sc.nextInt();
            } while (valor < 0 || valor > 20);
            determinaFrequenciaNota(notas, valor);
        }
        return notas;
    }

    public static void determinaFrequenciaNota(int[] notas, int valor){
        notas[valor]++;
    }

    public static void imprimeEscala(int[] notas){
        for (int i = 0; i <= 20 ; i++) {
            System.out.printf("%d %d\n", i, notas[i]);
        }
    }
}




