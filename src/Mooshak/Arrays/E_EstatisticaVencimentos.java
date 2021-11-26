package Mooshak.Arrays;

import java.util.Scanner;

public class E_EstatisticaVencimentos {

    public static final int NUM_MAX_EMPREGADOS = 20;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nomeFuncionario = new String[NUM_MAX_EMPREGADOS];
        double[] salario = new double[NUM_MAX_EMPREGADOS];
        String nome;
        int numEmpregados = 0;

        nome = sc.nextLine();
        while (!nome.equals("fim") && numEmpregados <= NUM_MAX_EMPREGADOS) {
            numEmpregados++;
            nomeFuncionario[numEmpregados - 1] = nome;
            salario[numEmpregados - 1] = sc.nextDouble();
            sc.nextLine();
            nome = sc.nextLine();
        }

        double mediaSalarios = calculaMediaSalario(salario, numEmpregados);
        System.out.printf("%.1f\n", mediaSalarios);
        mostraFuncionariosInferiorMedia(nomeFuncionario, salario, mediaSalarios, numEmpregados);

    }

    public static double calculaMediaSalario(double[] vencimentos, int quantidadeEmpregados) {
        double totalSalarios = 0;
        for (int i = 0; i < quantidadeEmpregados; i++) {
            totalSalarios += vencimentos[i];
        }
        return totalSalarios / quantidadeEmpregados;
    }

    public static void mostraFuncionariosInferiorMedia(String[] nomes, double[] salarios, double media, int quantidadeEmpregados) {

        for (int i = 0; i < quantidadeEmpregados; i++) {
            if (salarios[i] < media) {
                System.out.println(nomes[i]);
            }
        }
    }
}
