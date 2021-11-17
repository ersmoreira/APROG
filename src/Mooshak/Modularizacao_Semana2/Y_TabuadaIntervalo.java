package Mooshak.Modularizacao_Semana2;

import java.util.Scanner;

public class Y_TabuadaIntervalo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

        valor1 = lerValorInteiroPositivo(sc);
        valor2 = lerValorInteiroPositivo(sc);

        if (valor2 < valor1) {
            int x;
            x = valor2;
            valor2 = valor1;
            valor1 = x;
        }

        mostrarTabuadasDoIntervalo(valor1, valor2);
    }

    public static int lerValorInteiroPositivo(Scanner sc) {
        int numero;

        do {
            numero = sc.nextInt();
        } while (numero <= 0);

        return numero;
    }

    public static void mostrarTabuadasDoIntervalo(int valor1, int valor2) {

        for (int i = valor1; i <= valor2 ; i++) {
            mostrarTabuadaDoNumero(i);
        }
    }

    public static void mostrarTabuadaDoNumero(int numero) {
        System.out.printf("Tabuada de %d\n", numero);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
    }

}
