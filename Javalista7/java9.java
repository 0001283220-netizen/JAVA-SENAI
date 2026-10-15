package Javalista7;

import java.util.Scanner;

public class java9

    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int contador = 0;

            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();

            while (numero != 0) {
                if (numero >= 20 && numero <= 80) {
                    contador++;
                }

                System.out.print("Digite um número (0 para parar): ");
                numero = sc.nextInt();
            }

            System.out.println("Quantidade de valores entre 20 e 80: " + contador);

            sc.close();
        }
    }

