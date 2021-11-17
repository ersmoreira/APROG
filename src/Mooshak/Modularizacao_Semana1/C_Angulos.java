package Mooshak.Modularizacao_Semana1;

import java.util.Scanner;

public class C_Angulos {

    public static void main(String[] args) {
        double lado1, lado2, lado3, ang1, ang2, ang3;
        Scanner sc = new Scanner(System.in);

        lado1 = sc.nextDouble();
        lado2 = sc.nextDouble();
        lado3 = sc.nextDouble();

        ang1 = calcularAngulo(lado1, lado2, lado3);
        ang2 = calcularAngulo(lado1, lado3, lado2);
        ang3 = calcularAngulo(lado2, lado3, lado1);

        if ((int) (ang1 + ang2 + ang3) == 180) {
            System.out.printf("a=%.2f\n", lado1);
            System.out.printf("b=%.2f\n", lado2);
            System.out.printf("c=%.2f\n", lado3);
            System.out.printf("ang(a,b)=%.2f\n", ang1);
            System.out.printf("ang(a,c)=%.2f\n", ang2);
            System.out.printf("ang(b,c)=%.2f\n", ang3);

        } else {
            System.out.println("impossivel");
        }

    }

    public static double calcularAngulo(double lado1, double lado2, double lado3) {
        double calculo;
        calculo = Math.pow(lado1, 2) + Math.pow(lado2, 2) - Math.pow(lado3, 2);
        calculo = calculo / (2 * lado1 * lado2);
        calculo = Math.acos(calculo);
        calculo = calculo * 180 / Math.PI;
        return calculo;
    }
}
