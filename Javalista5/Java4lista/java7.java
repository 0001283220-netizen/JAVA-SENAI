package Java4lista;

import java.util.Scanner;

public class java7 {
        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            int numero;
            String resultado;

            System.out.println("Digite um número:");
            numero = input.nextInt();

            resultado = (numero % 7 == 0 || numero % 11 == 0)
                    ? "É múltiplo de 7 ou de 11."
                    : "Não é múltiplo de 7 nem de 11.";

            System.out.println(resultado);
        }
    }

