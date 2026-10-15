package JAVALISTA8;

import java.util.Scanner;

public class Java15

   {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int N, D;
            char resposta;

            do {
                System.out.println("Digite o número N:");
                N = input.nextInt();

                System.out.println("Digite o divisor D:");
                D = input.nextInt();

                if (D == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else if (N % D == 0) {
                    System.out.println(N + " é divisível por " + D);
                } else {
                    System.out.println(N + " não é divisível por " + D);
                }

                System.out.println("Deseja continuar? (S/N)");
                resposta = input.next().charAt(0);

            } while (resposta == 'S' || resposta == 's');

            input.close();
        }
    }

