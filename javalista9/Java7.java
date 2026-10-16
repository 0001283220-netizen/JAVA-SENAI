package javalista9;

import java.util.Scanner;

public class Java7 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um numero N: ");
            int N = sc.nextInt();

            int soma = 0;

            for (int i = 1; i <= N; i++) {
                soma = soma + i;
            }

            System.out.println("A soma de 1 ate " + N + " e: " + soma);

            sc.close();
        }
    }
