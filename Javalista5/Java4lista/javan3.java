
import java.util.Scanner;

        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            double lado1, lado2, lado3;
            String tipo;

            System.out.println("Digite o primeiro lado:");
            lado1 = input.nextDouble();

            System.out.println("Digite o segundo lado:");
            lado2 = input.nextDouble();

            System.out.println("Digite o terceiro lado:");
            lado3 = input.nextDouble();

            tipo = (lado1 < lado2 + lado3 &&
                    lado2 < lado1 + lado3 &&
                    lado3 < lado1 + lado2)
                    ? ((lado1 == lado2 && lado2 == lado3)
                    ? "Equilátero"
                    : ((lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
                    ? "Isósceles"
                    : "Escaleno"))
                    : "Não forma um triângulo";

            System.out.println("Tipo de triângulo: " + tipo);
        }


