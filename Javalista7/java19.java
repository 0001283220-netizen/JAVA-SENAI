package Javalista7;

import java.util.Scanner;

public class java19

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
                if (numero > 100) {
                    soma += numero;
                    contador++;
                }

                System.out.print("Digite um número (0 para parar): ");
                numero = sc.nextInt();
            }

            if (contador > 0) {
                media = (double) soma / contador;
                System.out.println("Média dos números maiores que 100: " + media);
            } else {
                System.out.println("Nenhum número maior que 100 foi digitado.");
            }

            sc.close();
        }
    }

