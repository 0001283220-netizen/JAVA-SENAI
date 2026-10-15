package JAVALISTA8;

import java.util.Scanner;

public class Java19

     {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int secreto = 42;
            int palpite;

            do {
                System.out.print("Digite um numero: ");
                palpite = sc.nextInt();

                if (palpite % 2 == 0) {
                    System.out.println("O numero digitado e par.");
                } else {
                    System.out.println("O numero digitado e impar.");
                }

                if (palpite > secreto) {
                    System.out.println("O numero secreto e menor!");
                } else if (palpite < secreto) {
                    System.out.println("O numero secreto e maior!");
                } else {
                    System.out.println("Parabens! Voce acertou o numero secreto!");
                }

            } while (palpite != secreto);

            sc.close();
        }
    }

