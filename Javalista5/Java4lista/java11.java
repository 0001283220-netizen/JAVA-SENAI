package Java4lista;

import java.util.Scanner;

public class java11 {

        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            int numero;
            String resultado;

            System.out.println("Digite um número:");
            numero = input.nextInt();

            resultado = ((numero % 2 == 0 && numero < 100)
                    || (numero % 2 != 0 && numero > 100))
                    ? "O número atende à condição."
                    : "O número não atende à condição.";

            System.out.println(resultado);
        }
    }

