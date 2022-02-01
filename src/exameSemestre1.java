public class exameSemestre1 {

    public static void main(String[] args) {
        String[] musics = {"On my way", "Memories", "Perfect", "Havana"};
        double[][] info = {{201.6, 3.25}, {189, 2.80}, {256.8, 2.75}, {202.8, 2.35}};


    }

    // Exercicio 1
    public static void findMostExpensiveMusic(String[] musica, double[][] informacao) {
        final int COLUNA_PRECO = 1;
        int indiceMaximo = 0;
        int totalMusicas = musica.length;
        double preco = 0, precoMaximo = 0;

        for (int linha = 0; linha < totalMusicas; linha++) {
            preco = informacao[linha][COLUNA_PRECO];
            if (preco >= precoMaximo) {
                indiceMaximo = linha;
                precoMaximo =
            }
        }

        return musica[indiceMaximo];
    }
}
