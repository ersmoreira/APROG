package Mooshak.Modularizacao_Semana1;

import java.util.Scanner;

public class H_Capicua {

    public static void main(String[] args) {
        final int MAX_TENTATIVAS = 5;
        Scanner sc = new Scanner(System.in);
        int numero = 0, quantidadeTentativas = 0;


        while (quantidadeTentativas < MAX_TENTATIVAS) {
            numero = sc.nextInt();
            quantidadeTentativas++;
            if (checkCapicua(numero)) {
                System.out.println("capicua");
                break;
            }
            if (quantidadeTentativas == MAX_TENTATIVAS) {
                System.out.println("tentativas excedidas");
                break;
            }
        }

    }

    public static boolean checkCapicua(int numero) {
        int numeroInvertido = 0;
        int aux = numero;
        int resto;

        while (aux > 0) {
            resto = aux % 10;
            numeroInvertido = (numeroInvertido * 10) + resto;
            aux = aux / 10;
        }

        return numero == numeroInvertido;
    }
}
