package Java4lista;

import java.util.Scanner;

public class javan2 {
        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            double lado1, lado2, lado3;
            String resultado;

            System.out.println("Digite o primeiro lado:");
            lado1 = input.nextDouble();

            System.out.println("Digite o segundo lado:");
            lado2 = input.nextDouble();

            System.out.println("Digite o terceiro lado:");
            lado3 = input.nextDouble();

            resultado = (lado1 < lado2 + lado3 &&
                    lado2 < lado1 + lado3 &&
                    lado3 < lado1 + lado2)
                    ? "Os lados podem formar um triângulo."
                    : "Os lados não podem formar um triângulo.";

            System.out.println(resultado);
        }
    }

