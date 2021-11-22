package Mooshak.Essencial;

import java.util.Scanner;

public class E_ConvertBase8To10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, expoente, digito, calculo;
        final int base = 8;

        numero = sc.nextInt();

        while (numero >= 0) {
            expoente = 0;
            calculo = 0;
            while (numero > 0) {
                digito = numero % 10;
                calculo += digito * Math.pow(base, expoente);
                numero = numero / 10;
                expoente++;
            }
            System.out.println(calculo);
            numero = sc.nextInt();
        }

    }
}
