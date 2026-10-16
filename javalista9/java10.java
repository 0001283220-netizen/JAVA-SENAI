package javalista9;

import java.util.Scanner;

public class java10 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double soma = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite o " + i + "º numero: ");
                double numero = sc.nextDouble();

                soma = soma + numero;
            }

            double media = soma / 5;

            System.out.println("A media dos numeros e: " + media);

            sc.close();
        }
    }

