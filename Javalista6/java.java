package Javalista6;

import java.util.Scanner;

public class java {;

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            double nota;

            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = input.nextDouble();

            while (nota < 0 || nota > 10) {
                System.out.println("Nota inválida!");
                System.out.print("Digite uma nota entre 0 e 10: ");
                nota = input.nextDouble();
            }

            System.out.println("Nota válida: " + nota);

            input.close();
        }
    }

