//package Mooshak.Modularizacao_Semana2;

import java.util.Scanner;

public class I_ElementoFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        numero = lerValorInteiroPositivo(sc);
        if (checkValorFibonacci(numero)){
            System.out.println("e de Fibonacci");
        } else {
            System.out.println("nao e de Fibonacci");
        }


    }


    public static int lerValorInteiroPositivo(Scanner sc) {
        int numero;

        do {
            numero = sc.nextInt();
        } while (numero < 0);

        return numero;
    }

    public static boolean checkValorFibonacci(int numero){
        int first = 0, second = 1, third = 0;

        while (third < numero){
            third = first + second;
            first = second;
            second = third;
        }
        return third==numero;
    }
}
