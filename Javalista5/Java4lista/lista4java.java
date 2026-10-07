package Java4lista;

import java.util.Scanner;

public class lista4java {
            private static Scanner input = new Scanner(System.in);

            public static void main(String[] args) {
                double numero1, numero2, numero3, maior;

                System.out.println("Digite o primeiro número:");
                numero1 = input.nextDouble();

                System.out.println("Digite o segundo número:");
                numero2 = input.nextDouble();

                System.out.println("Digite o terceiro número:");
                numero3 = input.nextDouble();

                maior = (numero1 > numero2)
                        ? ((numero1 > numero3) ? numero1 : numero3)
                        : ((numero2 > numero3) ? numero2 : numero3);

                System.out.println("O maior número é: " + maior);
            }
        }

