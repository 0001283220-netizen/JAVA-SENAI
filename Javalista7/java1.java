package Javalista7;

import java.util.Scanner;

public class java1 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número limite: ");
            int limite = scanner.nextInt();

            int soma = 0;
            while (soma <= limite) {
                System.out.print("Digite um número: ");
                int numero = scanner.nextInt();
                soma += numero;
            }

            System.out.println("Soma total: " + soma);
            scanner.close();
        }
    }

