package br.com.dio.debbuging;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro", "Maria"};

        int media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %d", media);
    }

    public static int calculaMediaDaTurma(String[] listaDeAlunos, Scanner scan) {
        int somaDasNotas = 0;
        int media = 0;
        int nota = 0;

        for(int i = 0; i < listaDeAlunos.length;i++) {
            try{
                System.out.printf("Nota do aluno %s: ", listaDeAlunos[i]);
                nota = scan.nextInt();
                somaDasNotas += nota;
            } catch (InputMismatchException e) {
                System.out.println("Insira uma nota válida!");
            }
        }

        media = nota/listaDeAlunos.length;
        return media;

    }

}
