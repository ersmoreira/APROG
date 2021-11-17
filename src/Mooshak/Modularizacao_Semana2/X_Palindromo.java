package Mooshak.Modularizacao_Semana2;

import java.util.Scanner;

public class X_Palindromo {

    public static void main(String[] args) {
        String palavra = "";
        int countPalavras = 0;

        Scanner sc = new Scanner(System.in);
        palavra = sc.next();

        while (!palavra.isEmpty() && !checkPalindromo(palavra)) {
            countPalavras++;
            palavra = sc.next();
        }

        System.out.println(countPalavras);
    }

    public static boolean checkPalindromo(String palavra) {
        String aux = "";
        for (int i = (palavra.length() - 1); i >= 0; i--) {
            aux += palavra.charAt(i);
        }
        return (palavra.compareToIgnoreCase(aux) == 0);
    }

}
