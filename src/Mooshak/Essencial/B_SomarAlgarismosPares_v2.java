package Mooshak.Essencial;

import java.util.Scanner;

public class B_SomarAlgarismosPares_v2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, digito, aux, soma;

        do {
            numero = sc.nextInt();
            aux = numero;
            soma = 0;
            while (aux > 0) {
                digito = aux % 10;
                if (digito % 2 == 0) {
                    soma += digito;
                }
                aux = aux / 10;
            }
            if (numero > 0) {
                System.out.println(soma);
            }
        }
        while (numero > 0);
    }
}