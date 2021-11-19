package Mooshak.Essencial;

import java.util.Scanner;

public class A_SomarAlgarismosPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int digito, soma = 0;

        while (numero > 0) {
            digito = numero % 10;
            if (digito % 2 == 0) {
                soma += digito;
            }
            numero = numero / 10;
        }
        System.out.println(soma);
    }
}