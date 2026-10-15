package Javalista7;

import java.util.Scanner;

public class java16

     {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int contador = 0;

            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();

            while (numero != 0) {
                if (numero >= 10 && numero <= 50) {
                    contador++;
                }

                System.out.print("Digite um número (0 para parar): ");
                numero = sc.nextInt();
            }

            System.out.println("Quantidade de números entre 10 e 50: " + contador);

            sc.close();
        }
    }

