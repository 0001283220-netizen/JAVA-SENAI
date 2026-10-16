package javalista9;

import java.util.Scanner;

public class Java13 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int pares = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite o " + i + "º numero: ");
                int numero = sc.nextInt();

                if (numero % 2 == 0) {
                    pares++;
                }
            }

            System.out.println("Quantidade de numeros pares: " + pares);

            sc.close();
        }
    }

