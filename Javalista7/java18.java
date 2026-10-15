package Javalista7;

import java.util.Scanner;

public class java18

     {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int maiores50 = 0;
            int menores20 = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite o " + i + "º número: ");
                numero = sc.nextInt();

                if (numero > 50) {
                    maiores50++;
                }

                if (numero < 20) {
                    menores20++;
                }
            }

            System.out.println("Quantidade de números maiores que 50: " + maiores50);
            System.out.println("Quantidade de números menores que 20: " + menores20);

            sc.close();
        }
    }

