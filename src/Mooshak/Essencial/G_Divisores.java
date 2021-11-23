package Mooshak.Essencial;

import java.util.Scanner;

public class G_Divisores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, quantidade = 0;

        while (numero < 1) {
            numero = sc.nextInt();
        }

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
                quantidade++;
            }
        }

        System.out.printf("(%d)\n", quantidade);
    }
}
