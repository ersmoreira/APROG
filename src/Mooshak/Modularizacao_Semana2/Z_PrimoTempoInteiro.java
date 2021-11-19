// package Mooshak.Modularizacao_Semana2;

import java.util.Scanner;

public class Z_PrimoTempoInteiro {

    public static void main(String[] args) {
        int numero1, numero2;
        int quantidade = 0;
        Scanner sc = new Scanner(System.in);

        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        for (int i = minimo(numero1, numero2); i <= maximo(numero1, numero2); i++) {
            if (checkNumeroPrimoTempoInteiro(i)) {
                quantidade++;
                System.out.println(i);
            }
        }
        System.out.printf("(%d)\n", quantidade);
    }

    public static boolean checkNumeroPrimoTempoInteiro(int numero) {
        int aux = numero;
        int numeroDigitos = numeroDigitos(numero);
        int base = 10;
        int ultimo, outros;

        do {
            if (!checkNumeroPrimo(aux)) {
                return false;
            }
            ultimo = aux % base;
            outros = aux / base;
            aux = ultimo * ((int)Math.pow(base, (numeroDigitos-1))) + outros;
        } while (aux != numero);

        return true;
    }

    public static int numeroDigitos(int numero) {
        int numeroDigitos = 1;
        while (numero > 9) {
            numero /= 10;
            numeroDigitos++;
        }
        return numeroDigitos;
    }

    public static boolean checkNumeroPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int minimo(int valor1, int valor2) {
        if (valor1 < valor2) {
            return valor1;
        } else {
            return valor2;
        }
    }

    public static int maximo(int valor1, int valor2) {
        if (valor1 > valor2) {
            return valor1;
        } else {
            return valor2;
        }
    }
}
