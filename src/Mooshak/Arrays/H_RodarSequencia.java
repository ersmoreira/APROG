package Mooshak.Arrays;

import java.util.Scanner;

public class H_RodarSequencia {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int quantidade = lerInteiro();
        int[] valores = lerValores(quantidade);
        sc.nextLine();
        trataComando(valores);

    }

    public static int lerInteiro() {
        int valor;
        valor = sc.nextInt();
        return valor;
    }

    public static int[] lerValores(int quantidade) {
        int[] valores = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            valores[i] = lerInteiro();
        }
        return valores;
    }

    public static void mostraValores(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("[%d]", valores[i]);
        }
        System.out.println();
    }

    public static void trataComando(int[] valores) {
        String comando;
        int aux;

        do {
            comando = sc.nextLine();

            switch (comando) {
                case "direita":
                    aux = valores[valores.length - 1];
                    for (int i = (valores.length - 1); i > 0; i--) {
                        valores[i] = valores[i - 1];
                    }
                    valores[0] = aux;
                    mostraValores(valores);
                    break;
                case "esquerda":
                    aux = valores[0];
                    for (int i = 0; i < (valores.length - 1); i++) {
                        valores[i] = valores[i + 1];
                    }
                    valores[valores.length - 1] = aux;
                    mostraValores(valores);
                    break;
            }
        } while (!comando.equalsIgnoreCase("sair"));
    }

}
