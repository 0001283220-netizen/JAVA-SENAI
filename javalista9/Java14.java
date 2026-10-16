package javalista9;

import java.util.Scanner;

public class Java14 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double soma = 0;

            for (int i = 1; i <= 6; i++) {
                System.out.print("Digite o " + i + "º numero: ");
                double numero = sc.nextDouble();

                if (numero > 0) {
                    soma = soma + numero;
                }
            }

            System.out.println("A soma dos numeros positivos e: " + soma);

            sc.close();
        }
    }

