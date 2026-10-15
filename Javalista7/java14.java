package Javalista7;

import java.util.Scanner;

public class java14

    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double nota;
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = sc.nextDouble();

            while (nota < 0 || nota > 10) {
                System.out.print("Nota inválida! Digite uma nota entre 0 e 10: ");
                nota = sc.nextDouble();
            }

            System.out.println("Nota válida: " + nota);

            sc.close();
        }
    }

