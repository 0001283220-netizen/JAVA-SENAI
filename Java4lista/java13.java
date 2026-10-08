package Java4lista;

import java.util.Scanner;

public class java13 {

        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            int numero, primeiros, ultimos;
            String resultado;

            System.out.println("Digite um número de 4 dígitos:");
            numero = input.nextInt();

            primeiros = numero / 100;
            ultimos = numero % 100;

            resultado = (numero >= 1000 && numero <= 9999
                    && (primeiros + ultimos) * (primeiros + ultimos) == numero)
                    ? "É um Número Mágico!"
                    : "Não é um Número Mágico.";

            System.out.println(resultado);
        }
    }

