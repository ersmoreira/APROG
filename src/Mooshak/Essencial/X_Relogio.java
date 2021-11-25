package Mooshak.Essencial;

import java.util.Scanner;

public class X_Relogio {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n == 1) {
            System.out.println("Tag Heuer");
        } else if (n == 2) {
            System.out.println("Rolex");
        } else if (n == 3) {
            System.out.println("Omega");
        } else if (n == 4) {
            System.out.println("Cartier");
        } else if (n == 5) {
            System.out.println("Bvlgari");
        } else if (n == 6) {
            System.out.println("Raymond Weil");
        } else {
            System.out.println("Marca invalida");
        }

    }

}
