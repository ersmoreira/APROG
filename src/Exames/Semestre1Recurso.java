package Exames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Semestre1Recurso {

    static final int NUMERO_MAXIMO_MESES = 12;
    static final int NUMERO_COLUNAS_SCORE = 4;
    static final String DELIMITADOR = ",";
    static final int SCORE_COLUNA_REALIZADOS = 0, SCORE_COLUNA_GANHOS = 1, SCORE_COLUNA_PERDIDOS = 2, SCORE_COLUNA_EMPATADOS = 3;

    public static void main(String[] args) {
        String[] meses = new String[NUMERO_MAXIMO_MESES];
        int[][] score = new int[NUMERO_MAXIMO_MESES][NUMERO_COLUNAS_SCORE];


    }

    public static int readInformation(String caminhoFicheiro, String[] meses, int[][] score) throws FileNotFoundException {
        final int AUX_COLUNA_MES = 0, AUX_COLUNA_REALIZADOS = 1, AUX_COLUNA_GANHOS = 2, AUX_COLUNA_PERDIDOS = 3, AUX_COLUNA_EMPATADOS = 4;
        int numeroMes = 0;
        File dados = new File(caminhoFicheiro);
        Scanner ler = new Scanner(dados);

        while (ler.hasNextLine()) {
            String[] aux = ler.nextLine().split(DELIMITADOR);
            meses[numeroMes] = aux[AUX_COLUNA_MES];
            score[numeroMes][SCORE_COLUNA_REALIZADOS] = Integer.parseInt(aux[AUX_COLUNA_REALIZADOS]);
            score[numeroMes][SCORE_COLUNA_GANHOS] = Integer.parseInt(aux[AUX_COLUNA_GANHOS]);
            score[numeroMes][SCORE_COLUNA_PERDIDOS] = Integer.parseInt(aux[AUX_COLUNA_PERDIDOS]);
            score[numeroMes][SCORE_COLUNA_EMPATADOS] = Integer.parseInt(aux[AUX_COLUNA_EMPATADOS]);
            numeroMes++;
        }
        return numeroMes;
    }

    public static String getTheMostVictoriousMonth(String[] meses, int[][] scores, int numeroMeses) {
        String mes = "";
        int vitoriasMaximas = 0;

        for (int linha = 0; linha < numeroMeses; linha++) {
            if (scores[linha][SCORE_COLUNA_GANHOS] > vitoriasMaximas){
                mes = meses[linha];
                vitoriasMaximas = scores[linha][SCORE_COLUNA_GANHOS];
            }
        }

        return mes;
    }

    public static float[] getAverages (int[][] scores, int numeroMeses){
        float[] averages = new float[NUMERO_COLUNAS_SCORE];
        int somaColuna = 0;

        for (int coluna = 0; coluna < NUMERO_COLUNAS_SCORE; coluna++) {
            somaColuna = 0;
            for (int linha = 0; linha < numeroMeses; coluna++) {
                somaColuna += scores[coluna][linha];
            }
            averages[coluna] = (float) somaColuna / numeroMeses;
        }

        return averages;
    }

    public static void writeStatistics(String[] meses, int[][] scores, float mediaJogosRealizados, int numeroMeses){

        for (int linha = 0; linha < numeroMeses; linha++) {
            for (int coluna = 0; coluna < ; coluna++) {
                
            }
        }
        
    }
}
