package br.com.dio.debbuging;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> alunos = Arrays.asList("Camila", "Lucas", "Bruna", "Pedro", "Maria");

        int media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %d", media);
    }

    public static int calculaMediaDaTurma(List<String> listaDeAlunos, Scanner scan) {

        int somaDasNotas = 0;
        for (String aluno : listaDeAlunos) {
            System.out.printf("Nota do aluno(a) %s", aluno);
            somaDasNotas += scan.nextInt();
        }

        return somaDasNotas / listaDeAlunos.toArray().length;

    }


}
