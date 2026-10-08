package Javalista6;

import java.util.Scanner;

public class java13 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int numero;
            int contador = 0;
            int negativos = 0;

            while (contador < 10) {
                System.out.print("Digite o " + (contador + 1) + "º número: ");
                numero = input.nextInt();

                if (numero < 0) {
                    negativos++;
                }

                contador++;
            }

            System.out.println("Quantidade de números negativos: " + negativos);

            input.close();
        }
    }

