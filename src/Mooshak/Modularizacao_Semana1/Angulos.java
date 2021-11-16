package Mooshak.Modularizacao_Semana1;

import java.util.Scanner;

public class Angulos {

    public static void main(String[] args) {
        double lado1, lado2, lado3;
        Scanner sc = new Scanner(System.in);

        lado1 = sc.nextInt();
        lado2 = sc.nextInt();
        lado3 = sc.nextInt();

        System.out.printf("a=%.2f\n", lado1);
        System.out.printf("b=%.2f\n", lado2);
        System.out.printf("c=%.2f\n", lado3);
        System.out.printf("ang(a,b)=%.2f\n", calcularAngulo(lado1, lado2, lado3));
        System.out.printf("ang(a,c)=%.2f\n", calcularAngulo(lado1, lado3, lado2));
        System.out.printf("ang(b,c)=%.2f\n", calcularAngulo(lado2, lado3, lado1));

    }

    public static double calcularAngulo(double lado1, double lado2, double lado3) {
        double calculo;
        calculo = (Math.pow(lado1, 2) + Math.pow(lado2, 2) - Math.pow(lado3, 2)) / (2 * lado1 * lado2);
        return Math.acos(calculo);
    }
}
