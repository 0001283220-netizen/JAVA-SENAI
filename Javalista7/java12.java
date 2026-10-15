package Javalista7;

import java.util.Scanner;

public class java12

     {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double numero;
            int divisoes = 0;

            System.out.print("Digite um número maior que 1: ");
            numero = sc.nextDouble();

            while (numero <= 1) {
                System.out.print("Digite um número maior que 1: ");
                numero = sc.nextDouble();
            }

            while (numero > 1) {
                numero = numero / 2;
                divisoes++;
            }

            System.out.println("Quantidade de divisões realizadas: " + divisoes);
            System.out.println("Valor final: " + numero);

            sc.close();
        }
    }

