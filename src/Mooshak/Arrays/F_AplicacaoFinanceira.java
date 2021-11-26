package Mooshak.Arrays;

import java.util.Scanner;

public class F_AplicacaoFinanceira {

    public static Scanner sc = new Scanner(System.in);
    public static final int NUMERO_MESES = 6;

    public static void main(String[] args) {

        double[] juros = new double[NUMERO_MESES];
        double valorInicial, valorFinal;


        for (int i = 0; i < NUMERO_MESES; i++) {
            juros[i] = lerValor();
        }

        valorInicial = lerValor();
        valorFinal = calculaValorFinal(juros, valorInicial);

        System.out.printf("valor final=%.2f\n", valorFinal);


    }

    public static double lerValor() {
        double valor = sc.nextDouble();
        return valor;
    }

    public static double calculaValorFinal(double[] juros, double valorInicial) {
        double valor = valorInicial;
        for (int i = 0; i < NUMERO_MESES; i++) {
            valor += valor * juros[i];
        }
        return valor;
    }
}
