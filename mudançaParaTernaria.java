package _1_exemplos;

import java.util.Scanner;

public class mudançaParaTernaria {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double notaProvas;
        double notaAtividades;
        double mediaFinal;

        System.out.println("Insira a nota das provas:");
        notaProvas = input.nextDouble();

        System.out.println("Insira a nota das atividades:");
        notaAtividades = input.nextDouble();

        mediaFinal = (notaProvas * 0.70) + (notaAtividades * 0.30);

        System.out.println("Média final: " + mediaFinal);
        String String = (mediaFinal >= 6) ? ("Aluno aprovado") : ("Aluno reprovado");

    }}
