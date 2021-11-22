package Mooshak.Essencial;

import java.util.Scanner;

public class C_ProdutoAlgarismosImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int digito, produto = 1;

        while (numero > 0) {
            digito = numero % 10;
            if (digito % 2 != 0) {
                produto *= digito;
            }
            numero = numero / 10;
        }
        System.out.println(produto);
    }
}