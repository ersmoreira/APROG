package Mooshak.Modularizacao_Semana1;

import java.util.Scanner;

public class B_GraficoClassificacoes {

    public static void main(String[] args) {

        int numeroAlunosTurma = 0, numeroDisciplinas = 0;
        int numeroAlunosAprovados;
        String nomeDisciplina;


        Scanner sc = new Scanner(System.in);

        numeroAlunosTurma = sc.nextInt();
        numeroDisciplinas = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numeroDisciplinas; i++) {
            nomeDisciplina = sc.nextLine();
            numeroAlunosAprovados = sc.nextInt();
            sc.nextLine();
            showTurma(nomeDisciplina, numeroAlunosTurma, numeroAlunosAprovados);
        }

    }

    public static void showTurma(String nomeDisciplina, int numeroAlunosTurma, int numeroAlunosAprovados) {
        final String POSITIVAS = "- Positivas: ";
        final String NEGATIVAS = "- Negativas: ";
        final String DISCIPLINA = "Disciplina: ";

        System.out.println(DISCIPLINA + nomeDisciplina);
        showGrafico(POSITIVAS, numeroAlunosAprovados);
        showGrafico(NEGATIVAS, numeroAlunosTurma - numeroAlunosAprovados);
    }

    public static void showGrafico(String titulo, int quantidade){
        System.out.print(titulo);
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


}
