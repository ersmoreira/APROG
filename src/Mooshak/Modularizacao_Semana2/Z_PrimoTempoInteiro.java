package Mooshak.Modularizacao_Semana2;

import java.util.Scanner;

public class Z_PrimoTempoInteiro {

    public static void main(String[] args) {
        int numero1, numero2;
        int quantidade = 0;
        Scanner sc = new Scanner(System.in);

        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        for (int i = minimo(numero1, numero2); i <= maximo(numero1, numero2); i++) {
            if (checkNumeroPrimo(i)){
                quantidade++;
                System.out.println(i);
            }
        }
        System.out.printf("(%d)\n", quantidade);
    }

    public static boolean checkNumeroPrimoTempoInteiro(int numero){
        String num = String.valueOf(numero);
        for (int i = num.length()-1; i >=0 ; i--) {

        }

        return  true;
    }

    public static boolean checkNumeroPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int minimo(int valor1, int valor2) {
        if (valor1 < valor2) {
            return valor1;
        } else {
            return valor2;
        }
    }

    public static int maximo(int valor1, int valor2) {
        if (valor1 > valor2) {
            return valor1;
        } else {
            return valor2;
        }
    }
}
