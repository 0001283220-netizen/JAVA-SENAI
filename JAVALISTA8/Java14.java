package JAVALISTA8;

import java.util.Scanner;

public class Java14

     {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int numero;
            int contador = 1;
            int pares = 0;
            int impares = 0;

            do {
                System.out.println("Digite o " + contador + "º número:");
                numero = input.nextInt();

                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                contador++;

            } while (contador <= 12);

            System.out.println("Total de números pares: " + pares);
            System.out.println("Total de números ímpares: " + impares);

            input.close();
        }
    }

