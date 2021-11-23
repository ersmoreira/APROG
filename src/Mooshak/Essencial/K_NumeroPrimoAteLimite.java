package Mooshak.Essencial;

import java.util.Scanner;

public class K_NumeroPrimoAteLimite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, quantidade;

        numero = sc.nextInt();

        if (numero > 1) {
            for (int i = 2; i <= numero; i++) {
                quantidade = 0;

                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        quantidade++;
                    }
                }

                if (quantidade == 1) {
                    System.out.println(i);
                }
            }
        }

    }
}
