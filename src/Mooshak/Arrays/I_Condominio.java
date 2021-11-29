//package Mooshak.Arrays;

import java.util.Scanner;

public class I_Condominio {

    static final int numeroEntradas = 3;
    static final int numeroPisos = 4;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] nomeProprietarioApartamento = new String[numeroEntradas][numeroPisos];
        String nomePesquisa;

        nomeProprietarioApartamento = lerNomeProprietarios();
        nomePesquisa = sc.nextLine();
        mostraApartamentoProprietario(nomeProprietarioApartamento, nomePesquisa);

    }

    public static String[][] lerNomeProprietarios() {
        String proprietarios[][] = new String[numeroEntradas][numeroPisos];
        for (int entrada = 0; entrada < numeroEntradas; entrada++) {
            for (int piso = 0; piso < numeroPisos; piso++) {
                proprietarios[entrada][piso] = sc.nextLine();
            }
        }
        return proprietarios;
    }

    public static void mostraApartamentoProprietario(String[][] arrApartamentos, String nomeProprietario) {
        boolean encontrou = false;
        for (int entrada = 0; entrada < numeroEntradas; entrada++) {
            for (int piso = 0; piso < numeroPisos; piso++) {
                if (arrApartamentos[entrada][piso].equalsIgnoreCase(nomeProprietario)) {
                    encontrou = true;
                    System.out.printf("nome=%s%n", arrApartamentos[entrada][piso]);
                    System.out.printf("entrada=%d%n", entrada);
                    System.out.printf("piso=%d%n", piso);
                }
            }
        }
        if (!encontrou) {
            System.out.println("Nao mora no predio");
        }
    }


}
