public class exameSemestre1 {

    final static int COLUNA_PRECO = 1;
    final static int COLUNA_DURACAO = 0;

    public static void main(String[] args) {
        String[] musics = {"On my way", "Memories", "Perfect", "Havana"};
        double[][] info = {{201.6, 3.25}, {189, 2.80}, {256.8, 2.75}, {202.8, 2.35}};

    }

    // Exercicio 1
    public static void findMostExpensiveMusic(String[] musica, double[][] informacao) {
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

        for (int linha = 1; linha < totalMusicas; linha++) {
            diferenca = Math.abs(informacao[linha][COLUNA_DURACAO] - informacao[linha - 1][COLUNA_DURACAO]);
            if (diferenca > diferencaMaxima) {
                diferencaMaxima = diferenca;
            }
        }

        return diferencaMaxima;
    }


}
