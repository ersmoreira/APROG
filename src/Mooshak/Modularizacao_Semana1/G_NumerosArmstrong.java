//package Mooshak.Modularizacao_Semana1;

import java.util.Scanner;

public class G_NumerosArmstrong {

    public static void main(String[] args) {
        int numeroMaximo;
        Scanner sc = new Scanner(System.in);
        numeroMaximo = sc.nextInt();

        showNumerosArmstrong(numeroMaximo);
    }

    public static void showNumerosArmstrong(int valorMaximo) {
        int expoente = numeroDigitos(valorMaximo);

        for (int i = 0; i <= valorMaximo; i++) {
            if (checkNumeroArmstrong(i) == true) {
                System.out.println(i);
            }
        }

    }

    public static boolean checkNumeroArmstrong(int numero) {
        int expoente = numeroDigitos(numero);
        int digito, soma = 0;
        int aux = numero;

        if (expoente == 1) {
            return true;
        }

        while (aux > 9) {
            digito = aux % 10;
            aux /= 10;
            soma += Math.pow(digito, expoente);
        }
        soma += Math.pow(aux, expoente);

        if (soma != numero){
            return false;
        }

        return true;
    }

    public static int numeroDigitos(int numero) {
        int numeroDigitos = 1;
        while (numero > 9) {
            numero /= 10;
            numeroDigitos++;
        }
        return numeroDigitos;
    }

}
