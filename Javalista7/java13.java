package Javalista7;

import java.util.Scanner;

public class java13

    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int contador = 0;
            int soma = 0;
            double media;

            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();

            while (numero != 0) {
                soma += numero;
                contador++;

                System.out.print("Digite um número (0 para parar): ");
                numero = sc.nextInt();
            }

            System.out.println("Quantidade de números digitados: " + contador);
            System.out.println("Soma total: " + soma);

            if (contador > 0) {
                media = (double) soma / contador;
                System.out.println("Média: " + media);
            } else {
                System.out.println("Não foi possível calcular a média.");
            }

            sc.close();
        }
    }

