import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class exameSemestre1 {

    final static int COLUNA_PRECO = 1;
    final static int COLUNA_DURACAO = 0;
    final static int COLUNA_NOME = 0;

    // Exercicio 5
    public static void main(String[] args) throws FileNotFoundException {
        String[] musics = {"On my way", "Memories", "Perfect", "Havana"};
        double[][] info = {{201.6, 3.25}, {189, 2.80}, {256.8, 3.75}, {202.8, 2.35}};
        String nomeFicheiroSaida = "musics.txt";

        // Mostrar qual a musica com o preço mais elevado
        String musicaPrecoMaisElevado = findMostExpensiveMusic(musics, info);
        System.out.printf("A música com o preço mais elevado é: %s%n", musicaPrecoMaisElevado);

        // Mostra a maior diferença de duração entre musicas
        double maiorDiferencaDuracaoMusicas = calculateBiggestDifference(info);
        System.out.printf("A maior diferenca de duração entre musicas é: %.2f%n", maiorDiferencaDuracaoMusicas);

        // Escrever em ficheiro
        writeToFile(nomeFicheiroSaida, musics, info);

    }

    // Exercicio 1
    public static String findMostExpensiveMusic(String[] musica, double[][] informacao) {
        int indiceMaximo = 0;
        int totalMusicas = musica.length;
        double preco = 0, precoMaximo = 0;

        for (int linha = 0; linha < totalMusicas; linha++) {
            preco = informacao[linha][COLUNA_PRECO];
            if (preco >= precoMaximo) {
                indiceMaximo = linha;
                precoMaximo = preco;
            }
        }

        return musica[indiceMaximo];
    }

    // Exercicio 3
    public static double calculateBiggestDifference(double[][] informacao) {
        double diferenca = 0, diferencaMaxima = 0;
        int totalMusicas = informacao.length;
        double valor1 = 0, valor2 = 0;

        for (int primeiraPosicao = 0; primeiraPosicao < totalMusicas; primeiraPosicao++) {
            for (int segundaPosicao = primeiraPosicao + 1; segundaPosicao < totalMusicas; segundaPosicao++) {
                valor1 = informacao[primeiraPosicao][COLUNA_DURACAO];
                valor2 = informacao[segundaPosicao][COLUNA_DURACAO];
                diferenca = Math.abs(valor2 - valor1);
                if (diferenca > diferencaMaxima) {
                    diferencaMaxima = diferenca;
                }
            }
        }

        return diferencaMaxima;
    }

    // Exercicio 4
    public static void writeToFile(String nomeFicheiro, String[] musica, double[][] informacao) throws FileNotFoundException {
        File ficheiro = new File(nomeFicheiro);
        PrintWriter out = new PrintWriter(ficheiro);
        int totalMusicas = musica.length;

        for (int linha = 0; linha < totalMusicas; linha++) {
            out.printf("%s / %.2fs / %.2f€%n", musica[linha], informacao[linha][COLUNA_DURACAO],
                    informacao[linha][COLUNA_PRECO]);
        }

        out.close();
    }

}
