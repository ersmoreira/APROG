package Mooshak.Essencial;

import java.util.Scanner;

public class I_MinimoMultiploComum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = 0, numero2 = 0, resto = 0;

        while (numero1 < 1) {
            numero1 = sc.nextInt();
        }

        while (numero2 < 1) {
            numero2 = sc.nextInt();
        }

        int a = numero1;
        int b = numero2;

        do {
            resto = a % b;
            a = b;
            b = resto;
        } while (resto != 0);

        System.out.println((numero1 * numero2) / a);

    }
}
