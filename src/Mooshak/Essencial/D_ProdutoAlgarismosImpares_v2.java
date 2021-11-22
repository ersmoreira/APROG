package Mooshak.Essencial;

import java.util.Scanner;

public class D_ProdutoAlgarismosImpares_v2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, digito, aux, produto;

        do {
            numero = sc.nextInt();
            aux = numero;
            produto = 1;
            while (aux > 0) {
                digito = aux % 10;
                if (digito % 2 != 0) {
                    produto *= digito;
                }
                aux = aux / 10;
            }
            if (numero > 0) {
                System.out.println(produto);
            }
        }
        while (numero > 0);
    }
}