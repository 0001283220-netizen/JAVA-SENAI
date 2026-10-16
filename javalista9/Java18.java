package javalista9;

import java.util.Scanner;

public class Java18 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();

            int divisores = 0;

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    divisores++;
                }
            }

            if (numero > 1 && divisores == 2) {
                System.out.println("O numero e primo.");
            } else {
                System.out.println("O numero nao e primo.");
            }

            sc.close();
        }
    }

