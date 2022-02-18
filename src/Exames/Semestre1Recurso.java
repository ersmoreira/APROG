package Exames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Semestre1Recurso {

    static final int MAX_MESES = 6;
    static final int COLUNAS = 4;

    static final String CAMINHO_FICHEIRO_DADOS = "src\\Exames\\xadrez1a6.txt";
    static final String DELIMITADOR = ",";
    static final int JOGOS_COLUNA_REALIZADOS = 0, JOGOS_COLUNA_GANHOS = 1, JOGOS_COLUNA_PERDIDOS = 2,
            JOGOS_COLUNA_EMPATADOS = 3;

    public static void main(String[] args) throws FileNotFoundException {
        String[] meses = new String[MAX_MESES];
        int[][] jogos = new int[MAX_MESES][COLUNAS];

        int numeroMeses = readInformation(CAMINHO_FICHEIRO_DADOS, meses, jogos);
        System.out.printf("O mês com maior percentagem de jogos ganhos foi: %s%n", getTheMostVictoriousMonth(meses,
                jogos, numeroMeses));
        float[] media = getAverages(jogos, numeroMeses);
        writeStatistics(meses, jogos, media[0], numeroMeses);
    }

    public static int readInformation(String caminhoFicheiro, String[] meses, int[][] jogos) throws FileNotFoundException {
        final int AUX_COLUNA_MES = 0, AUX_COLUNA_REALIZADOS = 1, AUX_COLUNA_GANHOS = 2, AUX_COLUNA_PERDIDOS = 3,
                AUX_COLUNA_EMPATADOS = 4;
        int numeroMes = 0;
        File dados = new File(caminhoFicheiro);
        Scanner ler = new Scanner(dados);

        while (ler.hasNextLine()) {
            String[] aux = ler.nextLine().split(DELIMITADOR);
            meses[numeroMes] = aux[AUX_COLUNA_MES];
            jogos[numeroMes][JOGOS_COLUNA_REALIZADOS] = Integer.parseInt(aux[AUX_COLUNA_REALIZADOS]);
            jogos[numeroMes][JOGOS_COLUNA_GANHOS] = Integer.parseInt(aux[AUX_COLUNA_GANHOS]);
            jogos[numeroMes][JOGOS_COLUNA_PERDIDOS] = Integer.parseInt(aux[AUX_COLUNA_PERDIDOS]);
            jogos[numeroMes][JOGOS_COLUNA_EMPATADOS] = Integer.parseInt(aux[AUX_COLUNA_EMPATADOS]);
            numeroMes++;
        }
        return numeroMes;
    }

    public static String getTheMostVictoriousMonth(String[] meses, int[][] jogos, int numeroMeses) {
        String mes = "";
        float percentagem, percentagemMaior = 0;

        for (int linha = 0; linha < numeroMeses; linha++) {
            percentagem = (float) jogos[linha][JOGOS_COLUNA_GANHOS] / jogos[linha][JOGOS_COLUNA_REALIZADOS];
            if (percentagem > percentagemMaior) {
                mes = meses[linha];
                percentagemMaior = percentagem;
            }
        }

        return mes;
    }

    public static float[] getAverages(int[][] jogos, int numeroMeses) {
        float[] averages = new float[COLUNAS];
        int somaColuna;

        for (int coluna = 0; coluna < COLUNAS; coluna++) {
            somaColuna = 0;
            for (int linha = 0; linha < numeroMeses; linha++) {
                somaColuna += jogos[linha][coluna];
            }
            averages[coluna] = (float) somaColuna / numeroMeses;
        }

        return averages;
    }

    public static void writeStatistics(String[] meses, int[][] jogos, float mediaJogosRealizados, int numeroMeses) {

        System.out.printf("Meses com mais de %.1f jogos%n", mediaJogosRealizados);

        for (int linha = 0; linha < numeroMeses; linha++) {
            if (jogos[linha][JOGOS_COLUNA_REALIZADOS] > mediaJogosRealizados) {
                System.out.printf("%s : %d%n", meses[linha], jogos[linha][JOGOS_COLUNA_REALIZADOS]);
            }
        }

    }
}
