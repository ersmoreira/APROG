package Mooshak.Modularizacao_Semana2;

import java.util.Scanner;

public class L_QuantidadePalavrasFrase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        frase = sc.nextLine();
        if (frase.trim().length() > 0) {
            System.out.println(numeroPalavras(frase));
        } else{
            System.out.println("0");
        }
    }

    public static int numeroPalavras(String frase) {
        String aux = frase.trim().replaceAll(" +", " ");
        return aux.split(" ", -1).length;
    }


}
