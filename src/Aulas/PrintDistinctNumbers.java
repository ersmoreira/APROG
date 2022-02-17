package Aulas;

public class PrintDistinctNumbers {

    public static void main(String[] args) {
        printDistinctNumbers(1211113534);
    }

    public static void printDistinctNumbers(int numero) {
        String aux = Integer.toString(numero);
        char charPrevious = ' ', charActual = ' ';

        for (int posicao = 0; posicao < aux.length(); posicao++) {
            charActual = aux.charAt(posicao);
            if (charActual != charPrevious){
                System.out.print(charActual);
                charPrevious = charActual;
            }
        }
    }
}
