package Mooshak.Essencial;

import java.util.Scanner;

public class F_Capicua {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, aux, numeroInvertido = 0, resto;

        numero = sc.nextInt();
        aux = numero;

        while (aux > 0) {
            resto = aux % 10;
            numeroInvertido = (numeroInvertido * 10) + resto;
            aux /= 10;
        }

        if (numero == numeroInvertido){
            System.out.println("capicua");
        } else{
            System.out.print("nao capicua");
        }


    }

}
