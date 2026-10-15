package JAVALISTA8;

import java.util.Scanner;

public class Java12

    {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int limite;
            int numero = 1;

            System.out.println("Digite um número limite:");
            limite = input.nextInt();

            if (limite >= 1) {
                do {
                    if (numero % 3 == 0 | numero % 5 == 0) {
                        System.out.println("Sao multiplos de 3 e 5");
                        System.out.println(numero);
                    }
                    numero++;

                } while (numero <= limite);
            }

            input.close();
        }
    }

