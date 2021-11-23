package Mooshak.Essencial;

import java.util.Scanner;

public class H_NumeroPrimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, quantidade = 0;

        while (numero < 1) {
            numero = sc.nextInt();
        }

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                quantidade++;
            }
        }

        if (numero == 1 || quantidade == 2) {
            System.out.println("primo");
        } else {
            System.out.println("nao e primo");
        }

    }
}
