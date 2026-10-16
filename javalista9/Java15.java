package javalista9;

import java.util.Scanner;

public class Java15 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int contador = 0;

            for (int i = 1; i <= 8; i++) {
                System.out.print("Digite o " + i + "º numero: ");
                int numero = sc.nextInt();

                if (numero > 50) {
                    contador++;
                }
            }

            System.out.println("Quantidade de numeros maiores que 50: " + contador);

            sc.close();
        }
    }

