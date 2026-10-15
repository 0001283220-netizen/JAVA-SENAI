package JAVALISTA8;


import java.util.Scanner;

public class Java11

     {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int numero;
            int contador = 1;

            do {
                System.out.println("Digite o " + contador + "º número:");
                numero = input.nextInt();

                if (numero % 2 == 0) {
                    System.out.println("O número " + numero + " é par.");
                } else {
                    System.out.println("O número " + numero + " é ímpar.");
                }

                contador++;

            } while (contador <= 20);

            input.close();
        }
    }

