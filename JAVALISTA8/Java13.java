package JAVALISTA8;

import java.util.Scanner;

public class Java13

     {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int numero;
            int contador = 1;
            int multiplos = 0;

            do {
                System.out.println("Digite o " + contador + "º número:");
                numero = input.nextInt();

                if (numero % 4 == 0) {
                    multiplos++;
                }

                contador++;

            } while (contador <= 15);

            System.out.println("Total de múltiplos de 4: " + multiplos);

            input.close();
        }
    }

