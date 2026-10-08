package Java4lista;

import java.util.Scanner;

public class java5 {


        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            double numero;
            String resultado;

            System.out.println("Digite um número:");
            numero = input.nextDouble();

            resultado = (numero >= 100 && numero <= 200)
                    ? "O número está entre 100 e 200."
                    : (numero < 100)
                    ? "O número é menor que o intervalo."
                    : "O número é maior que o intervalo.";

            System.out.println(resultado);
        }
    }

