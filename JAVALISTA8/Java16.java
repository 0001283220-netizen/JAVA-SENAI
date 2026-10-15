package JAVALISTA8;

import java.util.Scanner;

public class Java16 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um numero: ");
            int num = sc.nextInt();

            int i = 1;
            int divisores = 0;

            do {
                if (num % i == 0) {
                    divisores++;
                }
                i++;
            } while (i <= num);

            if (num > 1 && divisores == 2) {
                System.out.println("O numero e primo.");
            } else {
                System.out.println("O numero nao e primo.");
            }

            sc.close();
        }
    }

